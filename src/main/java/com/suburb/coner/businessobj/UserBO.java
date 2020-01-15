package com.suburb.coner.businessobj;

import java.io.Serializable;

import lombok.Data;

@Data
public class UserBO implements Serializable {

	/**
	 * serialVersionUID - the serial version uid.
	 */
	private static final long serialVersionUID = 6510804776167067342L;

	private Integer id;
	private String email;
	private String firstName;
	private String lastName;
	private String avatar;

}
