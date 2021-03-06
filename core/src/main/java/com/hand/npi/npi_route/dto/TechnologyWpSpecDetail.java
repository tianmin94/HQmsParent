package com.hand.npi.npi_route.dto;

/**Auto Generated By Hap Code Generator**/
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import com.hand.hap.mybatis.annotation.ExtensionAttribute;
import org.hibernate.validator.constraints.Length;
import javax.persistence.Table;
import com.hand.hap.system.dto.BaseDTO;

@ExtensionAttribute(disable = true)
@Table(name = "NPI_TECHNOLOGY_WP_SPEC_DETAIL")
public class TechnologyWpSpecDetail extends BaseDTO {
	// 工艺动作-SPEC要求表
	public static final String FIELD_DETAIL_ID = "detailId";
	public static final String FIELD_SPEC_REQUIREMENT = "specRequirement";
	public static final String FIELD_METERING_COUNT = "meteringCount";
	public static final String FIELD_LOWER_LIMIT = "lowerLimit";
	public static final String FIELD_UPPER_LIMIT = "upperLimit";
	public static final String FIELD_UNIT = "unit";
	public static final String FIELD_MSA = "msa";
	public static final String FIELD_SPC = "spc";
	public static final String FIELD_WP_CODE = "wpCode";
	public static final String FIELD_WP_VERSION = "wpVersion";
	public static final String FIELD_ROUTE_CODE = "routeCode";
	public static final String FIELD_ROUTE_VERSION = "routeVersion";

	@Id
	@GeneratedValue
	private Float detailId;

	private Float routeWpRefId;
	/**
	 * 装配要求明细
	 */
	@Length(max = 240)
	private String specRequirement;

	/**
	 * 计量计数
	 */
	@Length(max = 10)
	private String meteringCount;

	/**
	 * 下限
	 */
	private Float lowerLimit;

	/**
	 * 上限
	 */
	private Float upperLimit;

	/**
	 * 单位
	 */
	@Length(max = 100)
	private String unit;

	/**
	 * MSA
	 */
	@Length(max = 240)
	private String msa;

	/**
	 * SPC
	 */
	@Length(max = 240)
	private String spc;

	public void setDetailId(Float detailId) {
		this.detailId = detailId;
	}

	public Float getDetailId() {
		return detailId;
	}

	public void setSpecRequirement(String specRequirement) {
		this.specRequirement = specRequirement;
	}

	public String getSpecRequirement() {
		return specRequirement;
	}

	public void setMeteringCount(String meteringCount) {
		this.meteringCount = meteringCount;
	}

	public String getMeteringCount() {
		return meteringCount;
	}

	public void setLowerLimit(Float lowerLimit) {
		this.lowerLimit = lowerLimit;
	}

	public Float getLowerLimit() {
		return lowerLimit;
	}

	public void setUpperLimit(Float upperLimit) {
		this.upperLimit = upperLimit;
	}

	public Float getUpperLimit() {
		return upperLimit;
	}

	public void setUnit(String unit) {
		this.unit = unit;
	}

	public String getUnit() {
		return unit;
	}

	public void setMsa(String msa) {
		this.msa = msa;
	}

	public String getMsa() {
		return msa;
	}

	public void setSpc(String spc) {
		this.spc = spc;
	}

	public String getSpc() {
		return spc;
	}

	public Float getRouteWpRefId() {
		return routeWpRefId;
	}

	public void setRouteWpRefId(Float routeWpRefId) {
		this.routeWpRefId = routeWpRefId;
	}

}
