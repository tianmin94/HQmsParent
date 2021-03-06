package com.hand.plm.plm_product_func_attr_approve.dto;

/**Auto Generated By Hap Code Generator**/
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import com.hand.hap.mybatis.annotation.ExtensionAttribute;
import org.hibernate.validator.constraints.Length;
import javax.persistence.Table;
import com.hand.hap.system.dto.BaseDTO;

@ExtensionAttribute(disable = true)
@Table(name = "PLM_PRODUCT_FUNC_ATTR_APPROVE")
public class ProductFuncAttrApprove extends BaseDTO {

	public static final String FIELD_KID = "kid";
	public static final String FIELD_CHANGE_NUM = "changeNum";
	public static final String FIELD_PRODUCT_ID = "productId";
	public static final String FIELD_PRODUCT = "product";
	public static final String FIELD_PRODUCT_FUNC_ID = "productFuncId";
	public static final String FIELD_PRODUCT_FUNC = "productFunc";
	public static final String FIELD_SPEC_LINE_ID = "specLineId";
	public static final String FIELD_PRODUCT_FUNC_ATTR = "productFuncAttr";
	public static final String FIELD_STATUS = "status";
	public static final String FIELD_REMARK = "remark";
	public static final String FIELD_OPERATION_FLAG = "operationFlag";
	public static final String FIELD_CURRENT_APPROVE_BY = "currentApproveBy";
	public static final String FIELD_LAST_APPROVED_BY = "lastApprovedBy";
	public static final String FIELD_VERSION = "version";

	@Id
	@GeneratedValue
	private String kid;

	@Length(max = 30)
	private String changeNum;

	private String productId;

	@Length(max = 100)
	private String product;

	private String productFuncId;

	@Length(max = 100)
	private String productFunc;

	private String specLineId;

	@Length(max = 300)
	private String productFuncAttr;

	@Length(max = 30)
	private String status;

	@Length(max = 255)
	private String remark;

	@Length(max = 10)
	private String operationFlag;

	@Length(max = 30)
	private String currentApproveBy;

	@Length(max = 30)
	private String lastApprovedBy;

	@Length(max = 10)
	private String version;

	public void setKid(String kid) {
		this.kid = kid;
	}

	public String getKid() {
		return kid;
	}

	public void setChangeNum(String changeNum) {
		this.changeNum = changeNum;
	}

	public String getChangeNum() {
		return changeNum;
	}

	public void setProductId(String productId) {
		this.productId = productId;
	}

	public String getProductId() {
		return productId;
	}

	public void setProduct(String product) {
		this.product = product;
	}

	public String getProduct() {
		return product;
	}

	public void setProductFuncId(String productFuncId) {
		this.productFuncId = productFuncId;
	}

	public String getProductFuncId() {
		return productFuncId;
	}

	public void setProductFunc(String productFunc) {
		this.productFunc = productFunc;
	}

	public String getProductFunc() {
		return productFunc;
	}

	public void setSpecLineId(String specLineId) {
		this.specLineId = specLineId;
	}

	public String getSpecLineId() {
		return specLineId;
	}

	public void setProductFuncAttr(String productFuncAttr) {
		this.productFuncAttr = productFuncAttr;
	}

	public String getProductFuncAttr() {
		return productFuncAttr;
	}

	public void setStatus(String status) {
		this.status = status;
	}

	public String getStatus() {
		return status;
	}

	public void setRemark(String remark) {
		this.remark = remark;
	}

	public String getRemark() {
		return remark;
	}

	public void setOperationFlag(String operationFlag) {
		this.operationFlag = operationFlag;
	}

	public String getOperationFlag() {
		return operationFlag;
	}

	public void setCurrentApproveBy(String currentApproveBy) {
		this.currentApproveBy = currentApproveBy;
	}

	public String getCurrentApproveBy() {
		return currentApproveBy;
	}

	public void setLastApprovedBy(String lastApprovedBy) {
		this.lastApprovedBy = lastApprovedBy;
	}

	public String getLastApprovedBy() {
		return lastApprovedBy;
	}

	public void setVersion(String version) {
		this.version = version;
	}

	public String getVersion() {
		return version;
	}

}
