package com.hand.spc.message_config_mainten.dto;

/**Auto Generated By Hap Code Generator**/
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import com.hand.hap.mybatis.annotation.ExtensionAttribute;
import org.hibernate.validator.constraints.Length;
import javax.persistence.Table;
import javax.persistence.Transient;

import com.hand.hap.system.dto.BaseDTO;
@ExtensionAttribute(disable=true)
@Table(name = "PSPC_MESSAGE_UPLOAD_CONFIG")
public class MessageUploadConfig extends BaseDTO {

     public static final String FIELD_UPLOAD_CONFIG_ID = "uploadConfigId";
     public static final String FIELD_CONFIG_CODE = "configCode";
     public static final String FIELD_CONFIG_TYPE = "configType";
     public static final String FIELD_CONFIG_VALUE = "configValue";
     public static final String FIELD_CONFIG_COMMAND = "configCommand";
     public static final String FIELD_DESCRIPTION = "description";
     public static final String FIELD_TENANT_ID = "tenantId";
     public static final String FIELD_SITE_ID = "siteId";

    @Id
    @GeneratedValue
     private Float uploadConfigId;

     @Length(max = 100)
     private String configCode;

     @Length(max = 100)
     private String configType;

     @Length(max = 1000)
     private String configValue;

     @Length(max = 100)
     private String configCommand;

     @Length(max = 100)
     private String description;

     private Float tenantId;

     private Float siteId;

     @Transient
     private int rowNum;

    public int getRowNum() {
        return rowNum;
    }

    public void setRowNum(int rowNum) {
        this.rowNum = rowNum;
    }

    public void setUploadConfigId(Float uploadConfigId){
         this.uploadConfigId = uploadConfigId;
     }

     public Float getUploadConfigId(){
         return uploadConfigId;
     }

     public void setConfigCode(String configCode){
         this.configCode = configCode;
     }

     public String getConfigCode(){
         return configCode;
     }

     public void setConfigType(String configType){
         this.configType = configType;
     }

     public String getConfigType(){
         return configType;
     }

     public void setConfigValue(String configValue){
         this.configValue = configValue;
     }

     public String getConfigValue(){
         return configValue;
     }

     public void setConfigCommand(String configCommand){
         this.configCommand = configCommand;
     }

     public String getConfigCommand(){
         return configCommand;
     }

     public void setDescription(String description){
         this.description = description;
     }

     public String getDescription(){
         return description;
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

     }
