package com.hand.npi.npi_route.dto;

/**Auto Generated By Hap Code Generator**/
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import com.hand.hap.mybatis.annotation.ExtensionAttribute;
import org.hibernate.validator.constraints.Length;
import javax.persistence.Table;
import com.hand.hap.system.dto.BaseDTO;

@ExtensionAttribute(disable = true)
@Table(name = "NPI_TECHNOLOGY_WP_MATERIEL_REF")
public class TechnologyWpMaterielRef extends BaseDTO {
	//工艺动作(辅助)-物料属性表
	public static final String FIELD_WP_MATE_ID = "wpMateId";
	public static final String FIELD_MATE_CODE = "mateCode";
	public static final String FIELD_MATE_ATTR_CODE = "mateAttrCode";
	public static final String FIELD_WP_ID = "wpId";

	@Id
	@GeneratedValue
	private Float auxMatRefId;

	/**
	 * 物料属性编码
	 */
	@Length(max = 50)
	private String matAttrCode;

	/**
	 * 工艺动作ID
	 */
	private Float wpAuxId;


	public String getMatAttrCode() {
		return matAttrCode;
	}

	public void setMatAttrCode(String matAttrCode) {
		this.matAttrCode = matAttrCode;
	}


	public Float getWpAuxId() {
		return wpAuxId;
	}

	public void setWpAuxId(Float wpAuxId) {
		this.wpAuxId = wpAuxId;
	}

	public Float getAuxMatRefId() {
		return auxMatRefId;
	}

	public void setAuxMatRefId(Float auxMatRefId) {
		this.auxMatRefId = auxMatRefId;
	}
}
