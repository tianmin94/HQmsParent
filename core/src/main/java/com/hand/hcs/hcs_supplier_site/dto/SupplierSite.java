package com.hand.hcs.hcs_supplier_site.dto;

/**Auto Generated By Hap Code Generator**/
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import com.hand.hap.mybatis.annotation.ExtensionAttribute;
import org.hibernate.validator.constraints.Length;
import javax.persistence.Table;
import javax.persistence.Transient;

import com.hand.hap.system.dto.BaseDTO;
import java.util.Date;
@ExtensionAttribute(disable=true)
@Table(name = "HCS_SUPPLIER_SITE")
public class SupplierSite extends BaseDTO {

     public static final String FIELD_SUPPLERS_SITE_ID = "supplersSiteId";
     public static final String FIELD_SUPPLIER_ID = "supplierId";
     public static final String FIELD_SUPPLIER_SITE_CODE = "supplierSiteCode";
     public static final String FIELD_DESCRIPTION = "description";
     public static final String FIELD_ADDRESS = "address";
     public static final String FIELD_CITY = "city";
     public static final String FIELD_STATE = "state";
     public static final String FIELD_ZIP = "zip";
     public static final String FIELD_COUNTRY = "country";
     public static final String FIELD_PHONE_AREA_CODE = "phoneAreaCode";
     public static final String FIELD_PHONE = "phone";
     public static final String FIELD_FAX_AREA_CODE = "faxAreaCode";
     public static final String FIELD_FAX = "fax";
     public static final String FIELD_START_DATE = "startDate";
     public static final String FIELD_END_DATE = "endDate";
     public static final String FIELD_BARCODE_SUPPLER_SEG = "barcodeSupplerSeg";
     public static final String FIELD_BARCODE_PRINT_TYPE = "barcodePrintType";
     public static final String FIELD_PUR_CENTER_ID = "purCenterId";
     public static final String FIELD_INVOICE_CURRENCY_CODE = "invoiceCurrencyCode";
     public static final String FIELD_CID = "cid";

     @Id
     @GeneratedValue
     private Float supplersSiteId;

     private Float supplierId;

     @Length(max = 25)
     private String supplierSiteCode;

     @Length(max = 25)
     private String description;

     @Length(max = 720)
     private String address;

     @Length(max = 50)
     private String city;

     @Length(max = 150)
     private String state;

     @Length(max = 20)
     private String zip;

     @Length(max = 25)
     private String country;

     @Length(max = 10)
     private String phoneAreaCode;

     @Length(max = 25)
     private String phone;

     @Length(max = 10)
     private String faxAreaCode;

     @Length(max = 15)
     private String fax;

     private Date startDate;

     private Date endDate;

     @Length(max = 150)
     private String barcodeSupplerSeg;

     @Length(max = 150)
     private String barcodePrintType;

     private Float purCenterId;

     @Length(max = 15)
     private String invoiceCurrencyCode;

     private Float cid;
     
     @Transient
     private String supplierSiteName;//供应商地点描述


     public void setSupplersSiteId(Float supplersSiteId){
         this.supplersSiteId = supplersSiteId;
     }

     public Float getSupplersSiteId(){
         return supplersSiteId;
     }

     public void setSupplierId(Float supplierId){
         this.supplierId = supplierId;
     }

     public Float getSupplierId(){
         return supplierId;
     }

     public void setSupplierSiteCode(String supplierSiteCode){
         this.supplierSiteCode = supplierSiteCode;
     }

     public String getSupplierSiteCode(){
         return supplierSiteCode;
     }

     public void setDescription(String description){
         this.description = description;
     }

     public String getDescription(){
         return description;
     }

     public void setAddress(String address){
         this.address = address;
     }

     public String getAddress(){
         return address;
     }

     public void setCity(String city){
         this.city = city;
     }

     public String getCity(){
         return city;
     }

     public void setState(String state){
         this.state = state;
     }

     public String getState(){
         return state;
     }

     public void setZip(String zip){
         this.zip = zip;
     }

     public String getZip(){
         return zip;
     }

     public void setCountry(String country){
         this.country = country;
     }

     public String getCountry(){
         return country;
     }

     public void setPhoneAreaCode(String phoneAreaCode){
         this.phoneAreaCode = phoneAreaCode;
     }

     public String getPhoneAreaCode(){
         return phoneAreaCode;
     }

     public void setPhone(String phone){
         this.phone = phone;
     }

     public String getPhone(){
         return phone;
     }

     public void setFaxAreaCode(String faxAreaCode){
         this.faxAreaCode = faxAreaCode;
     }

     public String getFaxAreaCode(){
         return faxAreaCode;
     }

     public void setFax(String fax){
         this.fax = fax;
     }

     public String getFax(){
         return fax;
     }

     public void setStartDate(Date startDate){
         this.startDate = startDate;
     }

     public Date getStartDate(){
         return startDate;
     }

     public void setEndDate(Date endDate){
         this.endDate = endDate;
     }

     public Date getEndDate(){
         return endDate;
     }

     public void setBarcodeSupplerSeg(String barcodeSupplerSeg){
         this.barcodeSupplerSeg = barcodeSupplerSeg;
     }

     public String getBarcodeSupplerSeg(){
         return barcodeSupplerSeg;
     }

     public void setBarcodePrintType(String barcodePrintType){
         this.barcodePrintType = barcodePrintType;
     }

     public String getBarcodePrintType(){
         return barcodePrintType;
     }

     public void setPurCenterId(Float purCenterId){
         this.purCenterId = purCenterId;
     }

     public Float getPurCenterId(){
         return purCenterId;
     }

     public void setInvoiceCurrencyCode(String invoiceCurrencyCode){
         this.invoiceCurrencyCode = invoiceCurrencyCode;
     }

     public String getInvoiceCurrencyCode(){
         return invoiceCurrencyCode;
     }

     public void setCid(Float cid){
         this.cid = cid;
     }

     public Float getCid(){
         return cid;
     }

	public String getSupplierSiteName() {
		return supplierSiteName;
	}

	public void setSupplierSiteName(String supplierSiteName) {
		this.supplierSiteName = supplierSiteName;
	}

	

     }
