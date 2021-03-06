package com.hand.hqm.hqm_control_plan.dto;

/**Auto Generated By Hap Code Generator**/
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import com.hand.hap.mybatis.annotation.ExtensionAttribute;
import org.hibernate.validator.constraints.Length;
import javax.persistence.Table;
import com.hand.hap.system.dto.BaseDTO;
@ExtensionAttribute(disable=true)
@Table(name = "HQM_CONTROL_PLAN_PROCESS")
public class ControlPlanProcess extends BaseDTO {

     public static final String FIELD_PROCESS_ID = "processId";
     public static final String FIELD_PROCESS_NAME = "processName";


     @Id
     @GeneratedValue
     private Long processId;

     @Length(max = 30)
     private String processName;


     public void setProcessId(Long processId){
         this.processId = processId;
     }

     public Long getProcessId(){
         return processId;
     }

     public void setProcessName(String processName){
         this.processName = processName;
     }

     public String getProcessName(){
         return processName;
     }

     }
