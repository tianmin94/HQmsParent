${'<#include "../include/header.html">'}

<style>
	div[role=tooltip].k-tooltip{
		padding: 2px;
		background: #5c9acf;
	}
	.k-tooltip-content{
		padding: 4px;
		text-align: left;
		background: #fff;
		color: #666;
	}
	.k-callout {
		border-bottom-color: #5c9acf;
	}
</style>
<script type="text/javascript">
    var viewModel = Hap.createGridViewModel("#grid");
    var toolTipOpt = {
        		show: function(e){
        			if($.trim(this.content.text()) !=""){
        				$('[role="tooltip"]').css("visibility", "visible");
        			}
        		},
        		hide: function(){
        			$('[role="tooltip"]').css("visibility", "hidden");
        		},
        		filter: "td:nth-child(n+3)",
        		content: function(e){
        			var element = e.target[0];
        			if(element.offsetWidth < element.scrollWidth){
        				var text = $(e.target).text();
        				return '<div style="min-width:100px;max-width: 1000px;">' + text + '</div>';
        			}else{//解决鼠标一开始放在上面出现空模块
        				$('[role="tooltip"]').css("visibility", "hidden");
        				return "";
        			}
        		}
        };
</script>

${'<body>'}

<div id="page-content">
    <div class="pull-left" id="toolbar-btn" style="padding-bottom:10px;">
        <span id="addButton" class="btn btn-primary k-grid-add" style="float:left;margin-right:5px;" data-bind="click:create">${'<@spring.message "hap.new"/>'}</span>
        <span id="changeButton" class="btn btn-success k-grid-save-changes" data-bind="click:save" style="float:left;margin-right:5px;">${'<@spring.message "hap.save"/>'}</span>
        <span id="removeButton" data-bind="click:remove" class="btn btn-danger" style="float:left;">${'<@spring.message "hap.delete"/>'}</span>
    </div>
    <script>kendo.bind($('#toolbar-btn'), viewModel);</script>
    <div id="queryPanel" class="pull-right" style="padding-bottom:10px;">
    	<div class="k-query-simple" id="query-form">
             <#list columnsInfo as infos>
        	<#if infos.tableColumnsName?ends_with("Code")||infos.tableColumnsName?ends_with("Name")||infos.tableColumnsName?ends_with("Type")>
            <input type="text" data-role="maskedtextbox" style="float:left;width:150px;margin-right:5px;" placeholder='${'<@spring.message '}"${dtoName}.${infos.tableColumnsName}"/>'
                   data-bind="value:model.${infos.tableColumnsName}" class="k-textbox">
        	</#if>
    		</#list>
        </div>
        <script>kendo.bind($('#query-form'), viewModel);</script>
        <div class="k-query-detail" id="query-form2">
            <div class="rows" style="margin-top:5px">
               <#list columnsInfo as infos>
        	<#if infos.tableColumnsName?ends_with("Code")||infos.tableColumnsName?ends_with("Name")||infos.tableColumnsName?ends_with("Type")>
            <input type="text" data-role="maskedtextbox" style="float:left;width:150px;margin-right:5px;" placeholder='${'<@spring.message '}"${dtoName}.${infos.tableColumnsName}"/>'
                   data-bind="value:model.${infos.tableColumnsName}" class="k-textbox">
        	</#if>
    			</#list>
            </div>
        </div>
        <script>kendo.bind($('#query-form2'), viewModel);</script>
    <#--</#list>
        <#list 1..4 as i>
            <input type="text"  data-role="maskedtextbox" style="float:left;width:150px;margin-right:5px;" placeholder='${'<@spring.message '}"${dtoName}.${columnsInfo[i].tableColumnsName}"/>' data-bind="value:model.${columnsInfo[i].tableColumnsName}" class="k-textbox">
        </#list>-->
    </div>
    <script>
    kendo.bind($('#query-form'), viewModel);
    $('#queryPanel').kendoQueryPanel({
        queryFunction: function () {
            viewModel.query();
        },
        resetFunction: function () {
            viewModel.reset();
        }
    });
    </script>
    <div style="clear:both">
        <div id="grid"></div>
    </div>
</div>

<script>
    Hap.initEnterQuery('#query-form', viewModel.query);
    var BaseUrl = _basePath;
    dataSource = new kendo.data.DataSource({
        transport: {
            read: {
                url: BaseUrl + "${queryUrl}",
                type: "POST",
                dataType: "json"
            },
            update: {
                url: BaseUrl + "${submitUrl}",
                type: "POST",
                contentType: "application/json"
            },
            destroy: {
                url: BaseUrl + "${removeUrl}",
                type: "POST",
                contentType: "application/json"
            },
            create: {
                url: BaseUrl + "${submitUrl}",
                type: "POST",
                contentType: "application/json"
            },
            parameterMap: function (options, type) {
                if (type !== "read" && options.models) {
                    var datas = Hap.prepareSubmitParameter(options, type)
                    return kendo.stringify(datas);
                } else if (type === "read") {
                    return Hap.prepareQueryParameter(viewModel.model.toJSON(), options)
                }
            }
        },
        batch: true,
        serverPaging: true,
        pageSize: 20,
        schema: {
            data: 'rows',
            total: 'total',
            model: {
                id: "${columnsInfo[0].tableColumnsName}",
                fields: {}
            }
        }
    });

</script>

<script>
	$("#grid").kendoTooltip(toolTipOpt).data("kendoTooltip");
    var grid = $("#grid").kendoGrid({
        dataSource: dataSource,
        resizable: true,
        scrollable: true,
        navigatable: false,
        sortable:true,
        selectable: 'multiple, rowbox',
        dataBound: function () {
            if (parent.autoResizeIframe) {
                parent.autoResizeIframe('${'$'}{RequestParameters.functionCode!}')
            }
        },
        pageable: {
            pageSizes: [5, 10, 20, 50],
            refresh: true,
            buttonCount: 5
        },
        columns: [
        <#list columnsInfo as infos>
            {
                field: "${infos.tableColumnsName}",
                title: '${'<@spring.message'} "${dtoName?lower_case}.${infos.tableColumnsName?lower_case}"/>',
                width: 120,
                attributes:{style:"white-space:nowrap;text-overflow:ellipsis;"}
            },
        </#list>],
        editable: true
    }).data("kendoGrid");
	Hap.autoResizeGrid("#grid");
</script>
${'</body>'}
${'</html>'}