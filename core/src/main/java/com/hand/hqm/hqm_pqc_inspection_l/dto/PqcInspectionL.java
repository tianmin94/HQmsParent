package com.hand.hqm.hqm_pqc_inspection_l.dto;

/**Auto Generated By Hap Code Generator**/
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

import com.fasterxml.jackson.annotation.JsonFormat;
import com.hand.hap.mybatis.annotation.ExtensionAttribute;
import org.hibernate.validator.constraints.Length;
import org.springframework.format.annotation.DateTimeFormat;

import javax.persistence.Table;
import javax.persistence.Transient;

import com.hand.hap.system.dto.BaseDTO;
import java.util.Date;

@ExtensionAttribute(disable = true)
@Table(name = "HQM_PQC_INSPECTION_L")
public class PqcInspectionL extends BaseDTO {

	@Id
	@GeneratedValue
	private Float lineId;

	private Float headerId;

	private Float standardOpId;

	private Float workstationId;

	@Length(max = 30)
	private String inspectionStatus;

	@Length(max = 100)
	private String itemId;

	@Length(max = 300)
	private String sourceOrder;

	private Float productionQty;
	
	@JsonFormat(pattern = "yyyy-MM-dd HH:mm:ss", timezone = "GMT+8")
	private Date inspectionDate;

	@Length(max = 30)
	private String inspectionResult;

	@Length(max = 200)
	private String remark;

	private String attributeType;
	
	@Transient
	private String standardOpCode;
	
	@Transient
	private String standardOpDes;
	
	@Transient
	private String itemCode;
	
	@Transient
	private String itemDescriptions;
	
	@Transient
	private String workstationCode;
	
	@Transient
	private String workstationDes;
	
	@Transient
	private Float plantId;
	
	@Transient
	private Float prodLineId;

	private Float passQuantity;
	
	private Float ngQuantity;
	
	private String detailStatus;
	
	public Float getPassQuantity() {
		return passQuantity;
	}

	public void setPassQuantity(Float passQuantity) {
		this.passQuantity = passQuantity;
	}

	public Float getNgQuantity() {
		return ngQuantity;
	}

	public void setNgQuantity(Float ngQuantity) {
		this.ngQuantity = ngQuantity;
	}

	public String getDetailStatus() {
		return detailStatus;
	}

	public void setDetailStatus(String detailStatus) {
		this.detailStatus = detailStatus;
	}

	public Float getPlantId() {
		return plantId;
	}

	public void setPlantId(Float plantId) {
		this.plantId = plantId;
	}

	public Float getProdLineId() {
		return prodLineId;
	}

	public void setProdLineId(Float prodLineId) {
		this.prodLineId = prodLineId;
	}

	// @Transient
//     private String workstationId;
	public String getStandardOpCode() {
		return standardOpCode;
	}

	public void setStandardOpCode(String standardOpCode) {
		this.standardOpCode = standardOpCode;
	}

	public String getStandardOpDes() {
		return standardOpDes;
	}

	public void setStandardOpDes(String standardOpDes) {
		this.standardOpDes = standardOpDes;
	}

	public String getItemCode() {
		return itemCode;
	}

	public void setItemCode(String itemCode) {
		this.itemCode = itemCode;
	}

	public String getItemDescriptions() {
		return itemDescriptions;
	}

	public void setItemDescriptions(String itemDescriptions) {
		this.itemDescriptions = itemDescriptions;
	}

	public String getWorkstationCode() {
		return workstationCode;
	}

	public void setWorkstationCode(String workstationCode) {
		this.workstationCode = workstationCode;
	}

	public String getWorkstationDes() {
		return workstationDes;
	}

	public void setWorkstationDes(String workstationDes) {
		this.workstationDes = workstationDes;
	}

	public String getAttributeType() {
		return attributeType;
	}

	public void setAttributeType(String attributeType) {
		this.attributeType = attributeType;
	}

	public void setLineId(Float lineId) {
		this.lineId = lineId;
	}

	public Float getLineId() {
		return lineId;
	}

	public void setHeaderId(Float headerId) {
		this.headerId = headerId;
	}

	public Float getHeaderId() {
		return headerId;
	}

	public void setStandardOpId(Float standardOpId) {
		this.standardOpId = standardOpId;
	}

	public Float getStandardOpId() {
		return standardOpId;
	}

	public void setWorkstationId(Float workstationId) {
		this.workstationId = workstationId;
	}

	public Float getWorkstationId() {
		return workstationId;
	}

	public void setInspectionStatus(String inspectionStatus) {
		this.inspectionStatus = inspectionStatus;
	}

	public String getInspectionStatus() {
		return inspectionStatus;
	}

	public void setItemId(String itemId) {
		this.itemId = itemId;
	}

	public String getItemId() {
		return itemId;
	}

	public void setSourceOrder(String sourceOrder) {
		this.sourceOrder = sourceOrder;
	}

	public String getSourceOrder() {
		return sourceOrder;
	}

	public void setProductionQty(Float productionQty) {
		this.productionQty = productionQty;
	}

	public Float getProductionQty() {
		return productionQty;
	}

	public void setInspectionDate(Date inspectionDate) {
		this.inspectionDate = inspectionDate;
	}

	public Date getInspectionDate() {
		return inspectionDate;
	}

	public void setInspectionResult(String inspectionResult) {
		this.inspectionResult = inspectionResult;
	}

	public String getInspectionResult() {
		return inspectionResult;
	}

	public void setRemark(String remark) {
		this.remark = remark;
	}

	public String getRemark() {
		return remark;
	}

}
