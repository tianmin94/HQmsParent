package com.hand.dimension.hqm_dimension_step.dto;

/**Auto Generated By Hap Code Generator**/
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import com.hand.hap.mybatis.annotation.ExtensionAttribute;
import org.hibernate.validator.constraints.Length;
import javax.persistence.Table;
import com.hand.hap.system.dto.BaseDTO;
@ExtensionAttribute(disable=true)
@Table(name = "HQM_8D_STEP")
public class DimensionStep extends BaseDTO {

     public static final String FIELD_KID = "kid";
     public static final String FIELD_ORDER_ID = "orderId";
     public static final String FIELD_STEP = "step";
     public static final String FIELD_STATUS = "status";


     @Id
     @GeneratedValue
     private Float kid;

     private Float orderId;

     private Float step;

     @Length(max = 30)
     private String status;


     public void setKid(Float kid){
         this.kid = kid;
     }

     public Float getKid(){
         return kid;
     }

     public void setOrderId(Float orderId){
         this.orderId = orderId;
     }

     public Float getOrderId(){
         return orderId;
     }

     public void setStep(Float step){
         this.step = step;
     }

     public Float getStep(){
         return step;
     }

     public void setStatus(String status){
         this.status = status;
     }

     public String getStatus(){
         return status;
     }

     }
