package com.hand.spc.pspc_classify_relation.dto;

/**Auto Generated By Hap Code Generator**/
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import com.hand.hap.mybatis.annotation.ExtensionAttribute;
import org.hibernate.validator.constraints.Length;
import javax.persistence.Table;
import com.hand.hap.system.dto.BaseDTO;
import javax.validation.constraints.NotNull;
@ExtensionAttribute(disable=true)
@Table(name = "pspc_classify_relation")
public class ClassifyRelation extends BaseDTO {

     public static final String FIELD_CLASSIFY_RELATION_ID = "classifyRelationId";
     public static final String FIELD_TENANT_ID = "tenantId";
     public static final String FIELD_SITE_ID = "siteId";
     public static final String FIELD_CLASSIFY_ID = "classifyId";
     public static final String FIELD_CLASSIFY_GROUP_ID = "classifyGroupId";
     public static final String FIELD_SEQUENCE = "sequence";


     @Id
     @GeneratedValue
     private Long classifyRelationId; //表ID，主键

     @NotNull
     private Long tenantId; //租户ID

     @NotNull
     private Long siteId; //站点ID

     @NotNull
     private Long classifyId; //分类项ID

     @NotNull
     private Long classifyGroupId; //分类组ID

     private Long sequence; //顺序


     public void setClassifyRelationId(Long classifyRelationId){
         this.classifyRelationId = classifyRelationId;
     }

     public Long getClassifyRelationId(){
         return classifyRelationId;
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

     public void setClassifyId(Long classifyId){
         this.classifyId = classifyId;
     }

     public Long getClassifyId(){
         return classifyId;
     }

     public void setClassifyGroupId(Long classifyGroupId){
         this.classifyGroupId = classifyGroupId;
     }

     public Long getClassifyGroupId(){
         return classifyGroupId;
     }

     public void setSequence(Long sequence){
         this.sequence = sequence;
     }

     public Long getSequence(){
         return sequence;
     }

     }