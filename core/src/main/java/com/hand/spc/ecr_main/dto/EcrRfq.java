package com.hand.spc.ecr_main.dto;

/**Auto Generated By Hap Code Generator**/
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import com.hand.hap.mybatis.annotation.ExtensionAttribute;
import org.hibernate.validator.constraints.Length;
import javax.persistence.Table;
import javax.persistence.Transient;

import com.hand.hap.system.dto.BaseDTO;
import java.util.Date;
@ExtensionAttribute(disable=true)
@Table(name = "HPM_ECR_RFQ")
public class EcrRfq extends BaseDTO {

     public static final String FIELD_RFQ_ID = "rfqId";
     public static final String FIELD_ECRNO = "ecrno";
     public static final String FIELD_LAB_REQNO = "labReqno";
     public static final String FIELD_PCI_TITLE = "pciTitle";
     public static final String FIELD_PCI_TEST_REPORT = "pciTestReport";
     public static final String FIELD_CONCLUSION = "conclusion";
     public static final String FIELD_RFQ_SEQ = "rfqSeq";
     public static final String FIELD_STATUS = "status";
     public static final String FIELD_DUTYBY = "dutyby";
     public static final String FIELD_ASK_FINISHED_DATE = "askFinishedDate";
     public static final String FIELD_PLAN_FINISHED_DATE = "planFinishedDate";
     public static final String FIELD_ACT_FINISHED_DATE = "actFinishedDate";
     public static final String FIELD_ITEM_ID = "itemId";
     public static final String FIELD_PRICE_UNIT = "priceUnit";
     public static final String FIELD_UNIT_PRICE = "unitPrice";
     public static final String FIELD_UOM = "uom";


     @Id
     @GeneratedValue
     private Long rfqId;

     @Length(max = 80)
     private String ecrno;

     @Length(max = 100)
     private String labReqno;

     @Length(max = 200)
     private String pciTitle;

     @Length(max = 500)
     private String pciTestReport;

     @Length(max = 10)
     private String conclusion;

     private Long rfqSeq;

     @Length(max = 10)
     private String status;

     // 任务负责人
     @Length(max = 30)
     private String dutyby;

     // 要求完成时间
     private Date askFinishedDate;

     // 计划完成时间
     private Date planFinishedDate;

     // 实际完成时间
     private Date actFinishedDate;

     private String itemId;

     private Double priceUnit;

     private Double unitPrice;

     @Length(max = 30)
     private String uom;
     
     // 物料号 code
     @Transient
     private String skuCode;
     
     
     // 物料描述
     @Transient
     private String descriptions;
     
     
     // 任务类型
     @Transient
     private String taskType;
     
     
     // 次序（QTP/ VTP接口 / RFQ报价）
     @Transient
     private Long taskSeq;
     
     
     // 是否要做（QTP/ VTP接口 / RFQ报价）
     @Transient
     private String isNeed;
     
     
     // 当前版本(技术)
     @Transient
     private String currentVersion;
     
     
     // 是否需要修改(技术)
     @Transient
     private String editFlag;
     
     
     // ECR 后版本 (技术)
     @Transient
     private String newVersion;
     
     
     // 任务状态
     @Transient
     private String taskStatus;
     
     // 主键
     @Transient
     private Long id;
     
 
	public Long getRfqId() {
		return rfqId;
	}

	public void setRfqId(Long rfqId) {
		this.rfqId = rfqId;
	}

	public String getEcrno() {
		return ecrno;
	}

	public void setEcrno(String ecrno) {
		this.ecrno = ecrno;
	}

	public String getLabReqno() {
		return labReqno;
	}

	public void setLabReqno(String labReqno) {
		this.labReqno = labReqno;
	}

	public String getPciTitle() {
		return pciTitle;
	}

	public void setPciTitle(String pciTitle) {
		this.pciTitle = pciTitle;
	}

	public String getPciTestReport() {
		return pciTestReport;
	}

	public void setPciTestReport(String pciTestReport) {
		this.pciTestReport = pciTestReport;
	}

	public String getConclusion() {
		return conclusion;
	}

	public void setConclusion(String conclusion) {
		this.conclusion = conclusion;
	}

	public Long getRfqSeq() {
		return rfqSeq;
	}

	public void setRfqSeq(Long rfqSeq) {
		this.rfqSeq = rfqSeq;
	}

	public String getStatus() {
		return status;
	}

	public void setStatus(String status) {
		this.status = status;
	}

	public String getDutyby() {
		return dutyby;
	}

	public void setDutyby(String dutyby) {
		this.dutyby = dutyby;
	}

	public Date getAskFinishedDate() {
		return askFinishedDate;
	}

	public void setAskFinishedDate(Date askFinishedDate) {
		this.askFinishedDate = askFinishedDate;
	}

	public Date getPlanFinishedDate() {
		return planFinishedDate;
	}

	public void setPlanFinishedDate(Date planFinishedDate) {
		this.planFinishedDate = planFinishedDate;
	}

	public Date getActFinishedDate() {
		return actFinishedDate;
	}

	public void setActFinishedDate(Date actFinishedDate) {
		this.actFinishedDate = actFinishedDate;
	}

	public String getItemId() {
		return itemId;
	}

	public void setItemId(String itemId) {
		this.itemId = itemId;
	}

	public Double getPriceUnit() {
		return priceUnit;
	}

	public void setPriceUnit(Double priceUnit) {
		this.priceUnit = priceUnit;
	}

	public Double getUnitPrice() {
		return unitPrice;
	}

	public void setUnitPrice(Double unitPrice) {
		this.unitPrice = unitPrice;
	}

	public String getUom() {
		return uom;
	}

	public void setUom(String uom) {
		this.uom = uom;
	}

	public String getSkuCode() {
		return skuCode;
	}

	public void setSkuCode(String skuCode) {
		this.skuCode = skuCode;
	}

	public String getDescriptions() {
		return descriptions;
	}

	public void setDescriptions(String descriptions) {
		this.descriptions = descriptions;
	}

	public String getTaskType() {
		return taskType;
	}

	public void setTaskType(String taskType) {
		this.taskType = taskType;
	}

	public Long getTaskSeq() {
		return taskSeq;
	}

	public void setTaskSeq(Long taskSeq) {
		this.taskSeq = taskSeq;
	}

	public String getIsNeed() {
		return isNeed;
	}

	public void setIsNeed(String isNeed) {
		this.isNeed = isNeed;
	}

	public String getCurrentVersion() {
		return currentVersion;
	}

	public void setCurrentVersion(String currentVersion) {
		this.currentVersion = currentVersion;
	}

	public String getEditFlag() {
		return editFlag;
	}

	public void setEditFlag(String editFlag) {
		this.editFlag = editFlag;
	}

	public String getNewVersion() {
		return newVersion;
	}

	public void setNewVersion(String newVersion) {
		this.newVersion = newVersion;
	}

	public String getTaskStatus() {
		return taskStatus;
	}

	public void setTaskStatus(String taskStatus) {
		this.taskStatus = taskStatus;
	}

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}




     }
