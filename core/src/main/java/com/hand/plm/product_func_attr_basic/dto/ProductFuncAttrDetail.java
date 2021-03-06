package com.hand.plm.product_func_attr_basic.dto;

/**Auto Generated By Hap Code Generator**/
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import com.hand.hap.mybatis.annotation.ExtensionAttribute;
import org.hibernate.validator.constraints.Length;
import javax.persistence.Table;
import com.hand.hap.system.dto.BaseDTO;

@ExtensionAttribute(disable = true)
@Table(name = "PLM_PRODUCT_FUNC_ATTR_DETAIL")
public class ProductFuncAttrDetail extends BaseDTO {

	public static final String FIELD_DETAIL_ID = "detailId";
	public static final String FIELD_KID = "kid";
	public static final String FIELD_FUNCTION_CONTENT = "functionContent";
	public static final String FIELD_VERSION = "version";
	public static final String FIELD_STATUS = "status";

	@Id
	@GeneratedValue
	private String detailId;

	private String kid;

	@Length(max = 500)
	private String functionContent;

	@Length(max = 10)
	private String version;

	@Length(max = 10)
	private String status;

	public String getDetailId() {
		return detailId;
	}

	public void setDetailId(String detailId) {
		this.detailId = detailId;
	}

	public String getKid() {
		return kid;
	}

	public void setKid(String kid) {
		this.kid = kid;
	}

	public String getFunctionContent() {
		return functionContent;
	}

	public void setFunctionContent(String functionContent) {
		this.functionContent = functionContent;
	}

	public String getVersion() {
		return version;
	}

	public void setVersion(String version) {
		this.version = version;
	}

	public String getStatus() {
		return status;
	}

	public void setStatus(String status) {
		this.status = status;
	}

	
}
