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
@Table(name = "HQM_CONTROL_PLAN")
public class ControlPlan extends BaseDTO {
	@Id
	@GeneratedValue
	private Long controlPlanId;

	@Length(max = 100)
	private String controlPlanCode;

	@Length(max = 100)
	private String controlPlanName;
	
	//控制计划类型
	private String controlPlanType;
	
	public String getControlPlanType() {
		return controlPlanType;
	}

	public void setControlPlanType(String controlPlanType) {
		this.controlPlanType = controlPlanType;
	}

	private Long writerId;
	
	private Long levelId;

	public Long getLevelId() {
		return levelId;
	}

	public void setLevelId(Long levelId) {
		this.levelId = levelId;
	}

	private String writer;

	private String mainStaffId;

	private String mainStaff;

	@Length(max = 100)
	private String controlObject;

	private Date creationDate;

	private Date lastUpdateDate;
	
	private Long controlVersion;
	
	
	
	@Transient
	private String creationStartTime;// 编制日期从

	@Transient
	private String creationEndTime;// 编制日期至

	public String getCreationStartTime() {
		return creationStartTime;
	}

	public void setCreationStartTime(String creationStartTime) {
		this.creationStartTime = creationStartTime;
	}

	public String getCreationEndTime() {
		return creationEndTime;
	}

	public void setCreationEndTime(String creationEndTime) {
		this.creationEndTime = creationEndTime;
	}

	public String getWriter() {
		return writer;
	}

	public void setWriter(String writer) {
		this.writer = writer;
	}

	public void setControlPlanId(Long controlPlanId) {
		this.controlPlanId = controlPlanId;
	}

	public Long getControlPlanId() {
		return controlPlanId;
	}

	public void setControlPlanCode(String controlPlanCode) {
		this.controlPlanCode = controlPlanCode;
	}

	public String getControlPlanCode() {
		return controlPlanCode;
	}

	public void setControlPlanName(String controlPlanName) {
		this.controlPlanName = controlPlanName;
	}

	public String getControlPlanName() {
		return controlPlanName;
	}

	public void setWriterId(Long writerId) {
		this.writerId = writerId;
	}

	public Long getWriterId() {
		return writerId;
	}

	public void setControlObject(String controlObject) {
		this.controlObject = controlObject;
	}

	public String getControlObject() {
		return controlObject;
	}

	public Date getCreationDate() {
		return creationDate;
	}

	public void setCreationDate(Date creationDate) {
		this.creationDate = creationDate;
	}

	public Date getLastUpdateDate() {
		return lastUpdateDate;
	}

	public void setLastUpdateDate(Date lastUpdateDate) {
		this.lastUpdateDate = lastUpdateDate;
	}

	public String getMainStaff() {
		return mainStaff;
	}

	public void setMainStaff(String mainStaff) {
		this.mainStaff = mainStaff;
	}

	public String getMainStaffId() {
		return mainStaffId;
	}

	public void setMainStaffId(String mainStaffId) {
		this.mainStaffId = mainStaffId;
	}

	public Long getControlVersion() {
		return controlVersion;
	}

	public void setControlVersion(Long controlVersion) {
		this.controlVersion = controlVersion;
	}
}
