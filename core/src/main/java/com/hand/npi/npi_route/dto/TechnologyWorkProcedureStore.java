package com.hand.npi.npi_route.dto;

/**Auto Generated By Hap Code Generator**/
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import com.hand.hap.mybatis.annotation.ExtensionAttribute;
import org.hibernate.validator.constraints.Length;
import javax.persistence.Table;
import com.hand.hap.system.dto.BaseDTO;

@ExtensionAttribute(disable = true)
@Table(name = "NPI_TECHNOLOGY_WORK_PROCEDURE_STORE")
public class TechnologyWorkProcedureStore extends BaseDTO {

	public static final String FIELD_ID = "id";
	public static final String FIELD_WP_CODE = "wpCode";
	public static final String FIELD_WORKING_PROCEDURE_NAME = "workingProcedureName";
	public static final String FIELD_VERSION_NUMBER = "versionNumber";
	public static final String FIELD_ROUTE_VERSION = "routeVersion";
	public static final String FIELD_STANDARD_ACTION_ID = "standardActionId";

	@Id
	@GeneratedValue
	private Float wpId;

	// 工序编码
	@Length(max = 50)
	private String wpCode;

	// 工序名称
	@Length(max = 240)
	private String wpName;

	// 工序版本
	@Length(max = 10)
	private String wpVersion;

	// 标准动作
	private Float standardActionId;


	public void setWpCode(String wpCode) {
		this.wpCode = wpCode;
	}

	public String getWpCode() {
		return wpCode;
	}

	public void setStandardActionId(Float standardActionId) {
		this.standardActionId = standardActionId;
	}

	public Float getStandardActionId() {
		return standardActionId;
	}

	public Float getWpId() {
		return wpId;
	}

	public void setWpId(Float wpId) {
		this.wpId = wpId;
	}

	public String getWpName() {
		return wpName;
	}

	public void setWpName(String wpName) {
		this.wpName = wpName;
	}

	public String getWpVersion() {
		return wpVersion;
	}

	public void setWpVersion(String wpVersion) {
		this.wpVersion = wpVersion;
	}

	
}
