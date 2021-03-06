package com.hand.hqm.hqm_nonconforming_order.dto;

/**Auto Generated By Hap Code Generator**/
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import com.hand.hap.mybatis.annotation.ExtensionAttribute;
import org.hibernate.validator.constraints.Length;
import org.springframework.format.annotation.DateTimeFormat;

import javax.persistence.Table;
import javax.persistence.Transient;

import com.hand.hap.system.dto.BaseDTO;
import java.util.Date;

@ExtensionAttribute(disable = true)
@Table(name = "HQM_NONCONFORMING_ORDER")
public class NonconformingOrder extends BaseDTO {

	/**
	*
	*/
	private static final long serialVersionUID = 8351612302330459211L;

	@Id
	@GeneratedValue
	private Float noId;

	@Length(max = 30)
	private String noNum;

	@Length(max = 30)
	private String inspectionType;

	@Length(max = 300)
	private String sourceOrder;

	private Float inspectionId;

	private Float plantId;

	private Float itemId;

	private Float supplierId;

	private Float ngGroupId;

	private Float ngMenberId;

	@Length(max = 1000)
	private String nonconformingDesc;

	@Length(max = 90)
	private String noSourceType;

	@Length(max = 30)
	private String noStatus;

	@Length(max = 30)
	private String dealMethod;

	@DateTimeFormat(pattern = "yyyy-MM-dd HH:mm:ss")
	private Date dealDate;

	@Transient
	@DateTimeFormat(pattern = "yyyy-MM-dd HH:mm:ss")
	private Date dealDateBegin;

	@Transient
	@DateTimeFormat(pattern = "yyyy-MM-dd HH:mm:ss")
	private Date dealDateEnd;

	@Length(max = 100)
	private String productionBatch;

	@DateTimeFormat(pattern = "yyyy-MM-dd HH:mm:ss")
	private Date receiveDate;

	private Float totalityQty;

	private Float nonconformingQty;

	private Float sampleSize;

	@Length(max = 30)
	private String nonconformingRate;

	@DateTimeFormat(pattern = "yyyy-MM-dd HH:mm:ss")
	private Date inspectionDate;

	@Transient
	@DateTimeFormat(pattern = "yyyy-MM-dd HH:mm:ss")
	private Date inspectionDateBegin;

	@Transient
	@DateTimeFormat(pattern = "yyyy-MM-dd HH:mm:ss")
	private Date inspectionDateEnd;

	@Transient
	private String topIssueSourceType;

	@Length(max = 1000)
	private String approvalDepartment1;

	@Length(max = 1000)
	private String approvalDepartment2;

	@Length(max = 1000)
	private String approvalOpinion;

	private Float approvalId;

	@Transient
	private Float approvalName;

	@Length(max = 200)
	private String remark;

	private Float standardOpId;

	@Transient
	private String plantCode;

	@Transient
	private String ngCode;

	@Transient
	private String inspectionCode;

	private String issueSourceType;
	
	 @Length(max = 64)
     private String processInstanceId;

	private String issueType;

	@Transient
	private String ngAppearance;

	@Transient
	private String ngReason;

	@Transient
	private String ngGroupCode;

	@Transient
	private String ngGroupName;

	@Transient
	private String userName;

	@Transient
	private String itemDescriptions;

	@Transient
	private String supplierName;

	@Transient
	private String supplierCode;

	@Transient
	private String itemCode;

	private String reworkType;
	
	private String recheckSampleWay;//抽样比例
	
	public String getRecheckSampleWay() {
		return recheckSampleWay;
	}

	public void setRecheckSampleWay(String recheckSampleWay) {
		this.recheckSampleWay = recheckSampleWay;
	}

	public String getReworkType() {
		return reworkType;
	}

	public void setReworkType(String reworkType) {
		this.reworkType = reworkType;
	}

	public String getTopIssueSourceType() {
		return topIssueSourceType;
	}

	public void setTopIssueSourceType(String topIssueSourceType) {
		this.topIssueSourceType = topIssueSourceType;
	}

	public Float getNgGroupId() {
		return ngGroupId;
	}

	public void setNgGroupId(Float ngGroupId) {
		this.ngGroupId = ngGroupId;
	}

	public Float getNgMenberId() {
		return ngMenberId;
	}

	public void setNgMenberId(Float ngMenberId) {
		this.ngMenberId = ngMenberId;
	}

	public Date getDealDateBegin() {
		return dealDateBegin;
	}

	public void setDealDateBegin(Date dealDateBegin) {
		this.dealDateBegin = dealDateBegin;
	}

	public Date getDealDateEnd() {
		return dealDateEnd;
	}

	public void setDealDateEnd(Date dealDateEnd) {
		this.dealDateEnd = dealDateEnd;
	}

	public Date getInspectionDateBegin() {
		return inspectionDateBegin;
	}

	public void setInspectionDateBegin(Date inspectionDateBegin) {
		this.inspectionDateBegin = inspectionDateBegin;
	}

	public Date getInspectionDateEnd() {
		return inspectionDateEnd;
	}

	public void setInspectionDateEnd(Date inspectionDateEnd) {
		this.inspectionDateEnd = inspectionDateEnd;
	}

	public Float getApprovalName() {
		return approvalName;
	}

	public void setApprovalName(Float approvalName) {
		this.approvalName = approvalName;
	}

	public String getIssueSourceType() {
		return issueSourceType;
	}

	public void setIssueSourceType(String issueSourceType) {
		this.issueSourceType = issueSourceType;
	}

	public String getIssueType() {
		return issueType;
	}

	public void setIssueType(String issueType) {
		this.issueType = issueType;
	}

	public static long getSerialversionuid() {
		return serialVersionUID;
	}

	public String getInspectionCode() {
		return inspectionCode;
	}

