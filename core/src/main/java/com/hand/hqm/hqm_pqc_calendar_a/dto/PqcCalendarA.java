package com.hand.hqm.hqm_pqc_calendar_a.dto;

/**Auto Generated By Hap Code Generator**/
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import com.hand.hap.mybatis.annotation.ExtensionAttribute;
import org.hibernate.validator.constraints.Length;
import javax.persistence.Table;
import com.hand.hap.system.dto.BaseDTO;
@ExtensionAttribute(disable=true)
@Table(name = "HQM_PQC_CALENDAR_A")
public class PqcCalendarA extends BaseDTO {

     private Float calendarId;

     @Id
     @GeneratedValue
     private Float calendarAId;

     private Float layeredPerson;

     @Length(max = 10)
     private String layeredStatus;


     public void setCalendarId(Float calendarId){
         this.calendarId = calendarId;
     }

     public Float getCalendarId(){
         return calendarId;
     }

     public void setCalendarAId(Float calendarAId){
         this.calendarAId = calendarAId;
     }

     public Float getCalendarAId(){
         return calendarAId;
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

     }
