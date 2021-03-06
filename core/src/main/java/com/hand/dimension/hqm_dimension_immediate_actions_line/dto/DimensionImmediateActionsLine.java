package com.hand.dimension.hqm_dimension_immediate_actions_line.dto;

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
@Table(name = "HQM_8D_IMMEDIATE_ACTIONS_LINE")
public class DimensionImmediateActionsLine extends BaseDTO {

     public static final String FIELD_LINE_ACTION_ID = "lineActionId";
     public static final String FIELD_HEAD_ACTION_ID = "headActionId";
     public static final String FIELD_EXECUTE_IMMEDIATE_ACTION = "executeImmediateAction";
     public static final String FIELD_ACTION_DESCRIPTION = "actionDescription";
     public static final String FIELD_USER_ID = "userId";
     public static final String FIELD_PLAN_TIME = "planTime";
     public static final String FIELD_ACTUAL_TIME = "actualTime";
     public static final String FIELD_ACTION_STATUS = "actionStatus";
     public static final String FIELD_REMARK = "remark";


     @Id
     @GeneratedValue
     private Float lineActionId;

     private Float headActionId;

     @Length(max = 300)
     private String executeImmediateAction;

     @Length(max = 300)
     private String actionDescription;

     private Float userId;
     
     private Float principalId;
   
     @Length(max = 30)
     private String principalName;
     
     public Float getPrincipalId() {
		return principalId;
	}

	public void setPrincipalId(Float principalId) {
		this.principalId = principalId;
	}

	public String getPrincipalName() {
		return principalName;
	}

	public void setPrincipalName(String principalName) {
		this.principalName = principalName;
	}

	private Date planTime;

     private Date actualTime;

     @Length(max = 30)
     private String actionStatus;

     @Length(max = 300)
     private String remark;
     
     @Transient
     private String userName;


     public String getUserName() {
		return userName;
	}

	public void setUserName(String userName) {
		this.userName = userName;
	}

	public void setLineActionId(Float lineActionId){
         this.lineActionId = lineActionId;
     }

     public Float getLineActionId(){
         return lineActionId;
     }

     public void setHeadActionId(Float headActionId){
         this.headActionId = headActionId;
     }

     public Float getHeadActionId(){
         return headActionId;
     }

     public void setExecuteImmediateAction(String executeImmediateAction){
         this.executeImmediateAction = executeImmediateAction;
     }

     public String getExecuteImmediateAction(){
         return executeImmediateAction;
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

     public void setPlanTime(Date planTime){
         this.planTime = planTime;
     }

     public Date getPlanTime(){
         return planTime;
     }

     public void setActualTime(Date actualTime){
         this.actualTime = actualTime;
     }

     public Date getActualTime(){
         return actualTime;
     }

     public void setActionStatus(String actionStatus){
         this.actionStatus = actionStatus;
     }

     public String getActionStatus(){
         return actionStatus;
     }

     public void setRemark(String remark){
         this.remark = remark;
     }

     public String getRemark(){
         return remark;
     }

     }
