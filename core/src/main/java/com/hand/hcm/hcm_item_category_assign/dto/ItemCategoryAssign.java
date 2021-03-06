package com.hand.hcm.hcm_item_category_assign.dto;

/**Auto Generated By Hap Code Generator**/
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import com.hand.hap.mybatis.annotation.ExtensionAttribute;
import org.hibernate.validator.constraints.Length;
import javax.persistence.Table;
import com.hand.hap.system.dto.BaseDTO;
@ExtensionAttribute(disable=true)
@Table(name = "HCM_ITEM_CATEGORY_ASSIGN")
public class ItemCategoryAssign extends BaseDTO {

     public static final String FIELD_KID = "kid";
     public static final String FIELD_CATEGORY_ID = "categoryId";
     public static final String FIELD_ITEM_ID = "itemId";
     public static final String FIELD_PLANT_ID = "plantId";
     public static final String FIELD_CATEGORY_SET_ID = "categorySetId";
     public static final String FIELD_CID = "cid";


     @Id
     @GeneratedValue
     private Float kid;

     private Float categoryId;

     private Float itemId;

     private Float plantId;

     private Float categorySetId;

     private Float cid;


     public void setKid(Float kid){
         this.kid = kid;
     }

     public Float getKid(){
         return kid;
     }

     public void setCategoryId(Float categoryId){
         this.categoryId = categoryId;
     }

     public Float getCategoryId(){
         return categoryId;
     }

     public void setItemId(Float itemId){
         this.itemId = itemId;
     }

     public Float getItemId(){
         return itemId;
     }

     public void setPlantId(Float plantId){
         this.plantId = plantId;
     }

     public Float getPlantId(){
         return plantId;
     }

     public void setCategorySetId(Float categorySetId){
         this.categorySetId = categorySetId;
     }

     public Float getCategorySetId(){
         return categorySetId;
     }

     public void setCid(Float cid){
         this.cid = cid;
     }

     public Float getCid(){
         return cid;
     }

     }
