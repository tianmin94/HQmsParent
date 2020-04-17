package com.hand.hqm.hqm_msa_plan.dto;

import java.util.Date;
import java.util.List;

/**Auto Generated By Hap Code Generator**/
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import com.hand.hap.mybatis.annotation.ExtensionAttribute;
import org.hibernate.validator.constraints.Length;
import javax.persistence.Table;
import javax.persistence.Transient;

import com.hand.hap.system.dto.BaseDTO;

@ExtensionAttribute(disable = true)
@Table(name = "HQM_MSA_PLAN")
public class MsaPlan extends BaseDTO {

	public static final String FIELD_MSA_PLAN_ID = "msaPlanId";
	public static final String FIELD_MSA_PLAN_NUM = "msaPlanNum";
	public static final String FIELD_MEASURE_TOOL_NUM = "measureToolNum";
	public static final String FIELD_MSA_TYPE = "msaType";
	public static final String FIELD_MEASURE_CHARACTER = "measureCharacter";
	public static final String FIELD_ANALYZED_BY = "analyzedBy";
	public static final String FIELD_MEASURED_BY = "measuredBy";
	public static final String FIELD_EXPECTED_DETERIORATION = "expectedDeterioration";
	public static final String FIELD_SAMPLE_DESCRIPTION = "sampleDescription";
	public static final String FIELD_CONFIDENCE = "confidence";
	public static final String FIELD_TOLERANCE = "tolerance";
	public static final String FIELD_REMARK = "remark";

	@Id
	@GeneratedValue
	private Float msaPlanId;

	@Length(max = 50)
	private String msaPlanNum;

	@Length(max = 50)
	private String measureToolNum;

	@Length(max = 5)
	private String msaType;

	@Length(max = 10)
	private String measureCharacter;

	private Float analyzedBy;

	@Length(max = 50)
	private String measuredBy;

	private Float expectedDeterioration;

	@Length(max = 100)
	private String sampleDescription;

	private Float confidence;

	private Float tolerance;

	@Length(max = 100)
	private String remark;

	private Float plantId;

	private Date creationDate;

	private String measurePlanStatus;

	private Date estimatedFinishTime;

	@Transient
	private String plantName;// 工厂描述

	@Transient
	private String plantCode;// 工厂编码

	@Transient
	private String measureToolName;// 量具名称

	@Transient
	private String analyzedName;// 分析人员

	@Transient
	private String startTime;// 预计完成时间从

	@Transient
	private String endTime;// 预计完成时间至

	@Transient
	private String userName;// 用户名

	@Transient
	private Float userId;// 用户id

	@Transient
	private String measuringRange;// 量具测量下限
	
	@Transient
	private String judgementStandard;//判定标准
	
	@Transient
	private String cancleFlag;//取消标识
	
	@Transient
	private String positionTitle;//岗位名称
	
	@Transient
	private String numFlag;

	@Transient
	private String measureToolType;//量具类型
	
	
	
	public String getMeasureToolType() {
		return measureToolType;
	}

	public void setMeasureToolType(String measureToolType) {
		this.measureToolType = measureToolType;
	}

	public String getNumFlag() {
		return numFlag;
	}

	public void setNumFlag(String numFlag) {
		this.numFlag = numFlag;
	}

	public String getPositionTitle() {
		return positionTitle;
	}

	public void setPositionTitle(String positionTitle) {
		this.positionTitle = positionTitle;
	}

	public String getCancleFlag() {
		return cancleFlag;
	}

	public void setCancleFlag(String cancleFlag) {
		this.cancleFlag = cancleFlag;
	}

	public String getJudgementStandard() {
		return judgementStandard;
	}

	public void setJudgementStandard(String judgementStandard) {
		this.judgementStandard = judgementStandard;
	}

	public String getMeasurePlanStatus() {
		return measurePlanStatus;
	}

