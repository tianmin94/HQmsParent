package com.hand.hcs.hcs_supplier_major_event.dto;

import java.util.Date;

/**Auto Generated By Hap Code Generator**/
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.persistence.Transient;

import org.hibernate.validator.constraints.Length;

import com.hand.hap.mybatis.annotation.ExtensionAttribute;
import com.hand.hap.system.dto.BaseDTO;

@ExtensionAttribute(disable = true)
@Table(name = "HCS_SUPPLIER_MAJOR_EVENT")
public class SupplierMajorEvent extends BaseDTO {

	public static final String FIELD_EVENT_ID = "eventId";
	public static final String FIELD_SUPPLIER_ID = "supplierId";
	public static final String FIELD_PLANT_ID = "plantId";
	public static final String FIELD_EVENT = "event";
	public static final String FIELD_ITEM_ID = "itemId";
	public static final String FIELD_START_DATE = "startDate";
	public static final String FIELD_END_DATE = "endDate";
	public static final String FIELD_ADJUST_DATE = "adjustDate";
	public static final String FIELD_ENABLE_FLAG = "enableFlag";

	@Id
	@GeneratedValue
	private Float eventId;

	private Float supplierId;

	private Float plantId;

	@Length(max = 240)
	private String event;

	private Float itemId;

	private Date startDate;

	private Date endDate;

	private Float adjustDate;

	@Length(max = 1)
	private String enableFlag;

	@Transient
	private String itemName;// 物料名称

	@Transient
	private String itemCode;// 物料编码

	@Transient
	private String plantCode;// 工厂编码

	@Transient
	private String plantName;// 工厂名称

	@Transient
	private String supplierCode;// 供应商编码

	@Transient
	private String supplierName;// 供应商名称

	@Transient
	private String startDateTo;// 开始日期至

	@Transient
	private String startDateFrom;// 开始日期从

	@Transient
	private String endDateTo;// 结束日期至

	@Transient
	private String endDateFrom;// 结束日期从

	public String getItemName() {
		return itemName;
	}

	public String getItemCode() {
		return itemCode;
	}

	public String getPlantCode() {
		return plantCode;
	}

	public String getPlantName() {
		return plantName;
	}

	public String getSupplierCode() {
		return supplierCode;
	}

	public String getSupplierName() {
		return supplierName;
	}

	public String getStartDateTo() {
		return startDateTo;
	}

	public String getStartDateFrom() {
		return startDateFrom;
	}

	public String getEndDateTo() {
		return endDateTo;
	}

	public String getEndDateFrom() {
		return endDateFrom;
	}

	public void setItemName(String itemName) {
		this.itemName = itemName;
	}

	public void setItemCode(String itemCode) {
		this.itemCode = itemCode;
	}

	public void setPlantCode(String plantCode) {
		this.plantCode = plantCode;
	}

	public void setPlantName(String plantName) {
		this.plantName = plantName;
	}

	public void setSupplierCode(String supplierCode) {
		this.supplierCode = supplierCode;
	}

	public void setSupplierName(String supplierName) {
		this.supplierName = supplierName;
	}

	public void setStartDateTo(String startDateTo) {
		this.startDateTo = startDateTo;
	}

	public void setStartDateFrom(String startDateFrom) {
		this.startDateFrom = startDateFrom;
	}

	public void setEndDateTo(String endDateTo) {
		this.endDateTo = endDateTo;
	}

	public void setEndDateFrom(String endDateFrom) {
		this.endDateFrom = endDateFrom;
	}

	public void setEventId(Float eventId) {
		this.eventId = eventId;
	}

	public Float getEventId() {
		return eventId;
	}

	public void setSupplierId(Float supplierId) {
		this.supplierId = supplierId;
	}

	public Float getSupplierId() {
		return supplierId;
	}

	public void setPlantId(Float plantId) {
		this.plantId = plantId;
	}

	public Float getPlantId() {
		return plantId;
	}

	


	public String getEvent() {
		return event;
	}

	public void setEvent(String event) {
		this.event = event;
	}

	public void setItemId(Float itemId) {
		this.itemId = itemId;
	}

	public Float getItemId() {
		return itemId;
	}

	public void setStartDate(Date startDate) {
		this.startDate = startDate;
	}

	public Date getStartDate() {
		return startDate;
	}

	public void setEndDate(Date endDate) {
		this.endDate = endDate;
	}

	public Date getEndDate() {
		return endDate;
	}

	

	public Float getAdjustDate() {
		return adjustDate;
	}

	public void setAdjustDate(Float adjustDate) {
		this.adjustDate = adjustDate;
	}

	public void setEnableFlag(String enableFlag) {
		this.enableFlag = enableFlag;
	}

	public String getEnableFlag() {
		return enableFlag;
	}

}
