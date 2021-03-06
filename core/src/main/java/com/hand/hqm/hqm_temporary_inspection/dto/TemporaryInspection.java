package com.hand.hqm.hqm_temporary_inspection.dto;

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
@Table(name = "HQM_TEMPORARY_INSPECTION")
public class TemporaryInspection extends BaseDTO {

	/**
	* 
	*/
	private static final long serialVersionUID = 104746624423515743L;
	
	@Id
	@GeneratedValue
	private Float kid;

	private String attributeType;

	private Float attributeId;

	private Float plantId;

	@Length(max = 30)
	private String categoryId;

	@Length(max = 30)
	private String inspectionType;

	@Length(max = 30)
	private String standardType;

	@Transient
	private Float prodLineId;

	@Transient
	private String workstations;

	private Float standardOpId;

	private Float workstationId;

	private Float sampleWayId;

	@Length(max = 30)
	private String inspectionRequest;

	private Float inspectionMethod;

	private String standradFrom;

	private String standradTo;

	@Length(max = 30)
	private String standradUom;

	@Length(max = 200)
	private String textStandrad;

	@Length(max = 30)
	private String qualityCharacterGrade;

	@Length(max = 30)
	private String enableType;

	@Length(max = 1)
	private String isSync;

	@Length(max = 240)
	private String remark;

	private Date enableTime;

	private Date disableTime;

	@Length(max = 240)
	private String status;

	@Transient
	private String plantCode;

	@Transient
	private String categoryCode;

	@Transient
	private String inspectionAttribute;

	@Transient
	private String plantDescriptions;

	@Transient
	private String sampleWayCode;

	@Transient
	private String sampleType;

	@Transient
	private String prodLineCode;

	@Transient
	private String standardOpCode;
	
	@Transient
	private String workstationCode;
	
	
	
	public String getStandardOpCode() {
		return standardOpCode;
	}

	public void setStandardOpCode(String standardOpCode) {
		this.standardOpCode = standardOpCode;
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

	@Transient
	private String workstationDes;

	public Float getStandardOpId() {
		return standardOpId;
	}

	public void setStandardOpId(Float standardOpId) {
		this.standardOpId = standardOpId;
	}

	public Float getWorkstationId() {
		return workstationId;
	}

	public void setWorkstationId(Float workstationId) {
		this.workstationId = workstationId;
	}

	public Float getProdLineId() {
		return prodLineId;
	}

	public void setProdLineId(Float prodLineId) {
		this.prodLineId = prodLineId;
	}

	public String getSampleWayCode() {
		return sampleWayCode;
	}

	public void setSampleWayCode(String sampleWayCode) {
		this.sampleWayCode = sampleWayCode;
	}

	public String getSampleType() {
		return sampleType;
	}

	public void setSampleType(String sampleType) {
		this.sampleType = sampleType;
	}

	public String getPlantDescriptions() {
		return plantDescriptions;
	}

	public void setPlantDescriptions(String plantDescriptions) {
		this.plantDescriptions = plantDescriptions;
	}

	public String getAttributeType() {
		return attributeType;
	}

	public void setAttributeType(String attributeType) {
		this.attributeType = attributeType;
	}

	public Float getAttributeId() {
		return attributeId;
	}

	public void setAttributeId(Float attributeId) {
		this.attributeId = attributeId;
	}

	public String getPlantCode() {
		return plantCode;
	}

	public void setPlantCode(String plantCode) {
		this.plantCode = plantCode;
	}

	public String getCategoryCode() {
		return categoryCode;
	}

	public void setCategoryCode(String categoryCode) {
		this.categoryCode = categoryCode;
	}

	public String getInspectionAttribute() {
		return inspectionAttribute;
	}

	public void setInspectionAttribute(String inspectionAttribute) {
		this.inspectionAttribute = inspectionAttribute;
	}

	public void setKid(Float kid) {
		this.kid = kid;
	}

	public Float getKid() {
		return kid;
	}

	public void setPlantId(Float plantId) {
		this.plantId = plantId;
	}

	public Float getPlantId() {
		return plantId;
	}

	public void setCategoryId(String categoryId) {
		this.categoryId = categoryId;
	}

	public String getCategoryId() {
		return categoryId;
	}

	public void setInspectionType(String inspectionType) {
		this.inspectionType = inspectionType;
	}

	public String getInspectionType() {
		return inspectionType;
	}

	public void setStandardType(String standardType) {
		this.standardType = standardType;
	}

	public String getStandardType() {
		return standardType;
	}

	public void setProdLineCode(String prodLineCode) {
		this.prodLineCode = prodLineCode;
	}

	public String getProdLineCode() {
		return prodLineCode;
	}

	public void setWorkstations(String workstations) {
		this.workstations = workstations;
	}

	public String getWorkstations() {
		return workstations;
	}

	public void setSampleWayId(Float sampleWayId) {
		this.sampleWayId = sampleWayId;
	}

	public Float getSampleWayId() {
		return sampleWayId;
	}

	public void setInspectionRequest(String inspectionRequest) {
		this.inspectionRequest = inspectionRequest;
	}

	public String getInspectionRequest() {
		return inspectionRequest;
	}

	public void setInspectionMethod(Float inspectionMethod) {
		this.inspectionMethod = inspectionMethod;
	}

	public Float getInspectionMethod() {
		return inspectionMethod;
	}

	public void setStandradFrom(String standradFrom) {
		this.standradFrom = standradFrom;
	}

	public String getStandradFrom() {
		return standradFrom;
	}

	public void setStandradTo(String standradTo) {
		this.standradTo = standradTo;
	}

	public String getStandradTo() {
		return standradTo;
	}

	public void setStandradUom(String standradUom) {
		this.standradUom = standradUom;
	}

	public String getStandradUom() {
		return standradUom;
	}

	public void setTextStandrad(String textStandrad) {
		this.textStandrad = textStandrad;
	}

	public String getTextStandrad() {
		return textStandrad;
	}

	public void setQualityCharacterGrade(String qualityCharacterGrade) {
		this.qualityCharacterGrade = qualityCharacterGrade;
	}

	public String getQualityCharacterGrade() {
		return qualityCharacterGrade;
	}

	public void setEnableType(String enableType) {
		this.enableType = enableType;
	}

	public String getEnableType() {
		return enableType;
	}

	public void setIsSync(String isSync) {
		this.isSync = isSync;
	}

	public String getIsSync() {
		return isSync;
	}

	public void setRemark(String remark) {
		this.remark = remark;
	}

	public String getRemark() {
		return remark;
	}

	public void setEnableTime(Date enableTime) {
		this.enableTime = enableTime;
	}

	public Date getEnableTime() {
		return enableTime;
	}

	public void setDisableTime(Date disableTime) {
		this.disableTime = disableTime;
	}

	public Date getDisableTime() {
		return disableTime;
	}

	public void setStatus(String status) {
		this.status = status;
	}

	public String getStatus() {
		return status;
	}

}
