package com.hand.hqm.hqm_msa_linear_value.dto;

import java.util.List;
import java.util.Map;

/**Auto Generated By Hap Code Generator**/
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import com.hand.hap.mybatis.annotation.ExtensionAttribute;
import org.hibernate.validator.constraints.Length;
import javax.persistence.Table;
import javax.persistence.Transient;

import com.hand.hap.system.dto.BaseDTO;
@ExtensionAttribute(disable=true)
@Table(name = "HQM_MSA_LINEAR_VALUE")
public class MsaLinearValue extends BaseDTO {

     public static final String FIELD_MSA_LINEAR_VALUE_ID = "msaLinearValueId";
     public static final String FIELD_MSA_PLAN_ID = "msaPlanId";
     public static final String FIELD_SAMPLE_NUM = "sampleNum";
     public static final String FIELD_MEASURE_NUM = "measureNum";
     public static final String FIELD_MEASURE_VALUE = "measureValue";
     public static final String FIELD_STANDARD_VALUE = "standardValue";
     public static final String FIELD_BIAS = "bias";


     @Id
     @GeneratedValue
     private Float msaLinearValueId;

     private Float msaPlanId;

     @Length(max = 50)
     private String sampleNum;

     private Float measureNum;

     private Float measureValue;

     private Float standardValue;

     private Float bias;
     
     @Transient
     private List<String> sampleNumAndstandardValueList;//列
     @Transient
     private Map<Float,List<MsaLinearValue>> map;//行
     
     @Transient
     private String measuredBy;//测量人
     @Transient
     private Float expectedDeterioration;//预计过程变差
     @Transient 
     private String sampleDescription;//样品名称
     
     
     public String getMeasuredBy() {
		return measuredBy;
	}

	public Float getExpectedDeterioration() {
		return expectedDeterioration;
	}

	public String getSampleDescription() {
		return sampleDescription;
	}

	public void setMeasuredBy(String measuredBy) {
		this.measuredBy = measuredBy;
	}

	public void setExpectedDeterioration(Float expectedDeterioration) {
		this.expectedDeterioration = expectedDeterioration;
	}

	public void setSampleDescription(String sampleDescription) {
		this.sampleDescription = sampleDescription;
	}

	public List<String> getSampleNumAndstandardValueList() {
		return sampleNumAndstandardValueList;
	}

	public Map<Float, List<MsaLinearValue>> getMap() {
		return map;
	}

	public void setSampleNumAndstandardValueList(List<String> sampleNumAndstandardValueList) {
		this.sampleNumAndstandardValueList = sampleNumAndstandardValueList;
	}

	public void setMap(Map<Float, List<MsaLinearValue>> map) {
		this.map = map;
	}

	public String getSampleNumAndstandardValue() {
    	 return this.sampleNum + "," + this.standardValue;
     }
     
     public void setMsaLinearValueId(Float msaLinearValueId){
         this.msaLinearValueId = msaLinearValueId;
     }

     public Float getMsaLinearValueId(){
         return msaLinearValueId;
     }

     public void setMsaPlanId(Float msaPlanId){
         this.msaPlanId = msaPlanId;
     }

     public Float getMsaPlanId(){
         return msaPlanId;
     }

     public void setSampleNum(String sampleNum){
         this.sampleNum = sampleNum;
     }

     public String getSampleNum(){
         return sampleNum;
     }

     public void setMeasureNum(Float measureNum){
         this.measureNum = measureNum;
     }

     public Float getMeasureNum(){
         return measureNum;
     }

     public void setMeasureValue(Float measureValue){
         this.measureValue = measureValue;
     }

     public Float getMeasureValue(){
         return measureValue;
     }

     public void setStandardValue(Float standardValue){
         this.standardValue = standardValue;
     }

     public Float getStandardValue(){
         return standardValue;
     }

     public void setBias(Float bias){
         this.bias = bias;
     }

     public Float getBias(){
         return bias;
     }

     }