package com.hand.hqm.hqm_position_analyst_rel.dto;

/**Auto Generated By Hap Code Generator**/
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import com.hand.hap.mybatis.annotation.ExtensionAttribute;
import org.hibernate.validator.constraints.Length;
import javax.persistence.Table;
import javax.persistence.Transient;

import com.hand.hap.system.dto.BaseDTO;

@ExtensionAttribute(disable = true)
@Table(name = "HQM_POSITION_ANALYST_REL")
public class PositionAnalystRel extends BaseDTO {

	public static final String FIELD_REL_ID = "relId";
	public static final String FIELD_PLANT_ID = "plantId";
	public static final String FIELD_POSITION_TITLE = "positionTitle";
	public static final String FIELD_ANALYST_ID = "analystId";
	public static final String FIELD_ENABLE_FLAG = "enableFlag";

	@Id
	@GeneratedValue
	private Float relId;

	private Float plantId;

	@Length(max = 30)
	private String positionTitle;

	private Float analystId;

	@Length(max = 15)
	private String enableFlag;

	@Transient
	private String plantName;// 工厂名称
	@Transient
	private String plantCode;// 工厂编码
	@Transient
	private String userName;// 分析人

	public String getPlantName() {
		return plantName;
	}

	public String getPlantCode() {
		return plantCode;
	}

	public String getUserName() {
		return userName;
	}

	public void setPlantName(String plantName) {
		this.plantName = plantName;
	}

	public void setPlantCode(String plantCode) {
		this.plantCode = plantCode;
	}

	public void setUserName(String userName) {
		this.userName = userName;
	}

	public void setRelId(Float relId) {
		this.relId = relId;
	}

	public Float getRelId() {
		return relId;
	}

	public void setPlantId(Float plantId) {
		this.plantId = plantId;
	}

	public Float getPlantId() {
		return plantId;
	}

	public void setPositionTitle(String positionTitle) {
		this.positionTitle = positionTitle;
	}

	public String getPositionTitle() {
		return positionTitle;
	}

	public void setAnalystId(Float analystId) {
		this.analystId = analystId;
	}

	public Float getAnalystId() {
		return analystId;
	}

	public void setEnableFlag(String enableFlag) {
		this.enableFlag = enableFlag;
	}

	public String getEnableFlag() {
		return enableFlag;
	}

}
