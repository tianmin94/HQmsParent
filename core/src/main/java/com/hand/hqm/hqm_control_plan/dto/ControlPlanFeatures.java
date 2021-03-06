package com.hand.hqm.hqm_control_plan.dto;

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
@Table(name = "HQM_CONTROL_PLAN_FEATURES")
public class ControlPlanFeatures extends BaseDTO {
	
	@Id
	@GeneratedValue
	private Long featuresId;

	private Long parentFeaturesId;

	private Long controlPlanId;

	public Long getBranchId() {
		return branchId;
	}

	public void setBranchId(Long branchId) {
		this.branchId = branchId;
	}

	private Long branchId;
	
	private Long ranks;
	//特征
	private String feature;
	//有效性
	private String enableFlag;
	
	public String getEnableFlag() {
		return enableFlag;
	}

	public void setEnableFlag(String enableFlag) {
		this.enableFlag = enableFlag;
	}

	public String getFeature() {
		return feature;
	}

	public void setFeature(String feature) {
		this.feature = feature;
	}

	@Length(max = 50)
	private String featuresName;
	
	@Transient
	private String featuresName1;//特征

	@Length(max = 10)
	private String featuresType;

	@Length(max = 200)
	private String featuresContent;

	@Length(max = 50)
	private String equipment;

	@Length(max = 10)
	private String specialCharacterType;

	@Length(max = 200)
	private String standrad;

	@Length(max = 200)
	private String detectionEquipment;

	private String sampleSize;

	@Length(max = 50)
	private String detectionFrequency;

	@Length(max = 300)
	private String controlMethod;

	private Long grR;

	@Length(max = 50)
	private String processCapability;

	@Length(max = 300)
	private String reactionPlan;
	
	@Transient
	private String controlObject;//控制对象
	
	@Transient
	private String controlPlanCode;//控制计划编号

	@Transient
	private Long writerId;//编制人id
	
	@Transient
	private String writer;//编制人
	
	@Transient
	private String mainStaffId;//主要参与人员id
	
	@Transient
	private String mainStaff;//主要参与人员
	
	@Transient
	private Date cpcreationDate;//控制计划编制日期
	
	@Transient
	private Date cplastUpdateDate;//控制计划最后修订时间
		
	public String getFeaturesName1() {
		return featuresName1;
	}

	public void setFeaturesName1(String featuresName1) {
		this.featuresName1 = featuresName1;
	}

	public String getWriter() {
		return writer;
	}

	public void setWriter(String writer) {
		this.writer = writer;
	}

	public String getMainStaffId() {
		return mainStaffId;
	}

	public void setMainStaffId(String mainStaffId) {
		this.mainStaffId = mainStaffId;
	}
	
	public String getControlObject() {
		return controlObject;
	}

	public void setControlObject(String controlObject) {
		this.controlObject = controlObject;
	}

	public String getControlPlanCode() {
		return controlPlanCode;
	}

	public void setControlPlanCode(String controlPlanCode) {
		this.controlPlanCode = controlPlanCode;
	}

	public Long getWriterId() {
		return writerId;
	}

	public void setWriterId(Long writerId) {
		this.writerId = writerId;
	}

	public Date getCpcreationDate() {
		return cpcreationDate;
	}

	public void setCpcreationDate(Date cpcreationDate) {
		this.cpcreationDate = cpcreationDate;
	}

	public Date getCplastUpdateDate() {
		return cplastUpdateDate;
	}

	public void setCplastUpdateDate(Date cplastUpdateDate) {
		this.cplastUpdateDate = cplastUpdateDate;
	}

	public String getMainStaff() {
		return mainStaff;
	}

	public void setMainStaff(String mainStaff) {
		this.mainStaff = mainStaff;
	}

	public void setFeaturesId(Long featuresId) {
		this.featuresId = featuresId;
	}

	public Long getFeaturesId() {
		return featuresId;
	}

	public void setParentFeaturesId(Long parentFeaturesId) {
		this.parentFeaturesId = parentFeaturesId;
	}

	public Long getParentFeaturesId() {
		return parentFeaturesId;
	}

	public void setControlPlanId(Long controlPlanId) {
		this.controlPlanId = controlPlanId;
	}

	public Long getControlPlanId() {
		return controlPlanId;
	}

	public void setRanks(Long ranks) {
		this.ranks = ranks;
	}

	public Long getRanks() {
		return ranks;
	}

	public void setFeaturesName(String featuresName) {
		this.featuresName = featuresName;
	}

	public String getFeaturesName() {
		return featuresName;
	}

	public void setFeaturesType(String featuresType) {
		this.featuresType = featuresType;
	}

	public String getFeaturesType() {
		return featuresType;
	}

	public void setFeaturesContent(String featuresContent) {
		this.featuresContent = featuresContent;
	}

	public String getFeaturesContent() {
		return featuresContent;
	}

	public void setEquipment(String equipment) {
		this.equipment = equipment;
	}

	public String getEquipment() {
		return equipment;
	}

	public void setSpecialCharacterType(String specialCharacterType) {
		this.specialCharacterType = specialCharacterType;
	}

	public String getSpecialCharacterType() {
		return specialCharacterType;
	}

	public void setStandrad(String standrad) {
		this.standrad = standrad;
	}

	public String getStandrad() {
		return standrad;
	}

	public void setDetectionEquipment(String detectionEquipment) {
		this.detectionEquipment = detectionEquipment;
	}

	public String getDetectionEquipment() {
		return detectionEquipment;
	}

	public void setSampleSize(String sampleSize) {
		this.sampleSize = sampleSize;
	}

	public String getSampleSize() {
		return sampleSize;
	}

	public void setDetectionFrequency(String detectionFrequency) {
		this.detectionFrequency = detectionFrequency;
	}

	public String getDetectionFrequency() {
		return detectionFrequency;
	}

	public void setControlMethod(String controlMethod) {
		this.controlMethod = controlMethod;
	}

	public String getControlMethod() {
		return controlMethod;
	}

	public void setGrR(Long grR) {
		this.grR = grR;
	}

	public Long getGrR() {
		return grR;
	}

	public void setProcessCapability(String processCapability) {
		this.processCapability = processCapability;
	}

	public String getProcessCapability() {
		return processCapability;
	}

	public void setReactionPlan(String reactionPlan) {
		this.reactionPlan = reactionPlan;
	}

	public String getReactionPlan() {
		return reactionPlan;
	}

}
