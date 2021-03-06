package com.hand.hqm.hqm_supp_item_exemption.dto;

import java.util.Date;

/**Auto Generated By Hap Code Generator**/
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.persistence.Transient;

import org.hibernate.validator.constraints.Length;

import com.hand.hap.mybatis.annotation.ExtensionAttribute;
import com.hand.hap.system.dto.BaseDTO;

@ExtensionAttribute(disable = true)
@Table(name = "HQM_SUPP_ITEM_EXEMPTION")
public class SuppItemExemption extends BaseDTO {

	public static final String FIELD_EXEMPTION_ID = "exemptionId";
	public static final String FIELD_PLANT_ID = "plantId";
	public static final String FIELD_ITEM_ID = "itemId";
	public static final String FIELD_SUPPLIER_ID = "supplierId";
	public static final String FIELD_SUPPLIER_SITE_ID = "supplierSiteId";
	public static final String FIELD_EXEMPTION_TIME_FROM = "exemptionTimeFrom";
	public static final String FIELD_EXEMPTION_TIME_TO = "exemptionTimeTo";
	public static final String FIELD_EXEMPTION_FLAG = "exemptionFlag";
	public static final String FIELD_ENABLE_FLAG = "enableFlag";
	public static final String FIELD_REMARK = "remark";
	public static final String FIELD_GLOBAL_ATTRIBUTE1 = "globalAttribute1";
	public static final String FIELD_GLOBAL_ATTRIBUTE2 = "globalAttribute2";
	public static final String FIELD_GLOBAL_ATTRIBUTE3 = "globalAttribute3";
	public static final String FIELD_GLOBAL_ATTRIBUTE4 = "globalAttribute4";
	public static final String FIELD_GLOBAL_ATTRIBUTE5 = "globalAttribute5";
	public static final String FIELD_GLOBAL_ATTRIBUTE6 = "globalAttribute6";
	public static final String FIELD_GLOBAL_ATTRIBUTE7 = "globalAttribute7";
	public static final String FIELD_GLOBAL_ATTRIBUTE8 = "globalAttribute8";
	public static final String FIELD_GLOBAL_ATTRIBUTE9 = "globalAttribute9";
	public static final String FIELD_GLOBAL_ATTRIBUTE10 = "globalAttribute10";

	@Id
	@GeneratedValue
	private Float exemptionId;

	private Float plantId;

	private Float itemId;

	private Float supplierId;

	private Float supplierSiteId;

	private Date exemptionTimeFrom;

	private Date exemptionTimeTo;

	@Transient
	private String itemCode;
	@Transient

	private String itemDescription;
	@Transient

	private String supplierName;
	@Transient
	private String plantCode;

	@Transient
	private String siteDescription;// 供应商地点

	public String getItemDescription() {
		return itemDescription;
	}

	public void setItemDescription(String itemDescription) {
		this.itemDescription = itemDescription;
	}

	public String getSupplierName() {
		return supplierName;
	}

	public void setSupplierName(String supplierName) {
		this.supplierName = supplierName;
	}

	public String getPlantCode() {
		return plantCode;
	}

	public void setPlantCode(String plantCode) {
		this.plantCode = plantCode;
	}

	public String getSupplierCode() {
		return supplierCode;
	}

	public void setSupplierCode(String supplierCode) {
		this.supplierCode = supplierCode;
	}

	public String getSupplierSiteCode() {
		return supplierSiteCode;
	}

	public void setSupplierSiteCode(String supplierSiteCode) {
		this.supplierSiteCode = supplierSiteCode;
	}

	@Transient
	private String supplierCode;
	@Transient
	private String supplierSiteCode;
	@Transient
	private String itemCategory;

	public String getItemCategory() {
		return itemCategory;
	}

	public void setItemCategory(String itemCategory) {
		this.itemCategory = itemCategory;
	}

	@Length(max = 30)
	private String exemptionFlag;

	@Length(max = 30)
	private String enableFlag;

	@Length(max = 200)
	private String remark;

	@Length(max = 150)
	private String globalAttribute1;

	@Length(max = 150)
	private String globalAttribute2;

	@Length(max = 150)
	private String globalAttribute3;

	@Length(max = 150)
	private String globalAttribute4;

	@Length(max = 150)
	private String globalAttribute5;

