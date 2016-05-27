package com.adanac.demo.validation.dto;

import java.io.Serializable;

import javax.validation.constraints.Pattern;

import org.hibernate.validator.constraints.Email;
import org.hibernate.validator.constraints.Length;
import org.hibernate.validator.constraints.NotEmpty;

import com.adanac.demo.validation.intf.GroupAdd;
import com.adanac.demo.validation.intf.GroupUpdate;

public class UserDto implements Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	@NotEmpty(message = "{user.account.not.empty}", groups = { GroupUpdate.class })
	private String id;
	@NotEmpty(message = "{user.account.not.empty}", groups = { GroupAdd.class, GroupUpdate.class })
	@Email(message = "{user.account.error}", groups = { GroupAdd.class, GroupUpdate.class })
	private String account;
	@NotEmpty(message = "{user.password.not.empty}", groups = { GroupAdd.class, GroupUpdate.class })
	@Length(min = 6, max = 16, message = "{user.password.length.error}", groups = { GroupAdd.class, GroupUpdate.class })
	private String password;
	@NotEmpty(message = "{user.phone.not.empty}", groups = { GroupAdd.class, GroupUpdate.class })
	@Pattern(regexp = "^(((13[0-9])|(15([0-3]|[5-9]))|(18[0,5-9]))\\d{8})|(0\\d{2}-\\d{8})|(0\\d{3}-\\d{7})$", message = "{user.phone.error}", groups = {
			GroupAdd.class, GroupUpdate.class })
	private String phone;

	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}

	public String getAccount() {
		return account;
	}

	public void setAccount(String account) {
		this.account = account;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	public String getPhone() {
		return phone;
	}

	public void setPhone(String phone) {
		this.phone = phone;
	}

}
