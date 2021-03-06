package com.hand.npi.npi_technology.dto;

/**Auto Generated By Hap Code Generator**/
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import com.hand.hap.mybatis.annotation.ExtensionAttribute;
import org.hibernate.validator.constraints.Length;
import javax.persistence.Table;
import javax.persistence.Transient;

import com.hand.hap.system.dto.BaseDTO;
import java.util.Date;

@ExtensionAttribute(disable = true)
@Table(name = "NPI_SOP_ROUTE_REF")
public class SopRouteRef extends BaseDTO {

	public static final String FIELD_REF_ID = "refId";
	public static final String FIELD_ROUTE_ID = "routeId";
	public static final String FIELD_SOP_ID = "sopId";
	public static final String FIELD_ANIMATION_VERSION = "animationVersion";
	public static final String FIELD_AFTER_SOP_ID = "afterSopId";
	public static final String FIELD_BEGIN_DATE = "beginDate";
	public static final String FIELD_WFL_CODE = "wflCode";
	public static final String FIELD_VERSION_NUMBER = "versionNumber";

	@Id
	@GeneratedValue
	private Float refId;

	/**
	 * 工艺路线ID
	 */
	private Float routeId;

	/**
	 * SOP动画ID
	 */
	private Float sopId;

	@Length(max = 10)
	private String animationVersion;

	/**
	 * 变更后SOP动画ID
	 */
	private Float afterSopId;

	/**
	 * 生效日期
	 */
	private Date beginDate;

	@Length(max = 30)
	private String wflCode;

	private Float versionNumber;

	@Transient
	private String routeCode;
	@Transient
	private String beforeSopCode;
	@Transient
	private String beforeSopName;
	@Transient
	private String afterSopCode;
	@Transient
	private String afterSopName;
	@Transient
	private String fileId;
	@Transient
	private String sku;
	@Transient
	private String itemCode;

	public String getFileId() {
		return fileId;
	}

	public void setFileId(String fileId) {
		this.fileId = fileId;
	}

	public String getSku() {
		return sku;
	}

	public void setSku(String sku) {
		this.sku = sku;
	}

	public String getItemCode() {
		return itemCode;
	}

	public void setItemCode(String itemCode) {
		this.itemCode = itemCode;
	}

	public void setRefId(Float refId) {
		this.refId = refId;
	}

	public Float getRefId() {
		return refId;
	}

	public void setRouteId(Float routeId) {
		this.routeId = routeId;
	}

	public Float getRouteId() {
		return routeId;
	}

	public void setSopId(Float sopId) {
		this.sopId = sopId;
	}

	public Float getSopId() {
		return sopId;
	}

	public void setAnimationVersion(String animationVersion) {
		this.animationVersion = animationVersion;
	}

	public String getAnimationVersion() {
		return animationVersion;
	}

	public void setAfterSopId(Float afterSopId) {
		this.afterSopId = afterSopId;
	}

	public Float getAfterSopId() {
		return afterSopId;
	}

	public void setBeginDate(Date beginDate) {
		this.beginDate = beginDate;
	}

	public Date getBeginDate() {
		return beginDate;
	}

	public void setWflCode(String wflCode) {
		this.wflCode = wflCode;
	}

	public String getWflCode() {
		return wflCode;
	}

	public void setVersionNumber(Float versionNumber) {
		this.versionNumber = versionNumber;
	}

	public Float getVersionNumber() {
		return versionNumber;
	}

	public String getRouteCode() {
		return routeCode;
	}

	public void setRouteCode(String routeCode) {
		this.routeCode = routeCode;
	}

	public String getBeforeSopCode() {
		return beforeSopCode;
	}

	public void setBeforeSopCode(String beforeSopCode) {
		this.beforeSopCode = beforeSopCode;
	}

	public String getBeforeSopName() {
		return beforeSopName;
	}

	public void setBeforeSopName(String beforeSopName) {
		this.beforeSopName = beforeSopName;
	}

	public String getAfterSopCode() {
		return afterSopCode;
	}

	public void setAfterSopCode(String afterSopCode) {
		this.afterSopCode = afterSopCode;
	}

	public String getAfterSopName() {
		return afterSopName;
	}

	public void setAfterSopName(String afterSopName) {
		this.afterSopName = afterSopName;
	}

}
