package com.hand.npi.npi_technology.dto;

/**Auto Generated By Hap Code Generator**/
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import com.hand.hap.mybatis.annotation.ExtensionAttribute;
import org.hibernate.validator.constraints.Length;
import javax.persistence.Table;
import com.hand.hap.system.dto.BaseDTO;
@ExtensionAttribute(disable=true)
@Table(name = "NPI_TECHNOLOGY_SPEC_AUDITER")
public class TechnologySpecAuditer extends BaseDTO {

     public static final String FIELD_ID = "id";
     public static final String FIELD_START_CODE = "startCode";
     public static final String FIELD_AUDITER_CODE = "auditerCode";
     public static final String FIELD_PROCESS_NAME = "processName";


     @Id
     @GeneratedValue
     private Float id;

     @Length(max = 30)
     private String startCode;

     @Length(max = 30)
     private String auditerCode;

     @Length(max = 200)
     private String processName;


     public void setId(Float id){
         this.id = id;
     }

     public Float getId(){
         return id;
     }

     public void setStartCode(String startCode){
         this.startCode = startCode;
     }

     public String getStartCode(){
         return startCode;
     }

     public void setAuditerCode(String auditerCode){
         this.auditerCode = auditerCode;
     }

     public String getAuditerCode(){
         return auditerCode;
     }

     public void setProcessName(String processName){
         this.processName = processName;
     }

     public String getProcessName(){
         return processName;
     }

     }
