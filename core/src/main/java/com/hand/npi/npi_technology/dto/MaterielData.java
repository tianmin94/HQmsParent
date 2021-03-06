package com.hand.npi.npi_technology.dto;

/**Auto Generated By Hap Code Generator**/
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import com.hand.hap.mybatis.annotation.ExtensionAttribute;
import org.hibernate.validator.constraints.Length;
import javax.persistence.Table;
import com.hand.hap.system.dto.BaseDTO;
@ExtensionAttribute(disable=true)
@Table(name = "NPI_MATERIEL_DATA")
public class MaterielData extends BaseDTO {

     public static final String FIELD_MATERIEL_ID = "materielId";
     public static final String FIELD_MATERIEL_NUMBER = "materielNumber";
     public static final String FIELD_MATERIEL_NAME = "materielName";
     public static final String FIELD_MATERIEL_ATTRIBUTE_NUMBER = "materielAttributeNumber";
     public static final String FIELD_MATERIEL_ATTRIBUTE_NAME = "materielAttributeName";


     @Id
     @GeneratedValue
     private Float materielId;

     @Length(max = 240)
     private String materielNumber;

     @Length(max = 240)
     private String materielName;

     private String materielAttributeNumber;

     @Length(max = 240)
     private String materielAttributeName;


     public void setMaterielId(Float materielId){
         this.materielId = materielId;
     }

     public Float getMaterielId(){
         return materielId;
     }

     public void setMaterielNumber(String materielNumber){
         this.materielNumber = materielNumber;
     }

     public String getMaterielNumber(){
         return materielNumber;
     }

     public void setMaterielName(String materielName){
         this.materielName = materielName;
     }

     public String getMaterielName(){
         return materielName;
     }

     public void setMaterielAttributeNumber(String materielAttributeNumber){
         this.materielAttributeNumber = materielAttributeNumber;
     }

     public String getMaterielAttributeNumber(){
         return materielAttributeNumber;
     }

     public void setMaterielAttributeName(String materielAttributeName){
         this.materielAttributeName = materielAttributeName;
     }

     public String getMaterielAttributeName(){
         return materielAttributeName;
     }

     }
