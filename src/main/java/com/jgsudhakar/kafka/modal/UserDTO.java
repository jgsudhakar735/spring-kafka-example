/**
 * 
 */
package com.jgsudhakar.kafka.modal;

import java.io.Serializable;

import lombok.Data;

/**
 * @author sudhakar.t
 *
 */
@Data
public class UserDTO implements Serializable{

	/**
	 * Default Serial ID
	 */
	private static final long serialVersionUID = 1L;

	private Long userKey;
	
	private String userFirstName;
	
	private String userLastName;
	
	private String userEmail;
	
	private String userPhoneNo;
	
	private String userAddress;
}
