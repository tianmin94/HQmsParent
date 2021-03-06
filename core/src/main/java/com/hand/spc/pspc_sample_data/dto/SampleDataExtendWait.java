package com.hand.spc.pspc_sample_data.dto;

/**Auto Generated By Hap Code Generator**/
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import com.hand.hap.mybatis.annotation.ExtensionAttribute;
import org.hibernate.validator.constraints.Length;
import javax.persistence.Table;
import com.hand.hap.system.dto.BaseDTO;
@ExtensionAttribute(disable=true)
@Table(name = "PSPC_SAMPLE_DATA_EXTEND_WAIT")
public class SampleDataExtendWait extends BaseDTO {

     public static final String FIELD_SAMPLE_DATA_EXTEND_WAIT_ID = "sampleDataExtendWaitId";
     public static final String FIELD_TENANT_ID = "tenantId";
     public static final String FIELD_SITE_ID = "siteId";
     public static final String FIELD_SAMPLE_DATA_WAIT_ID = "sampleDataWaitId";
     public static final String FIELD_EXTEND_ATTRIBUTE = "extendAttribute";
     public static final String FIELD_EXTEND_VALUE = "extendValue";

    @Id
    @GeneratedValue
     private Float sampleDataExtendWaitId;

     private Float tenantId;

     private Float siteId;

     private Float sampleDataWaitId;

     @Length(max = 100)
     private String extendAttribute;

     @Length(max = 100)
     private String extendValue;


     public void setSampleDataExtendWaitId(Float sampleDataExtendWaitId){
         this.sampleDataExtendWaitId = sampleDataExtendWaitId;
     }

     public Float getSampleDataExtendWaitId(){
         return sampleDataExtendWaitId;
     }

     public void setTenantId(Float tenantId){
         this.tenantId = tenantId;
     }

     public Float getTenantId(){
         return tenantId;
     }

     public void setSiteId(Float siteId){
         this.siteId = siteId;
     }

     public Float getSiteId(){
         return siteId;
     }

     public void setSampleDataWaitId(Float sampleDataWaitId){
         this.sampleDataWaitId = sampleDataWaitId;
     }

     public Float getSampleDataWaitId(){
         return sampleDataWaitId;
     }

     public void setExtendAttribute(String extendAttribute){
         this.extendAttribute = extendAttribute;
     }

     public String getExtendAttribute(){
         return extendAttribute;
     }

     public void setExtendValue(String extendValue){
         this.extendValue = extendValue;
     }

     public String getExtendValue(){
         return extendValue;
     }

     }
