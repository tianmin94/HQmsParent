package com.hand.dimension.hqm_dimension_root_cause_l.dto;

import java.util.Date;

/**Auto Generated By Hap Code Generator**/
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import com.hand.hap.mybatis.annotation.ExtensionAttribute;
import org.hibernate.validator.constraints.Length;
import javax.persistence.Table;
import javax.persistence.Transient;

import com.hand.hap.system.dto.BaseDTO;

@ExtensionAttribute(disable = true)
@Table(name = "HQM_8D_ROOT_CAUSE_L")
public class DimensionRootCauseL extends BaseDTO {

	@Id
	@GeneratedValue
	private Float lineId;

	private Float rcauseId;

	@Length(max = 240)
	private String causeItem;
	@Transient
	private String userName;

	@Transient
	private String employeeName;

	private String rootCauseType;
	
	@Transient
	private String principalName;

	private Float principalId;
	
	@Transient
	private Float rowNum;

	private Date estimatedFinishTime;

	private Date actualFinishiTime;

	private String rootCauseResult;

	private String checkPoint;

	private String hisRate;

	private Float nodeIndex;
	
    private String enableFlag;

    public String getEnableFlag() {
		return enableFlag;
	}

	public void setEnableFlag(String enableFlag) {
		this.enableFlag = enableFlag;
	}
	
	public Float getNodeIndex() {
		return nodeIndex;
	}

	public void setNodeIndex(Float nodeIndex) {
		this.nodeIndex = nodeIndex;
	}

	public String getPrincipalName() {
		return principalName;
	}

	public void setPrincipalName(String principalName) {
		this.principalName = principalName;
	}

	public Float getRowNum() {
		return rowNum;
	}

	public void setRowNum(Float rowNum) {
		this.rowNum = rowNum;
	}

	public String getHisRate() {
		return hisRate;
	}

	public void setHisRate(String hisRate) {
		this.hisRate = hisRate;
	}

	public String getRootCauseType() {
		return rootCauseType;
	}

	public void setRootCauseType(String rootCauseType) {
		this.rootCauseType = rootCauseType;
	}

	public Float getPrincipalId() {
		return principalId;
	}

	public void setPrincipalId(Float principalId) {
		this.principalId = principalId;
	}

	public Date getEstimatedFinishTime() {
		return estimatedFinishTime;
	}

	public void setEstimatedFinishTime(Date estimatedFinishTime) {
		this.estimatedFinishTime = estimatedFinishTime;
	}

	public Date getActualFinishiTime() {
		return actualFinishiTime;
	}

	public void setActualFinishiTime(Date actualFinishiTime) {
		this.actualFinishiTime = actualFinishiTime;
	}

	public String getRootCauseResult() {
		return rootCauseResult;
	}

	public void setRootCauseResult(String rootCauseResult) {
		this.rootCauseResult = rootCauseResult;
	}

	public String getCheckPoint() {
		return checkPoint;
	}

	public void setCheckPoint(String checkPoint) {
		this.checkPoint = checkPoint;
	}

	public String getUserName() {
		return userName;
	}

	public void setUserName(String userName) {
		this.userName = userName;
	}

	public String getEmployeeName() {
		return employeeName;
	}

	public void setEmployeeName(String employeeName) {
		this.employeeName = employeeName;
	}

	public void setLineId(Float lineId) {
		this.lineId = lineId;
	}

	public Float getLineId() {
		return lineId;
	}

	public void setRcauseId(Float rcauseId) {
		this.rcauseId = rcauseId;
	}

	public Float getRcauseId() {
		return rcauseId;
	}

	public void setCauseItem(String causeItem) {
		this.causeItem = causeItem;
	}

	public String getCauseItem() {
		return causeItem;
	}

}
