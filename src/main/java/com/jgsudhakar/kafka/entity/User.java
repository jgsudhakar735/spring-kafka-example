/**
 * 
 */
package com.jgsudhakar.kafka.entity;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

/**
 * @author sudhakar.t
 *
 */
@Entity
@Data
@AllArgsConstructor
@NoArgsConstructor
public class User implements Serializable{

	/**
	 * Default Serial ID
	 */
	private static final long serialVersionUID = 1L;
	
	@Id
	@Column(name = "USER_KEY")
	private Long userKey;
	
	@Column(name = "USER_FIRST_NAME")
	private String userFirstName;
	
	@Column(name = "USER_LAST_NAME")
	private String userLastName;
	
	@Column(name = "USER_EMAIL")
	private String userEmail;
	
	@Column(name = "USER_PHONE_NO")
	private String userPhoneNo;
	
	@Column(name = "USER_ADDRESS")
	private String userAddress;
	
	

}
