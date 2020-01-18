package com.suburb.coner.businessobj;

import java.io.Serializable;

public class UserData implements Serializable {

	/**
	 * serialVersionUID - the serial version uid.
	 */
	private static final long serialVersionUID = 2698008001887888524L;

	private UserBO data;

	public UserBO getData() {
		return data;
	}

	public void setData(UserBO data) {
		this.data = data;
	}

	@Override
	public String toString() {
		return "UserData [data=" + data + "]";
	}
}
