package com.hand.spc.ecr_main.view;

/**Auto Generated By Hap Code Generator**/
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

import com.fasterxml.jackson.annotation.JsonIgnore;
import com.hand.hap.mybatis.annotation.ExtensionAttribute;
import org.hibernate.validator.constraints.Length;
import javax.persistence.Table;
import com.hand.hap.system.dto.BaseDTO;
import com.hand.hqm.hqm_pfmea_level.dto.HqmLevelMenuItem;

import java.io.Serializable;
import java.util.Date;
import java.util.List;
@ExtensionAttribute(disable=true) 
public class EcrMaterialV0 implements  Comparable<EcrMaterialV0>, Serializable { 

	   private List<EcrMaterialV0> children;
	   @JsonIgnore
	   private EcrMaterialV0 parent;
	    private boolean expand = false;
	    private String functionCode;
	    private String icon;
	    private Long id;
	    private Boolean ischecked;
	   
	    private long score;
	    private Long shortcutId;
	    private String text;
	    private String url;
	private String itemCode;
	
	private String itemDescription;
	
	private String itemId;
	
	private String levelId;
	
	private String productType;
	
	private String products;
	
	private String skucode;
	
	private String skuDescription;
	
	private String onhandQty;
	
	
	private String onhandStatus;
	
	private String buyer;
	
	private String kid;
	
	private String buyerId;
	
	private String skuId;
	
	private String qty;
	private String baseQty;
	private String stdCost;
    private String stdPriceUnit;
    private String stdCostCurrency;
    
    
    
	public String getBaseQty() {
		return baseQty;
	}

	public void setBaseQty(String baseQty) {
		this.baseQty = baseQty;
	}

	public String getStdCost() {
		return stdCost;
	}

	public void setStdCost(String stdCost) {
		this.stdCost = stdCost;
	}

	public String getStdPriceUnit() {
		return stdPriceUnit;
	}

	public void setStdPriceUnit(String stdPriceUnit) {
		this.stdPriceUnit = stdPriceUnit;
	}

	public String getStdCostCurrency() {
		return stdCostCurrency;
	}

	public void setStdCostCurrency(String stdCostCurrency) {
		this.stdCostCurrency = stdCostCurrency;
	}

	public String getQty() {
		return qty;
	}

	public void setQty(String qty) {
		this.qty = qty;
	}

	public String getSkuId() {
		return skuId;
	}

	public void setSkuId(String skuId) {
		this.skuId = skuId;
	}

	public String getBuyerId() {
		return buyerId;
	}

	public void setBuyerId(String buyerId) {
		this.buyerId = buyerId;
	}

	public String getKid() {
		return kid;
	}

	public void setKid(String kid) {
		this.kid = kid;
	}

	public String getBuyer() {
		return buyer;
	}

	public void setBuyer(String buyer) {
		this.buyer = buyer;
	}

	public String getOnhandStatus() {
		return onhandStatus;
	}

	public void setOnhandStatus(String onhandStatus) {
		this.onhandStatus = onhandStatus;
	}

	public String getOnhandQty() {
		return onhandQty;
	}

	public void setOnhandQty(String onhandQty) {
		this.onhandQty = onhandQty;
	}

	public String getSkucode() {
		return skucode;
	}

	public void setSkucode(String skucode) {
		this.skucode = skucode;
	}

	public String getSkuDescription() {
		return skuDescription;
	}

	public void setSkuDescription(String skuDescription) {
		this.skuDescription = skuDescription;
	}

	public String getProductType() {
		return productType;
	}

	public void setProductType(String productType) {
		this.productType = productType;
	}

	public String getProducts() {
		return products;
	}

	public void setProducts(String products) {
		this.products = products;
	}

	public List<EcrMaterialV0> getChildren() {
		return children;
	}

	public void setChildren(List<EcrMaterialV0> children) {
		this.children = children;
	}

	public boolean isExpand() {
		return expand;
	}

	public void setExpand(boolean expand) {
		this.expand = expand;
	}

	public String getFunctionCode() {
		return functionCode;
	}

	public void setFunctionCode(String functionCode) {
		this.functionCode = functionCode;
	}

	public String getIcon() {
		return icon;
	}

	public void setIcon(String icon) {
		this.icon = icon;
	}

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public Boolean getIschecked() {
		return ischecked;
	}

	public void setIschecked(Boolean ischecked) {
		this.ischecked = ischecked;
	}

	public EcrMaterialV0 getParent() {
		return parent;
	}

	public void setParent(EcrMaterialV0 parent) {
		this.parent = parent;
	}

	public long getScore() {
		return score;
	}

	public void setScore(long score) {
		this.score = score;
	}

	public Long getShortcutId() {
		return shortcutId;
	}

	public void setShortcutId(Long shortcutId) {
		this.shortcutId = shortcutId;
	}

	public String getText() {
		return text;
	}

	public void setText(String text) {
		this.text = text;
	}

	public String getUrl() {
		return url;
	}

	public void setUrl(String url) {
		this.url = url;
	}

	public String getLevelId() {
		return levelId;
	}

	public void setLevelId(String levelId) {
		this.levelId = levelId;
	}

	public String getItemCode() {
		return itemCode;
	}

	public void setItemCode(String itemCode) {
		this.itemCode = itemCode;
	}

	public String getItemDescription() {
		return itemDescription;
	}

	public void setItemDescription(String itemDescription) {
		this.itemDescription = itemDescription;
	}

	public String getItemId() {
		return itemId;
	}

	public void setItemId(String itemId) {
		this.itemId = itemId;
	}

	@Override
	public int compareTo(EcrMaterialV0 o) {
		// TODO Auto-generated method stub
		return 0;
	}
}
