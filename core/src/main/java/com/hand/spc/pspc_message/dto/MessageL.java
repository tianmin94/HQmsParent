package com.hand.spc.pspc_message.dto;

/**Auto Generated By Hap Code Generator**/
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import com.hand.hap.mybatis.annotation.ExtensionAttribute;
import org.hibernate.validator.constraints.Length;
import javax.persistence.Table;
import com.hand.hap.system.dto.BaseDTO;
@ExtensionAttribute(disable=true)
@Table(name = "PSPC_MESSAGE")
public class MessageL extends BaseDTO {

     public static final String FIELD_MESSAGE_ID = "messageId";
     public static final String FIELD_TENANT_ID = "tenantId";
     public static final String FIELD_SITE_ID = "siteId";
     public static final String FIELD_OOC_ID = "oocId";
     public static final String FIELD_ENTITY_CODE = "entityCode";
     public static final String FIELD_ENTITY_VERSION = "entityVersion";
     public static final String FIELD_MESSAGE_STATUS = "messageStatus";


     @Id
     @GeneratedValue
     private String messageId;

     private Float tenantId;

     private Float siteId;

     @Length(max = 100)
     private String oocId;

     @Length(max = 50)
     private String entityCode;

     @Length(max = 50)
     private String entityVersion;

     @Length(max = 50)
     private String messageStatus;


     public void setMessageId(String messageId){
         this.messageId = messageId;
     }

     public String getMessageId(){
         return messageId;
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

     public void setOocId(String oocId){
         this.oocId = oocId;
     }

     public String getOocId(){
         return oocId;
     }

     public void setEntityCode(String entityCode){
         this.entityCode = entityCode;
     }

     public String getEntityCode(){
         return entityCode;
     }

     public void setEntityVersion(String entityVersion){
         this.entityVersion = entityVersion;
     }

     public String getEntityVersion(){
         return entityVersion;
     }

     public void setMessageStatus(String messageStatus){
         this.messageStatus = messageStatus;
     }

     public String getMessageStatus(){
         return messageStatus;
     }

     }
