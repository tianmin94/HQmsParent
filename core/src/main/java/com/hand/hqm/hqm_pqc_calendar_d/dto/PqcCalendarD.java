package com.hand.hqm.hqm_pqc_calendar_d.dto;

/**Auto Generated By Hap Code Generator**/
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import com.hand.hap.mybatis.annotation.ExtensionAttribute;
import org.hibernate.validator.constraints.Length;
import javax.persistence.Table;
import com.hand.hap.system.dto.BaseDTO;
@ExtensionAttribute(disable=true)
@Table(name = "HQM_PQC_CALENDAR_D")
public class PqcCalendarD extends BaseDTO {

     public static final String FIELD_CALENDAR_ID = "calendarId";
     public static final String FIELD_CALENDAR_D_ID = "calendarDId";
     public static final String FIELD_LAYERED_PERSON = "layeredPerson";
     public static final String FIELD_LAYERED_STATUS = "layeredStatus";
     public static final String FIELD_INSPECTION_CONTEXT = "inspectionContext";
     public static final String FIELD_INSPECTION_RESULT = "inspectionResult";


     private Float calendarId;

     @Id
     @GeneratedValue
     private Float calendarDId;

     private Float layeredPerson;

     @Length(max = 5)
     private String layeredStatus;

     @Length(max = 240)
     private String inspectionContext;

     @Length(max = 5)
     private String inspectionResult;


     public void setCalendarId(Float calendarId){
         this.calendarId = calendarId;
     }

     public Float getCalendarId(){
         return calendarId;
     }

     public void setCalendarDId(Float calendarDId){
         this.calendarDId = calendarDId;
     }

     public Float getCalendarDId(){
         return calendarDId;
     }

     public void setLayeredPerson(Float layeredPerson){
         this.layeredPerson = layeredPerson;
     }

     public Float getLayeredPerson(){
         return layeredPerson;
     }

     public void setLayeredStatus(String layeredStatus){
         this.layeredStatus = layeredStatus;
     }

     public String getLayeredStatus(){
         return layeredStatus;
     }

     public void setInspectionContext(String inspectionContext){
         this.inspectionContext = inspectionContext;
     }

     public String getInspectionContext(){
         return inspectionContext;
     }

     public void setInspectionResult(String inspectionResult){
         this.inspectionResult = inspectionResult;
     }

     public String getInspectionResult(){
         return inspectionResult;
     }

     }