package com.hand.dimension.hqm_dimension_prevention_actions.dto;

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
@Table(name = "HQM_8D_PREVENTION_ACTIONS")
public class DimensionPreventionActions extends BaseDTO {
     private Float step;

     @Id
     @GeneratedValue
     private Float actionId;

     private Float orderId;
     
     private Float principalId;
     
     private Date actualFinishiTime;
     
     private String cfNum;

     public String getCfNum() {
    return cfNum;
  }

  public void setCfNum(String cfNum) {
    this.cfNum = cfNum;
  }

     @Transient
     private String principalName;
     
     @Transient
     private Float  rowNum;
     
     private String enableFlag;

     public String getEnableFlag() {
		return enableFlag;
	}

	public void setEnableFlag(String enableFlag) {
		this.enableFlag = enableFlag;
	}
     private String remark;
     
     public String getRemark() {
		return remark;
	}

	public void setRemark(String remark) {
		this.remark = remark;
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

	public Float getPrincipalId() {
		return principalId;
	}

	public void setPrincipalId(Float principalId) {
		this.principalId = principalId;
	}

	public Date getActualFinishiTime() {
		return actualFinishiTime;
	}

	public void setActualFinishiTime(Date actualFinishiTime) {
		this.actualFinishiTime = actualFinishiTime;
	}

	public Date getEstimatedFinishTime() {
		return estimatedFinishTime;
	}

	public void setEstimatedFinishTime(Date estimatedFinishTime) {
		this.estimatedFinishTime = estimatedFinishTime;
	}

	private Date estimatedFinishTime;

     @Length(max = 300)
     private String preventionAction;

     @Length(max = 300)
     private String actionDescription;

     private Float userId;

     private Date planReleaseTime;

     private Date actualReleaseTime;

     @Length(max = 30)
     private String actionStatus;
     
     @Transient
     private String userName;
    
	public String getUserName() {
		return userName;
	}

	public void setUserName(String userName) {
		this.userName = userName;
	}

	public void setStep(Float step){
         this.step = step;
     }

     public Float getStep(){
         return step;
     }

     public void setActionId(Float actionId){
         this.actionId = actionId;
     }

     public Float getActionId(){
         return actionId;
     }

     public void setOrderId(Float orderId){
         this.orderId = orderId;
     }

     public Float getOrderId(){
         return orderId;
     }

     public void setPreventionAction(String preventionAction){
         this.preventionAction = preventionAction;
     }

     public String getPreventionAction(){
         return preventionAction;
     }

     public void setActionDescription(String actionDescription){
         this.actionDescription = actionDescription;
     }

     public String getActionDescription(){
         return actionDescription;
     }

     public void setUserId(Float userId){
         this.userId = userId;
     }

     public Float getUserId(){
         return userId;
     }

     public void setPlanReleaseTime(Date planReleaseTime){
         this.planReleaseTime = planReleaseTime;
     }

     public Date getPlanReleaseTime(){
         return planReleaseTime;
     }

     public void setActualReleaseTime(Date actualReleaseTime){
         this.actualReleaseTime = actualReleaseTime;
     }

     public Date getActualReleaseTime(){
         return actualReleaseTime;
     }

     public void setActionStatus(String actionStatus){
         this.actionStatus = actionStatus;
     }

     public String getActionStatus(){
         return actionStatus;
     }

     }
