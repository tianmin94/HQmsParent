package com.hand.hqm.hqm_standard_op_item_l_his.dto;

/**Auto Generated By Hap Code Generator**/
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import com.hand.hap.mybatis.annotation.ExtensionAttribute;
import org.hibernate.validator.constraints.Length;
import javax.persistence.Table;
import com.hand.hap.system.dto.BaseDTO;
import java.util.Date;

@ExtensionAttribute(disable = true)
@Table(name = "HQM_STANDARD_OP_ITEM_L_HIS")
public class StandardOpItemLHis extends BaseDTO {

	@Id
	@GeneratedValue
	private Float eventId;

	private Float attributeId;
	
	private Long eventBy;

	private Date eventTime;

	private Float headId;

	private Float lineId;

	private Float sampleSize;

	@Length(max = 30)
	private String standradFrom;

	@Length(max = 30)
	private String standradTo;

	@Length(max = 30)
	private String standradUom;

	@Length(max = 500)
	private String textStandrad;

	@Length(max = 30)
	private String inspectionTool;

	@Length(max = 200)
	private String remark;

	private Date enableTime;

	private Date disableTime;

	private Float precision;

	@Length(max = 30)
	private String inspectionMethod;

	private Float sampleWayId;

	@Length(max = 1)
	private String isSync;

	@Length(max = 30)
	private String fillInType;
	
	private Float eventHId;

	public Float getAttributeId() {
		return attributeId;
	}

	public void setAttributeId(Float attributeId) {
		this.attributeId = attributeId;
	}
	
	public Float getEventHId() {
		return eventHId;
	}

	public void setEventHId(Float eventHId) {
		this.eventHId = eventHId;
	}

	public void setEventId(Float eventId) {
		this.eventId = eventId;
	}

	public Float getEventId() {
		return eventId;
	}

	public void setEventBy(Long eventBy) {
		this.eventBy = eventBy;
	}

	public Long getEventBy() {
		return eventBy;
	}

	public void setEventTime(Date eventTime) {
		this.eventTime = eventTime;
	}

	public Date getEventTime() {
		return eventTime;
	}

	public void setHeadId(Float headId) {
		this.headId = headId;
	}

	public Float getHeadId() {
		return headId;
	}

	public void setLineId(Float lineId) {
		this.lineId = lineId;
	}

	public Float getLineId() {
		return lineId;
	}

	public void setSampleSize(Float sampleSize) {
		this.sampleSize = sampleSize;
	}

	public Float getSampleSize() {
		return sampleSize;
	}

	public void setStandradFrom(String standradFrom) {
		this.standradFrom = standradFrom;
	}

	public String getStandradFrom() {
		return standradFrom;
	}

	public void setStandradTo(String standradTo) {
		this.standradTo = standradTo;
	}

	public String getStandradTo() {
		return standradTo;
	}

	public void setStandradUom(String standradUom) {
		this.standradUom = standradUom;
	}

	public String getStandradUom() {
		return standradUom;
	}

	public void setTextStandrad(String textStandrad) {
		this.textStandrad = textStandrad;
	}

	public String getTextStandrad() {
		return textStandrad;
	}

	public void setInspectionTool(String inspectionTool) {
		this.inspectionTool = inspectionTool;
	}

	public String getInspectionTool() {
		return inspectionTool;
	}

	public void setRemark(String remark) {
		this.remark = remark;
	}

	public String getRemark() {
		return remark;
	}

	public void setEnableTime(Date enableTime) {
		this.enableTime = enableTime;
	}

	public Date getEnableTime() {
		return enableTime;
	}

	public void setDisableTime(Date disableTime) {
		this.disableTime = disableTime;
	}

	public Date getDisableTime() {
		return disableTime;
	}

	public void setPrecision(Float precision) {
		this.precision = precision;
	}

	public Float getPrecision() {
		return precision;
	}

	public void setInspectionMethod(String inspectionMethod) {
		this.inspectionMethod = inspectionMethod;
	}

	public String getInspectionMethod() {
		return inspectionMethod;
	}

	public void setSampleWayId(Float sampleWayId) {
		this.sampleWayId = sampleWayId;
	}

	public Float getSampleWayId() {
		return sampleWayId;
	}

	public void setIsSync(String isSync) {
		this.isSync = isSync;
	}

	public String getIsSync() {
		return isSync;
	}

	public void setFillInType(String fillInType) {
		this.fillInType = fillInType;
	}

	public String getFillInType() {
		return fillInType;
	}

}
