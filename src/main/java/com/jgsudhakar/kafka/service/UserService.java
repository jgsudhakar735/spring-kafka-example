/**
 * 
 */
package com.jgsudhakar.kafka.service;

import java.util.List;

import com.jgsudhakar.kafka.modal.UserDTO;

/**
 * @author sudhakar.t
 *
 */
public interface UserService {
	
	public List<UserDTO> retriveList();
	
	public void saveUser(UserDTO userDTO);
	
}