	@Length(max = 150)
	private String globalAttribute6;

	@Length(max = 150)
	private String globalAttribute7;

	@Length(max = 150)
	private String globalAttribute8;

	@Length(max = 150)
	private String globalAttribute9;

	@Length(max = 150)
	private String globalAttribute10;

	public void setExemptionId(Float exemptionId) {
		this.exemptionId = exemptionId;
	}

	public Float getExemptionId() {
		return exemptionId;
	}

	public void setPlantId(Float plantId) {
		this.plantId = plantId;
	}

	public Float getPlantId() {
		return plantId;
	}

	public void setItemId(Float itemId) {
		this.itemId = itemId;
	}

	public Float getItemId() {
		return itemId;
	}

	public void setSupplierId(Float supplierId) {
		this.supplierId = supplierId;
	}

	public Float getSupplierId() {
		return supplierId;
	}

	public void setSupplierSiteId(Float supplierSiteId) {
		this.supplierSiteId = supplierSiteId;
	}

	public Float getSupplierSiteId() {
		return supplierSiteId;
	}

	public void setExemptionTimeFrom(Date exemptionTimeFrom) {
		this.exemptionTimeFrom = exemptionTimeFrom;
	}

	public Date getExemptionTimeFrom() {
		return exemptionTimeFrom;
	}

	public void setExemptionTimeTo(Date exemptionTimeTo) {
		this.exemptionTimeTo = exemptionTimeTo;
	}

	public Date getExemptionTimeTo() {
		return exemptionTimeTo;
	}

	public void setExemptionFlag(String exemptionFlag) {
		this.exemptionFlag = exemptionFlag;
	}

	public String getExemptionFlag() {
		return exemptionFlag;
	}

	public void setEnableFlag(String enableFlag) {
		this.enableFlag = enableFlag;
	}

	public String getEnableFlag() {
		return enableFlag;
	}

	public void setRemark(String remark) {
		this.remark = remark;
	}

	public String getRemark() {
		return remark;
	}

	public void setGlobalAttribute1(String globalAttribute1) {
		this.globalAttribute1 = globalAttribute1;
	}

	public String getGlobalAttribute1() {
		return globalAttribute1;
	}

	public void setGlobalAttribute2(String globalAttribute2) {
		this.globalAttribute2 = globalAttribute2;
	}

	public String getGlobalAttribute2() {
		return globalAttribute2;
	}

	public void setGlobalAttribute3(String globalAttribute3) {
		this.globalAttribute3 = globalAttribute3;
	}

	public String getGlobalAttribute3() {
		return globalAttribute3;
	}

	public void setGlobalAttribute4(String globalAttribute4) {
		this.globalAttribute4 = globalAttribute4;
	}

	public String getGlobalAttribute4() {
		return globalAttribute4;
	}

	public void setGlobalAttribute5(String globalAttribute5) {
		this.globalAttribute5 = globalAttribute5;
	}

	public String getGlobalAttribute5() {
		return globalAttribute5;
	}

	public void setGlobalAttribute6(String globalAttribute6) {
		this.globalAttribute6 = globalAttribute6;
	}

	public String getGlobalAttribute6() {
		return globalAttribute6;
	}

	public void setGlobalAttribute7(String globalAttribute7) {
		this.globalAttribute7 = globalAttribute7;
	}

	public String getGlobalAttribute7() {
		return globalAttribute7;
	}

	public void setGlobalAttribute8(String globalAttribute8) {
		this.globalAttribute8 = globalAttribute8;
	}

	public String getGlobalAttribute8() {
		return globalAttribute8;
	}

	public void setGlobalAttribute9(String globalAttribute9) {
		this.globalAttribute9 = globalAttribute9;
	}

	public String getGlobalAttribute9() {
		return globalAttribute9;
	}

	public void setGlobalAttribute10(String globalAttribute10) {
		this.globalAttribute10 = globalAttribute10;
	}

	public String getGlobalAttribute10() {
		return globalAttribute10;
	}

	public String getItemCode() {
		return itemCode;
	}

	public void setItemCode(String itemCode) {
		this.itemCode = itemCode;
	}

	public String getSiteDescription() {
		return siteDescription;
	}

	public void setSiteDescription(String siteDescription) {
		this.siteDescription = siteDescription;
	}

}
