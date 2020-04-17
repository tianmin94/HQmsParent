package com.hand.dimension.hqm_dimension_order.dto;

/**Auto Generated By Hap Code Generator**/
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import com.hand.hap.mybatis.annotation.ExtensionAttribute;
import org.hibernate.validator.constraints.Length;
import javax.persistence.Table;
import javax.persistence.Transient;

import com.hand.hap.system.dto.BaseDTO;
import java.util.Date;

@ExtensionAttribute(disable = true)
@Table(name = "HQM_8D_ORDER")
public class DimensionOrder extends BaseDTO {

	@Id
	@GeneratedValue
	private Float orderId;

	private Float plantId;

	@Length(max = 200)
	private String orderTheme;

	@Length(max = 50)
	private String orderCode;

	@Length(max = 30)
	private String orderStatus;

	@Length(max = 30)
	private String orderProcess;
	
	private String orderType;

	private Date expectedCompleteTime;

	@Length(max = 30)
	private String sourceType;

	public String getOrderType() {
		return orderType;
	}

	public void setOrderType(String orderType) {
		this.orderType = orderType;
	}

	@Length(max = 300)
	private String sourceOrder;
	@Transient
	private String processDetail;
	@Transient
	private String plantCode;
	@Transient
	private Date createDate;
	@Transient
	private Date updateDate;
	@Transient
	private String memberName;
	@Transient
	private Float memberId;
	@Transient
	private String createName;
	@Transient
	private String orderProcessDes;
	@Transient
	private String detailUpdateDate;
	
	public String getProblemDescription() {
		return problemDescription;
	}

	public void setProblemDescription(String problemDescription) {
		this.problemDescription = problemDescription;
	}

	@Transient
	private String problemDescription;
	@Transient
	private String creationDateStart;
	@Transient
	private String creationDateEnd;
	@Transient
	private String lastUpdateDateStart;
	@Transient
	private String lastUpdateDateEnd;
	@Transient
	private Float entityId;
	
	@Transient
	private Float chartId;
	
	public Float getEntityId() {
		return entityId;
	}

	public void setEntityId(Float entityId) {
		this.entityId = entityId;
	}

	public Float getChartId() {
		return chartId;
	}

	public void setChartId(Float chartId) {
		this.chartId = chartId;
	}

	@Transient
	private Float createdByUserId;
	
	public Float getCreatedByUserId() {
		return createdByUserId;
	}

	public void setCreatedByUserId(Float createdByUserId) {
		this.createdByUserId = createdByUserId;
	}

	public String getCreationDateStart() {
		return creationDateStart;
	}

	public void setCreationDateStart(String creationDateStart) {
		this.creationDateStart = creationDateStart;
	}

	public String getCreationDateEnd() {
		return creationDateEnd;
	}

	public void setCreationDateEnd(String creationDateEnd) {
		this.creationDateEnd = creationDateEnd;
	}

	public String getLastUpdateDateStart() {
		return lastUpdateDateStart;
	}

	public void setLastUpdateDateStart(String lastUpdateDateStart) {
		this.lastUpdateDateStart = lastUpdateDateStart;
	}

	public String getLastUpdateDateEnd() {
		return lastUpdateDateEnd;
	}

	public void setLastUpdateDateEnd(String lastUpdateDateEnd) {
		this.lastUpdateDateEnd = lastUpdateDateEnd;
	}

	public String getDetailUpdateDate() {
		return detailUpdateDate;
	}

	public void setDetailUpdateDate(String detailUpdateDate) {
		this.detailUpdateDate = detailUpdateDate;
	}

	public String getOrderProcessDes() {
		return orderProcessDes;
	}

	public void setOrderProcessDes(String orderProcessDes) {
		this.orderProcessDes = orderProcessDes;
	}

	public String getCreateName() {
		return createName;
	}

	public void setCreateName(String createName) {
		this.createName = createName;
	}

	public String getPlantCode() {
		return plantCode;
	}

	public void setPlantCode(String plantCode) {
		this.plantCode = plantCode;
	}

	public String getProcessDetail() {
		return processDetail;
	}

	public void setProcessDetail(String processDetail) {
		this.processDetail = processDetail;
	}

	public Date getCreateDate() {
		return createDate;
	}

	public String getMemberName() {
		return memberName;
	}

	public void setMemberName(String memberName) {
		this.memberName = memberName;
	}

	public Float getMemberId() {
		return memberId;
	}

	public void setMemberId(Float memberId) {
		this.memberId = memberId;
	}

	public void setCreateDate(Date createDate) {
		this.createDate = createDate;
	}

	public Date getUpdateDate() {
		return updateDate;
	}

	public void setUpdateDate(Date updateDate) {
		this.updateDate = updateDate;
	}

	public void setOrderId(Float orderId) {
		this.orderId = orderId;
	}

	public Float getOrderId() {
		return orderId;
	}

	public void setPlantId(Float plantId) {
		this.plantId = plantId;
	}

	public Float getPlantId() {
		return plantId;
	}

	public void setOrderTheme(String orderTheme) {
		this.orderTheme = orderTheme;
	}

	public String getOrderTheme() {
		return orderTheme;
	}

	public void setOrderCode(String orderCode) {
		this.orderCode = orderCode;
	}

	public String getOrderCode() {
		return orderCode;
	}

	public void setOrderStatus(String orderStatus) {
		this.orderStatus = orderStatus;
	}

	public String getOrderStatus() {
		return orderStatus;
	}

	public void setOrderProcess(String orderProcess) {
		this.orderProcess = orderProcess;
	}

	public String getOrderProcess() {
		return orderProcess;
	}

	public void setExpectedCompleteTime(Date expectedCompleteTime) {
		this.expectedCompleteTime = expectedCompleteTime;
	}

	public Date getExpectedCompleteTime() {
		return expectedCompleteTime;
	}

	public void setSourceType(String sourceType) {
		this.sourceType = sourceType;
	}

	public String getSourceType() {
		return sourceType;
	}

	public void setSourceOrder(String sourceOrder) {
		this.sourceOrder = sourceOrder;
	}

	public String getSourceOrder() {
		return sourceOrder;
	}

}