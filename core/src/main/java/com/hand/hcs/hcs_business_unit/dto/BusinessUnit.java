package com.hand.hcs.hcs_business_unit.dto;

/**Auto Generated By Hap Code Generator**/
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import com.hand.hap.mybatis.annotation.ExtensionAttribute;
import org.hibernate.validator.constraints.Length;
import javax.persistence.Table;
import com.hand.hap.system.dto.BaseDTO;
@ExtensionAttribute(disable=true)
@Table(name = "HCS_BUSINESS_UNIT")
public class BusinessUnit extends BaseDTO {

     public static final String FIELD_BUSINESS_UNIT_ID = "businessUnitId";
     public static final String FIELD_BUSINESS_UNIT_CODE = "businessUnitCode";
     public static final String FIELD_BUSINESS_UNIT_NAME = "businessUnitName";
     public static final String FIELD_BUSINESS_GROUP = "businessGroup";
     public static final String FIELD_COMPANY_ID = "companyId";
     public static final String FIELD_COMPNAY_NAME = "compnayName";
     public static final String FIELD_ENABLED_FLAG = "enabledFlag";
     public static final String FIELD_COMMENTS = "comments";
     public static final String FIELD_DISPLAY_CODE = "displayCode";
     public static final String FIELD_COMPANY_MAINTENANCE_FLAG = "companyMaintenanceFlag";
     public static final String FIELD_LAST_UPDATE_VERSION = "lastUpdateVersion";


     private Float businessUnitId;

     @Length(max = 240)
     private String businessUnitCode;

     @Length(max = 240)
     private String businessUnitName;

     @Length(max = 30)
     private String businessGroup;

     private Float companyId;

     @Length(max = 240)
     private String compnayName;

     @Length(max = 1)
     private String enabledFlag;

     @Length(max = 2000)
     private String comments;

     @Length(max = 240)
     private String displayCode;

     @Length(max = 1)
     private String companyMaintenanceFlag;

     private Float lastUpdateVersion;


     public void setBusinessUnitId(Float businessUnitId){
         this.businessUnitId = businessUnitId;
     }

     public Float getBusinessUnitId(){
         return businessUnitId;
     }

     public void setBusinessUnitCode(String businessUnitCode){
         this.businessUnitCode = businessUnitCode;
     }

     public String getBusinessUnitCode(){
         return businessUnitCode;
     }

     public void setBusinessUnitName(String businessUnitName){
         this.businessUnitName = businessUnitName;
     }

     public String getBusinessUnitName(){
         return businessUnitName;
     }

     public void setBusinessGroup(String businessGroup){
         this.businessGroup = businessGroup;
     }

     public String getBusinessGroup(){
         return businessGroup;
     }

     public void setCompanyId(Float companyId){
         this.companyId = companyId;
     }

     public Float getCompanyId(){
         return companyId;
     }

     public void setCompnayName(String compnayName){
         this.compnayName = compnayName;
     }

     public String getCompnayName(){
         return compnayName;
     }

     public void setEnabledFlag(String enabledFlag){
         this.enabledFlag = enabledFlag;
     }

     public String getEnabledFlag(){
         return enabledFlag;
     }

     public void setComments(String comments){
         this.comments = comments;
     }

     public String getComments(){
         return comments;
     }

     public void setDisplayCode(String displayCode){
         this.displayCode = displayCode;
     }

     public String getDisplayCode(){
         return displayCode;
     }

     public void setCompanyMaintenanceFlag(String companyMaintenanceFlag){
         this.companyMaintenanceFlag = companyMaintenanceFlag;
     }

     public String getCompanyMaintenanceFlag(){
         return companyMaintenanceFlag;
     }

     public void setLastUpdateVersion(Float lastUpdateVersion){
         this.lastUpdateVersion = lastUpdateVersion;
     }

     public Float getLastUpdateVersion(){
         return lastUpdateVersion;
     }

     }