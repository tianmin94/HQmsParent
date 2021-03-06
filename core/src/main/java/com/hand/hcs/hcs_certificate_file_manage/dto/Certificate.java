package com.hand.hcs.hcs_certificate_file_manage.dto;

/**
 * Auto Generated By Hap Code Generator
 **/

import com.fasterxml.jackson.annotation.JsonFormat;
import com.hand.hap.mybatis.annotation.ExtensionAttribute;
import com.hand.hap.system.dto.BaseDTO;
import org.hibernate.validator.constraints.Length;
import org.springframework.format.annotation.DateTimeFormat;

import java.util.Date;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.persistence.Transient;

@ExtensionAttribute(disable = true)
@Table(name = "HCS_CERTIFICATE")
public class Certificate extends BaseDTO {

    public static final String FIELD_CERTIFICATE_ID = "certificateId";
    public static final String FIELD_SUPPLIER_ID = "supplierId";
    public static final String FIELD_FIRST_CATEGORY = "firstCategory";
    public static final String FIELD_SECOND_CATEGORY = "secondCategory";
    public static final String FIELD_APPROVAL_STATUS = "approvalStatus";
    public static final String FIELD_CERTIFICATE_TYPE = "certificateType";
    public static final String FIELD_ATTACHMENT = "attachment";
    public static final String FIELD_TYPE_VALUE = "typeValue";
    public static final String FIELD_START_DATE = "startDate";
    public static final String FIELD_END_DATE = "endDate";
    public static final String FIELD_ITEM_ID = "itemId";
    public static final String FIELD_PLANT_ID = "plantId";
    public static final String FIELD_LEVELS = "levels";


    @Id
    @GeneratedValue
    private Long certificateId;

    private Long supplierId;

    @Length(max = 80)
    private String firstCategory;

    @Length(max = 80)
    private String secondCategory;

    @Length(max = 20)
    private String approvalStatus;

    @Length(max = 10)
    private String certificateType;

    @Length(max = 200)
    private String attachment;

    @Length(max = 80)
    private String typeValue;

    @JsonFormat(pattern = DATE_FORMAT)
    @DateTimeFormat(pattern = DATE_FORMAT)
    private Date startDate;

    @JsonFormat(pattern = DATE_FORMAT)
    @DateTimeFormat(pattern = DATE_FORMAT)
    private Date endDate;

    private Long itemId;

    private Float plantId;

    @Length(max = 20)
    private String levels;

    @Transient
    private String supplierCode;
    @Transient
    private String supplierName;
    @Transient
    private String itemDescription;
    @Transient
    private String itemCode;

    @Transient
    private String imageUrl;
    @Transient
    private String secCateMean;

    /**
     * 二级分类------CER   start
     */
    @Transient
    private String secondCategory1;
    @Transient
    private String secondCategory2;
    @Transient
    private String secondCategory3;
    @Transient
    private String secondCategory4;

    /**
     * 二级分类------CER   end
     */


    /**
     * 二级分类------人员认证--窗口认证
     */
    @Transient
    private String secondCategory5;
    /**
     * 二级分类------人员认证--关键岗位培训
     */
    @Transient
    private String secondCategory6;

    @Transient
    private String idCode;

    
    public String getSupplierName() {
		return supplierName;
	}

	public void setSupplierName(String supplierName) {
		this.supplierName = supplierName;
	}

	public void setCertificateId(Long certificateId) {
        this.certificateId = certificateId;
    }

    public Long getCertificateId() {
        return certificateId;
    }

    public void setSupplierId(Long supplierId) {
        this.supplierId = supplierId;
    }

    public Long getSupplierId() {
        return supplierId;
    }

    public void setFirstCategory(String firstCategory) {
        this.firstCategory = firstCategory;
    }

    public String getFirstCategory() {
        return firstCategory;
    }

    public void setSecondCategory(String secondCategory) {
        this.secondCategory = secondCategory;
    }

    public String getSecondCategory() {
        return secondCategory;
    }

    public void setApprovalStatus(String approvalStatus) {
        this.approvalStatus = approvalStatus;
    }

    public String getApprovalStatus() {
        return approvalStatus;
    }

    public void setCertificateType(String certificateType) {
        this.certificateType = certificateType;
    }

    public String getCertificateType() {
        return certificateType;
    }

    public void setAttachment(String attachment) {
        this.attachment = attachment;
    }

    public String getAttachment() {
        return attachment;
    }

    public void setTypeValue(String typeValue) {
        this.typeValue = typeValue;
    }

    public String getTypeValue() {
        return typeValue;
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

    public void setItemId(Long itemId) {
        this.itemId = itemId;
    }

    public Long getItemId() {
        return itemId;
    }

    public void setPlantId(Float plantId) {
        this.plantId = plantId;
    }

    public Float getPlantId() {
        return plantId;
    }

    public void setLevels(String levels) {
        this.levels = levels;
    }

    public String getLevels() {
        return levels;
    }

    public String getSupplierCode() {
        return supplierCode;
    }

    public void setSupplierCode(String supplierCode) {
        this.supplierCode = supplierCode;
    }

    public String getItemDescription() {
        return itemDescription;
    }

    public void setItemDescription(String itemDescription) {
        this.itemDescription = itemDescription;
    }

    public String getItemCode() {
        return itemCode;
    }

    public void setItemCode(String itemCode) {
        this.itemCode = itemCode;
    }

    public String getImageUrl() {
        return imageUrl;
    }

    public void setImageUrl(String imageUrl) {
        this.imageUrl = imageUrl;
    }

    public String getSecondCategory1() {
        return secondCategory1;
    }

    public void setSecondCategory1(String secondCategory1) {
        this.secondCategory1 = secondCategory1;
    }

    public String getSecondCategory2() {
        return secondCategory2;
    }

    public void setSecondCategory2(String secondCategory2) {
        this.secondCategory2 = secondCategory2;
    }

    public String getSecondCategory3() {
        return secondCategory3;
    }

    public void setSecondCategory3(String secondCategory3) {
        this.secondCategory3 = secondCategory3;
    }

    public String getSecondCategory4() {
        return secondCategory4;
    }

    public void setSecondCategory4(String secondCategory4) {
        this.secondCategory4 = secondCategory4;
    }

    public String getSecondCategory5() {
        return secondCategory5;
    }

    public void setSecondCategory5(String secondCategory5) {
        this.secondCategory5 = secondCategory5;
    }

    public String getIdCode() {
        return idCode;
    }

    public void setIdCode(String idCode) {
        this.idCode = idCode;
    }

    public String getSecCateMean() {
        return secCateMean;
    }

    public void setSecCateMean(String secCateMean) {
        this.secCateMean = secCateMean;
    }

    public String getSecondCategory6() {
        return secondCategory6;
    }

    public void setSecondCategory6(String secondCategory6) {
        this.secondCategory6 = secondCategory6;
    }
}
