package com.hand.npi.npi_technology.dto;

import java.util.List;

/**Auto Generated By Hap Code Generator**/
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

import com.hand.hap.core.annotation.Children;
import com.hand.hap.mybatis.annotation.ExtensionAttribute;
import org.hibernate.validator.constraints.Length;
import javax.persistence.Table;
import javax.persistence.Transient;

import com.hand.hap.system.dto.BaseDTO;

@ExtensionAttribute(disable = true)
@Table(name = "NPI_INVALID_PATTERN")
public class InvalidPattern extends BaseDTO {

	public static final String FIELD_INVALID_PATTERN_ID = "invalidPatternId";
	public static final String FIELD_INVALID_PATTERN_NUMBER = "invalidPatternNumber";
	public static final String FIELD_INVALID_PATTERN_CONSEQUENCE = "invalidPatternConsequence";
	public static final String FIELD_SPEC_DETAIL_ID = "specDetailId";
	public static final String FIELD_SEV = "sev";

	@Id
	@GeneratedValue
	private Float invalidPatternId;

	@Length(max = 240)
	private String invalidPatternNumber;

	@Length(max = 240)
	private String invalidPatternName;

	@Length(max = 240)
	private String invalidPatternConsequence;

	private Float specDetailId;

	@Length(max = 240)
	private String sev;

	@Transient
	private Float invalidCauseId;

	@Transient
	private Float preventionMeasureId;

	@Length(max = 10)
	private String pfmeaVersion;

	private Float parentId;
	
	@Length(max = 10)
	private String approveStatus;
	
	@Children
	@Transient
	private List<InvalidCause> causeList;
	
	public Float getParentId() {
		return parentId;
	}

	public void setParentId(Float parentId) {
		this.parentId = parentId;
	}

	public List<InvalidCause> getCauseList() {
		return causeList;
	}

	public void setCauseList(List<InvalidCause> causeList) {
		this.causeList = causeList;
	}

	public void setInvalidPatternNumber(String invalidPatternNumber) {
		this.invalidPatternNumber = invalidPatternNumber;
	}

	public String getInvalidPatternNumber() {
		return invalidPatternNumber;
	}

	public void setInvalidPatternConsequence(String invalidPatternConsequence) {
		this.invalidPatternConsequence = invalidPatternConsequence;
	}

	public String getInvalidPatternConsequence() {
		return invalidPatternConsequence;
	}

	public void setSev(String sev) {
		this.sev = sev;
	}

	public String getSev() {
		return sev;
	}

	public String getInvalidPatternName() {
		return invalidPatternName;
	}

	public void setInvalidPatternName(String invalidPatternName) {
		this.invalidPatternName = invalidPatternName;
	}

	public Float getInvalidCauseId() {
		return invalidCauseId;
	}

	public void setInvalidCauseId(Float invalidCauseId) {
		this.invalidCauseId = invalidCauseId;
	}

	public Float getPreventionMeasureId() {
		return preventionMeasureId;
	}

	public void setPreventionMeasureId(Float preventionMeasureId) {
		this.preventionMeasureId = preventionMeasureId;
	}

	public String getApproveStatus() {
		return approveStatus;
	}

	public void setApproveStatus(String approveStatus) {
		this.approveStatus = approveStatus;
	}

	public Float getInvalidPatternId() {
		return invalidPatternId;
	}

	public void setInvalidPatternId(Float invalidPatternId) {
		this.invalidPatternId = invalidPatternId;
	}
	

	public Float getSpecDetailId() {
		return specDetailId;
	}

	public void setSpecDetailId(Float specDetailId) {
		this.specDetailId = specDetailId;
	}

	public String getPfmeaVersion() {
		return pfmeaVersion;
	}

	public void setPfmeaVersion(String pfmeaVersion) {
		this.pfmeaVersion = pfmeaVersion;
	}
	
}
