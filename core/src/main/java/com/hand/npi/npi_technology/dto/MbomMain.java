package com.hand.npi.npi_technology.dto;

/**Auto Generated By Hap Code Generator**/
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import com.hand.hap.mybatis.annotation.ExtensionAttribute;
import org.hibernate.validator.constraints.Length;
import javax.persistence.Table;
import com.hand.hap.system.dto.BaseDTO;
import java.util.Date;
@ExtensionAttribute(disable=true)
@Table(name = "NPI_MBOM_MAIN")
public class MbomMain extends BaseDTO {

     public static final String FIELD_SKU_ID = "skuId";
     public static final String FIELD_SKU_CODE = "skuCode";
     public static final String FIELD_PLANT_ID = "plantId";
     public static final String FIELD_ITEM_ID = "itemId";
     public static final String FIELD_USAGE = "usage";
     public static final String FIELD_DESCRIPTION = "description";
     public static final String FIELD_BASE_QTY = "baseQty";
     public static final String FIELD_EFFECTIVE_DATE = "effectiveDate";
     public static final String FIELD_VERSION = "version";
     public static final String FIELD_CHANGE_NUMBER = "changeNumber";


     @Id
     @GeneratedValue
     private Float skuId;

     @Length(max = 20)
     private String skuCode;

     @Length(max = 20)
     private String plantId;

     @Length(max = 15)
     private String itemId;

     @Length(max = 20)
     private String usage;

     @Length(max = 50)
     private String description;

     private Float baseQty;

     private Date effectiveDate;

     @Length(max = 10)
     private String version;

     @Length(max = 30)
     private String changeNumber;


     public void setSkuId(Float skuId){
         this.skuId = skuId;
     }

     public Float getSkuId(){
         return skuId;
     }

     public void setSkuCode(String skuCode){
         this.skuCode = skuCode;
     }

     public String getSkuCode(){
         return skuCode;
     }

     public void setPlantId(String plantId){
         this.plantId = plantId;
     }

     public String getPlantId(){
         return plantId;
     }

     public void setItemId(String itemId){
         this.itemId = itemId;
     }

     public String getItemId(){
         return itemId;
     }

     public void setUsage(String usage){
         this.usage = usage;
     }

     public String getUsage(){
         return usage;
     }

     public void setDescription(String description){
         this.description = description;
     }

     public String getDescription(){
         return description;
     }

     public void setBaseQty(Float baseQty){
         this.baseQty = baseQty;
     }

     public Float getBaseQty(){
         return baseQty;
     }

     public void setEffectiveDate(Date effectiveDate){
         this.effectiveDate = effectiveDate;
     }

     public Date getEffectiveDate(){
         return effectiveDate;
     }

     public void setVersion(String version){
         this.version = version;
     }

     public String getVersion(){
         return version;
     }

     public void setChangeNumber(String changeNumber){
         this.changeNumber = changeNumber;
     }

     public String getChangeNumber(){
         return changeNumber;
     }

     }