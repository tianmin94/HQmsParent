package com.hand.npi.npi_technology.dto;

/**Auto Generated By Hap Code Generator**/
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import com.hand.hap.mybatis.annotation.ExtensionAttribute;
import org.hibernate.validator.constraints.Length;
import javax.persistence.Table;
import com.hand.hap.system.dto.BaseDTO;
@ExtensionAttribute(disable=true)
@Table(name = "NPI_INVALID_PATTERN_HIS")
public class InvalidPatternHis extends BaseDTO {

     public static final String FIELD_HIS_INVALID_PATTERN_ID = "hisInvalidPatternId";
     public static final String FIELD_INVALID_PATTERN_NUMBER = "invalidPatternNumber";
     public static final String FIELD_INVALID_PATTERN_CONSEQUENCE = "invalidPatternConsequence";
     public static final String FIELD_HIS_SPEC_DETAIL_ID	 = "hisSpecDetailId";
     public static final String FIELD_SEV = "sev";
     public static final String FIELD_INVALID_PATTERN_NAME = "invalidPatternName";
     public static final String FIELD_PARENT_ID = "parentId";
     public static final String FIELD_PFMEA_VERSION = "pfmeaVersion";
     public static final String FIELD_INVALID_PATTERN_ID = "invalidPatternId";


     @Id
     @GeneratedValue
     private Float hisInvalidPatternId;

     @Length(max = 240)
     private String invalidPatternNumber;

     @Length(max = 240)
     private String invalidPatternConsequence;

     private Float hisSpecDetailId;

     @Length(max = 240)
     private String sev;

     @Length(max = 240)
     private String invalidPatternName;

     private Float parentId;

     @Length(max = 10)
     private String pfmeaVersion;

     private Float invalidPatternId;

	public Float getHisInvalidPatternId() {
		return hisInvalidPatternId;
	}

	public void setHisInvalidPatternId(Float hisInvalidPatternId) {
		this.hisInvalidPatternId = hisInvalidPatternId;
	}

	public String getInvalidPatternNumber() {
		return invalidPatternNumber;
	}

	public void setInvalidPatternNumber(String invalidPatternNumber) {
		this.invalidPatternNumber = invalidPatternNumber;
	}

	public String getInvalidPatternConsequence() {
		return invalidPatternConsequence;
	}

	public void setInvalidPatternConsequence(String invalidPatternConsequence) {
		this.invalidPatternConsequence = invalidPatternConsequence;
	}

	public Float getHisSpecDetailId() {
		return hisSpecDetailId;
	}

	public void setHisSpecDetailId(Float hisSpecDetailId) {
		this.hisSpecDetailId = hisSpecDetailId;
	}

	public String getSev() {
		return sev;
	}

	public void setSev(String sev) {
		this.sev = sev;
	}

	public String getInvalidPatternName() {
		return invalidPatternName;
	}

	public void setInvalidPatternName(String invalidPatternName) {
		this.invalidPatternName = invalidPatternName;
	}

	public Float getParentId() {
		return parentId;
	}

	public void setParentId(Float parentId) {
		this.parentId = parentId;
	}

	public String getPfmeaVersion() {
		return pfmeaVersion;
	}

	public void setPfmeaVersion(String pfmeaVersion) {
		this.pfmeaVersion = pfmeaVersion;
	}

	public Float getInvalidPatternId() {
		return invalidPatternId;
	}

	public void setInvalidPatternId(Float invalidPatternId) {
		this.invalidPatternId = invalidPatternId;
	}

     }
