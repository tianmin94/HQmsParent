package com.hand.hqm.file_type.dto;

/**Auto Generated By Hap Code Generator**/
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import com.hand.hap.mybatis.annotation.ExtensionAttribute;
import org.hibernate.validator.constraints.Length;
import javax.persistence.Table;
import javax.persistence.Transient;

import com.hand.hap.system.dto.BaseDTO;
@ExtensionAttribute(disable=true)
@Table(name = "FILE_TYPE")
public class FileType extends BaseDTO {

     public static final String FIELD_FILE_TYPE_ID = "fileTypeId";
     public static final String FIELD_FILE_TYPE_NAME = "fileTypeName";
     public static final String FIELD_FILE_TYPE_CODE = "fileTypeCode";
     public static final String FIELD_OWNER = "owner";
     public static final String FIELD_FILE_URL = "fileUrl";
     public static final String FIELD_IS_AUTO_APPROVAL = "isAutoApproval";
     public static final String FIELD_CALCULATION_RULE = "calculationRule";
     public static final String FIELD_APPLICANT = "applicant";
     public static final String FIELD_APPROVER_ONE = "approverOne";
     public static final String FIELD_APPROVER_TWO = "approverTwo";
     public static final String FIELD_APPROVER_THREE = "approverThree";
     public static final String FIELD_REMARK = "remark";


     @Id
     @GeneratedValue
     private Float fileTypeId;

     @Length(max = 64)
     private String fileTypeName;

     @Length(max = 64)
     private String fileTypeCode;

     @Length(max = 64)
     private String owner;

     @Length(max = 64)
     private String fileUrl;

     @Length(max = 64)
     private String isAutoApproval;

     @Length(max = 64)
     private String calculationRule;

     private Float applicant;

     private Float approverOne;

     private Float approverTwo;

     private Float approverThree;
     
     @Transient
     private String approverOneName;
     
     @Transient
     private String approverTwoName;
     
     @Transient
     private String approverThreeName;

     public String getApproverOneName() {
		return approverOneName;
	}

	public void setApproverOneName(String approverOneName) {
		this.approverOneName = approverOneName;
	}

	public String getApproverTwoName() {
		return approverTwoName;
	}

	public void setApproverTwoName(String approverTwoName) {
		this.approverTwoName = approverTwoName;
	}

	public String getApproverThreeName() {
		return approverThreeName;
	}

	public void setApproverThreeName(String approverThreeName) {
		this.approverThreeName = approverThreeName;
	}

	@Length(max = 240)
     private String remark;


     public void setFileTypeId(Float fileTypeId){
         this.fileTypeId = fileTypeId;
     }

     public Float getFileTypeId(){
         return fileTypeId;
     }

     public void setFileTypeName(String fileTypeName){
         this.fileTypeName = fileTypeName;
     }

     public String getFileTypeName(){
         return fileTypeName;
     }

     public void setFileTypeCode(String fileTypeCode){
         this.fileTypeCode = fileTypeCode;
     }

     public String getFileTypeCode(){
         return fileTypeCode;
     }

     public void setOwner(String owner){
         this.owner = owner;
     }

     public String getOwner(){
         return owner;
     }

     public void setFileUrl(String fileUrl){
         this.fileUrl = fileUrl;
     }

     public String getFileUrl(){
         return fileUrl;
     }

     public void setIsAutoApproval(String isAutoApproval){
         this.isAutoApproval = isAutoApproval;
     }

     public String getIsAutoApproval(){
         return isAutoApproval;
     }

     public void setCalculationRule(String calculationRule){
         this.calculationRule = calculationRule;
     }

     public String getCalculationRule(){
         return calculationRule;
     }

     public void setApplicant(Float applicant){
         this.applicant = applicant;
     }

     public Float getApplicant(){
         return applicant;
     }

     public void setApproverOne(Float approverOne){
         this.approverOne = approverOne;
     }

     public Float getApproverOne(){
         return approverOne;
     }

     public void setApproverTwo(Float approverTwo){
         this.approverTwo = approverTwo;
     }

     public Float getApproverTwo(){
         return approverTwo;
     }

     public void setApproverThree(Float approverThree){
         this.approverThree = approverThree;
     }

     public Float getApproverThree(){
         return approverThree;
     }

     public void setRemark(String remark){
         this.remark = remark;
     }

     public String getRemark(){
         return remark;
     }

     }