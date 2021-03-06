package com.hand.hap.system.dto;

import java.util.Date;

/**Auto Generated By Hap Code Generator**/
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import com.hand.hap.mybatis.annotation.ExtensionAttribute;
import org.hibernate.validator.constraints.Length;
import javax.persistence.Table;
import com.hand.hap.system.dto.BaseDTO;

@ExtensionAttribute(disable = true)
@Table(name = "SYS_USER_LOGIN_FAIL")
public class UserLoginFail extends BaseDTO {

	public static final String FIELD_LOGIN_ID = "loginId";
	public static final String FIELD_USER_ID = "userId";
	public static final String FIELD_USER_NAME = "userName";
	public static final String FIELD_LOGIN_TIME = "loginTime";
	public static final String FIELD_IP = "ip";
	public static final String FIELD_REFERER = "referer";
	public static final String FIELD_USER_AGENT = "userAgent";

	@Id
	@GeneratedValue
	private Float loginId;

	private Float userId;

	@Length(max = 40)
	private String userName;

	private Date loginTime;

	@Length(max = 40)
	private String ip;

	@Length(max = 240)
	private String referer;

	@Length(max = 240)
	private String userAgent;

	public void setLoginId(Float loginId) {
		this.loginId = loginId;
	}

	public Float getLoginId() {
		return loginId;
	}

	public void setUserId(Float userId) {
		this.userId = userId;
	}

	public Float getUserId() {
		return userId;
	}

	public void setUserName(String userName) {
		this.userName = userName;
	}

	public String getUserName() {
		return userName;
	}

	public void setLoginTime(Date loginTime) {
		this.loginTime = loginTime;
	}

	public Date getLoginTime() {
		return loginTime;
	}

	public void setIp(String ip) {
		this.ip = ip;
	}

	public String getIp() {
		return ip;
	}

	public void setReferer(String referer) {
		this.referer = referer;
	}

	public String getReferer() {
		return referer;
	}

	public void setUserAgent(String userAgent) {
		this.userAgent = userAgent;
	}

	public String getUserAgent() {
		return userAgent;
	}

}
