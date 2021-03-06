package com.hand.hcs.hcs_station.dto;

/**
 * Auto Generated By Hap Code Generator
 **/

import javax.persistence.GeneratedValue;
import javax.persistence.Id;

import com.hand.hap.core.annotation.Children;
import com.hand.hap.mybatis.annotation.ExtensionAttribute;
import com.hand.hcs.hcs_station.view.ItemStationV0;
import org.hibernate.validator.constraints.Length;

import javax.persistence.Table;
import javax.persistence.Transient;

import com.hand.hap.system.dto.BaseDTO;

import java.util.List;

@ExtensionAttribute(disable = true)
@Table(name = "HCS_SUPPLIER_ITEM_STATION")
public class SupplierItemStation extends BaseDTO {

    public static final String FIELD_ITEM_STATION_ID = "itemStationId";
    public static final String FIELD_SUPPLIER_ID = "supplierId";
    public static final String FIELD_ITEM_ID = "itemId";
    public static final String FIELD_PLANT_ID = "plantId";
    public static final String FIELD_ENABLE_FLAG = "enableFlag";
    public static final String FIELD_STATION_SEQUENCE = "stationSequence";
    public static final String FIELD_STATION_NAME = "stationName";


    @Id
    @GeneratedValue
    private Long itemStationId;

    private Long supplierId;

    private Long itemId;

    private Long plantId;

    @Length(max = 10)
    private String enableFlag;

    private Long stationSequence;

    @Length(max = 80)
    private String stationName;

    @Transient
    private String supplierCode;
    @Transient
    private String supplierName;
    @Transient
    private String itemCode;
    @Transient
    private String itemDescriptions;
    @Transient
    @Children
    private List<ItemStationV0> v0List;




    public void setItemStationId(Long itemStationId) {
        this.itemStationId = itemStationId;
    }

    public Long getItemStationId() {
        return itemStationId;
    }

    public void setSupplierId(Long supplierId) {
        this.supplierId = supplierId;
    }

    public Long getSupplierId() {
        return supplierId;
    }

    public void setItemId(Long itemId) {
        this.itemId = itemId;
    }

    public Long getItemId() {
        return itemId;
    }

    public void setPlantId(Long plantId) {
        this.plantId = plantId;
    }

    public Long getPlantId() {
        return plantId;
    }

    public void setEnableFlag(String enableFlag) {
        this.enableFlag = enableFlag;
    }

    public String getEnableFlag() {
        return enableFlag;
    }

    public void setStationSequence(Long stationSequence) {
        this.stationSequence = stationSequence;
    }

    public Long getStationSequence() {
        return stationSequence;
    }

    public void setStationName(String stationName) {
        this.stationName = stationName;
    }

    public String getStationName() {
        return stationName;
    }

    public String getSupplierCode() {
        return supplierCode;
    }

    public void setSupplierCode(String supplierCode) {
        this.supplierCode = supplierCode;
    }

    public String getSupplierName() {
        return supplierName;
    }

    public void setSupplierName(String supplierName) {
        this.supplierName = supplierName;
    }

    public String getItemCode() {
        return itemCode;
    }

    public void setItemCode(String itemCode) {
        this.itemCode = itemCode;
    }

    public String getItemDescriptions() {
        return itemDescriptions;
    }

    public void setItemDescriptions(String itemDescripitions) {
        this.itemDescriptions = itemDescripitions;
    }

    public List<ItemStationV0> getV0List() {
        return v0List;
    }

    public void setV0List(List<ItemStationV0> v0List) {
        this.v0List = v0List;
    }
}
