package com.hand.dimension.hqm_dimension_improving_actions_ev.dto;

/**Auto Generated By Hap Code Generator**/
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import com.hand.hap.mybatis.annotation.ExtensionAttribute;
import org.hibernate.validator.constraints.Length;
import javax.persistence.Table;
import com.hand.hap.system.dto.BaseDTO;
@ExtensionAttribute(disable=true)
@Table(name = "HQM_8D_IMPROVING_ACTIONS_EV")
public class DimensionImprovingActionsEv extends BaseDTO {

     public static final String FIELD_EVALUATE_ID = "evaluateId";
     public static final String FIELD_ACTION_ID = "actionId";
     public static final String FIELD_MEMBER_ID = "memberId";
     public static final String FIELD_EVALUATE_FLAG = "evaluateFlag";


     @Id
     @GeneratedValue
     private Float evaluateId;

     private Float actionId;

     private Float memberId;

     @Length(max = 1)
     private String evaluateFlag;


     public void setEvaluateId(Float evaluateId){
         this.evaluateId = evaluateId;
     }

     public Float getEvaluateId(){
         return evaluateId;
     }

     public void setActionId(Float actionId){
         this.actionId = actionId;
     }

     public Float getActionId(){
         return actionId;
     }

     public void setMemberId(Float memberId){
         this.memberId = memberId;
     }

     public Float getMemberId(){
         return memberId;
     }

     public void setEvaluateFlag(String evaluateFlag){
         this.evaluateFlag = evaluateFlag;
     }

     public String getEvaluateFlag(){
         return evaluateFlag;
     }

     }