	public void setInspectionCode(String inspectionCode) {
		this.inspectionCode = inspectionCode;
	}

	public String getNgCode() {
		return ngCode;
	}

	public void setNgCode(String ngCode) {
		this.ngCode = ngCode;
	}

	public String getNgAppearance() {
		return ngAppearance;
	}

	public void setNgAppearance(String ngAppearance) {
		this.ngAppearance = ngAppearance;
	}

	public String getNgReason() {
		return ngReason;
	}

	public void setNgReason(String ngReason) {
		this.ngReason = ngReason;
	}

	public String getNgGroupCode() {
		return ngGroupCode;
	}

	public void setNgGroupCode(String ngGroupCode) {
		this.ngGroupCode = ngGroupCode;
	}

	public String getNgGroupName() {
		return ngGroupName;
	}

	public void setNgGroupName(String ngGroupName) {
		this.ngGroupName = ngGroupName;
	}

	public String getPlantCode() {
		return plantCode;
	}

	public void setPlantCode(String plantCode) {
		this.plantCode = plantCode;
	}

	public String getItemDescriptions() {
		return itemDescriptions;
	}

	public void setItemDescriptions(String itemDescriptions) {
		this.itemDescriptions = itemDescriptions;
	}

	public String getUserName() {
		return userName;
	}

	public void setUserName(String userName) {
		this.userName = userName;
	}

	public String getSupplierName() {
		return supplierName;
	}

	public void setSupplierName(String supplierName) {
		this.supplierName = supplierName;
	}

	public String getSupplierCode() {
		return supplierCode;
	}

	public void setSupplierCode(String supplierCode) {
		this.supplierCode = supplierCode;
	}

	public String getItemCode() {
		return itemCode;
	}

	public void setItemCode(String itemCode) {
		this.itemCode = itemCode;
	}

	public void setNoId(Float noId) {
		this.noId = noId;
	}

	public Float getNoId() {
		return noId;
	}

	public void setNoNum(String noNum) {
		this.noNum = noNum;
	}

	public String getNoNum() {
		return noNum;
	}

	public void setInspectionType(String inspectionType) {
		this.inspectionType = inspectionType;
	}

	public String getInspectionType() {
		return inspectionType;
	}

	public void setSourceOrder(String sourceOrder) {
		this.sourceOrder = sourceOrder;
	}

	public String getSourceOrder() {
		return sourceOrder;
	}

	public void setInspectionId(Float inspectionId) {
		this.inspectionId = inspectionId;
	}

	public Float getInspectionId() {
		return inspectionId;
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

	public void setNonconformingDesc(String nonconformingDesc) {
		this.nonconformingDesc = nonconformingDesc;
	}

	public String getNonconformingDesc() {
		return nonconformingDesc;
	}

	public void setNoSourceType(String noSourceType) {
		this.noSourceType = noSourceType;
	}

	public String getNoSourceType() {
		return noSourceType;
	}

	public void setNoStatus(String noStatus) {
		this.noStatus = noStatus;
	}

	public String getNoStatus() {
		return noStatus;
	}

	public void setDealMethod(String dealMethod) {
		this.dealMethod = dealMethod;
	}

	public String getDealMethod() {
		return dealMethod;
	}

	public void setDealDate(Date dealDate) {
		this.dealDate = dealDate;
	}

	public Date getDealDate() {
		return dealDate;
	}

	public void setProductionBatch(String productionBatch) {
		this.productionBatch = productionBatch;
	}

	public String getProductionBatch() {
		return productionBatch;
	}

	public void setReceiveDate(Date receiveDate) {
		this.receiveDate = receiveDate;
	}

	public Date getReceiveDate() {
		return receiveDate;
	}

	public void setTotalityQty(Float totalityQty) {
		this.totalityQty = totalityQty;
	}

	public Float getTotalityQty() {
		return totalityQty;
	}

	public void setNonconformingQty(Float nonconformingQty) {
		this.nonconformingQty = nonconformingQty;
	}

	public Float getNonconformingQty() {
		return nonconformingQty;
	}

	public void setSampleSize(Float sampleSize) {
		this.sampleSize = sampleSize;
	}

	public Float getSampleSize() {
		return sampleSize;
	}

	public void setNonconformingRate(String nonconformingRate) {
		this.nonconformingRate = nonconformingRate;
	}

	public String getNonconformingRate() {
		return nonconformingRate;
	}

	public void setInspectionDate(Date inspectionDate) {
		this.inspectionDate = inspectionDate;
	}

	public Date getInspectionDate() {
		return inspectionDate;
	}

	public void setApprovalDepartment1(String approvalDepartment1) {
		this.approvalDepartment1 = approvalDepartment1;
	}

	public String getApprovalDepartment1() {
		return approvalDepartment1;
	}

	public void setApprovalDepartment2(String approvalDepartment2) {
		this.approvalDepartment2 = approvalDepartment2;
	}

	public String getApprovalDepartment2() {
		return approvalDepartment2;
	}

	public void setApprovalOpinion(String approvalOpinion) {
		this.approvalOpinion = approvalOpinion;
	}

	public String getApprovalOpinion() {
		return approvalOpinion;
	}

	public void setApprovalId(Float approvalId) {
		this.approvalId = approvalId;
	}

	public Float getApprovalId() {
		return approvalId;
	}

	public void setRemark(String remark) {
		this.remark = remark;
	}

	public String getRemark() {
		return remark;
	}

	public void setStandardOpId(Float standardOpId) {
		this.standardOpId = standardOpId;
	}

	public Float getStandardOpId() {
		return standardOpId;
	}

	public String getProcessInstanceId() {
		return processInstanceId;
	}

	public void setProcessInstanceId(String processInstanceId) {
		this.processInstanceId = processInstanceId;
	}

	
}
