package com.hand.spc.pspc_ce_parameter_relation.dto;

/**Auto Generated By Hap Code Generator**/
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import com.hand.hap.mybatis.annotation.ExtensionAttribute;
import org.hibernate.validator.constraints.Length;
import javax.persistence.Table;
import com.hand.hap.system.dto.BaseDTO;
import javax.validation.constraints.NotNull;
@ExtensionAttribute(disable=true)
@Table(name = "pspc_ce_parameter_relation")
public class CeParameterRelation extends BaseDTO {

     public static final String FIELD_RELATION_ID = "relationId";
     public static final String FIELD_TENANT_ID = "tenantId";
     public static final String FIELD_SITE_ID = "siteId";
     public static final String FIELD_CE_PARAMETER_ID = "ceParameterId";
     public static final String FIELD_CLASSIFY_GROUP_ID = "classifyGroupId";


     @Id
     @GeneratedValue
     private Long relationId; //表ID，主键

     @NotNull
     private Long tenantId; //租户ID

     @NotNull
     private Long siteId; //站点ID

     @NotNull
     private Long ceParameterId; //控制要素ID

     @NotNull
     private Long classifyGroupId; //分类组ID


     public void setRelationId(Long relationId){
         this.relationId = relationId;
     }

     public Long getRelationId(){
         return relationId;
     }

     public void setTenantId(Long tenantId){
         this.tenantId = tenantId;
     }

     public Long getTenantId(){
         return tenantId;
     }

     public void setSiteId(Long siteId){
         this.siteId = siteId;
     }

     public Long getSiteId(){
         return siteId;
     }

     public void setCeParameterId(Long ceParameterId){
         this.ceParameterId = ceParameterId;
     }

     public Long getCeParameterId(){
         return ceParameterId;
     }

     public void setClassifyGroupId(Long classifyGroupId){
         this.classifyGroupId = classifyGroupId;
     }

     public Long getClassifyGroupId(){
         return classifyGroupId;
     }

     }