	public Date getEstimatedFinishTime() {
		return estimatedFinishTime;
	}

	public void setMeasurePlanStatus(String measurePlanStatus) {
		this.measurePlanStatus = measurePlanStatus;
	}

	public void setEstimatedFinishTime(Date estimatedFinishTime) {
		this.estimatedFinishTime = estimatedFinishTime;
	}

	public String getMeasuringRange() {
		return measuringRange;
	}

	public void setMeasuringRange(String measuringRange) {
		this.measuringRange = measuringRange;
	}

	public Date getCreationDate() {
		return creationDate;
	}

	public void setCreationDate(Date creationDate) {
		this.creationDate = creationDate;
	}

	public String getUserName() {
		return userName;
	}

	public void setUserName(String userName) {
		this.userName = userName;
	}

	public Float getUserId() {
		return userId;
	}

	public void setUserId(Float userId) {
		this.userId = userId;
	}

	public String getStartTime() {
		return startTime;
	}

	public void setStartTime(String startTime) {
		this.startTime = startTime;
	}

	public String getEndTime() {
		return endTime;
	}

	public void setEndTime(String endTime) {
		this.endTime = endTime;
	}

	public Float getPlantId() {
		return plantId;
	}

	public String getPlantName() {
		return plantName;
	}

	public void setPlantName(String plantName) {
		this.plantName = plantName;
	}

	public String getPlantCode() {
		return plantCode;
	}

	public void setPlantCode(String plantCode) {
		this.plantCode = plantCode;
	}

	public String getMeasureToolName() {
		return measureToolName;
	}

	public void setMeasureToolName(String measureToolName) {
		this.measureToolName = measureToolName;
	}

	public String getAnalyzedName() {
		return analyzedName;
	}

	public void setAnalyzedName(String analyzedName) {
		this.analyzedName = analyzedName;
	}

	public void setPlantId(Float plantId) {
		this.plantId = plantId;
	}

	public void setMsaPlanId(Float msaPlanId) {
		this.msaPlanId = msaPlanId;
	}

	public Float getMsaPlanId() {
		return msaPlanId;
	}

	public void setMsaPlanNum(String msaPlanNum) {
		this.msaPlanNum = msaPlanNum;
	}

	public String getMsaPlanNum() {
		return msaPlanNum;
	}

	public void setMeasureToolNum(String measureToolNum) {
		this.measureToolNum = measureToolNum;
	}

	public String getMeasureToolNum() {
		return measureToolNum;
	}

	public void setMsaType(String msaType) {
		this.msaType = msaType;
	}

	public String getMsaType() {
		return msaType;
	}

	public void setMeasureCharacter(String measureCharacter) {
		this.measureCharacter = measureCharacter;
	}

	public String getMeasureCharacter() {
		return measureCharacter;
	}

	public void setAnalyzedBy(Float analyzedBy) {
		this.analyzedBy = analyzedBy;
	}

	public Float getAnalyzedBy() {
		return analyzedBy;
	}

	public void setMeasuredBy(String measuredBy) {
		this.measuredBy = measuredBy;
	}

	public String getMeasuredBy() {
		return measuredBy;
	}

	public void setExpectedDeterioration(Float expectedDeterioration) {
		this.expectedDeterioration = expectedDeterioration;
	}

	public Float getExpectedDeterioration() {
		return expectedDeterioration;
	}

	public void setSampleDescription(String sampleDescription) {
		this.sampleDescription = sampleDescription;
	}

	public String getSampleDescription() {
		return sampleDescription;
	}

	public void setConfidence(Float confidence) {
		this.confidence = confidence;
	}

	public Float getConfidence() {
		return confidence;
	}

	public void setTolerance(Float tolerance) {
		this.tolerance = tolerance;
	}

	public Float getTolerance() {
		return tolerance;
	}

	public void setRemark(String remark) {
		this.remark = remark;
	}

	public String getRemark() {
		return remark;
	}

}