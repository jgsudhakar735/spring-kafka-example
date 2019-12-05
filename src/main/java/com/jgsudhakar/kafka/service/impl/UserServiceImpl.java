/**
 * 
 */
package com.jgsudhakar.kafka.service.impl;

import java.util.List;
import java.util.stream.Collectors;

import org.apache.commons.collections4.CollectionUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.jgsudhakar.kafka.entity.User;
import com.jgsudhakar.kafka.modal.UserDTO;
import com.jgsudhakar.kafka.repository.UserRepository;
import com.jgsudhakar.kafka.service.UserService;

/**
 * @author sudhakar.t
 *
 */
@Service
public class UserServiceImpl implements UserService{

	@Autowired
	UserRepository userRepository;
	
	@Override
	public List<UserDTO> retriveList(){
		List<UserDTO> userList = null;
		List<User> findAll = userRepository.findAll();
		if(!CollectionUtils.isEmpty(findAll)) {
			userList = findAll.stream().map(user -> new UserDTO()).collect(Collectors.toList());
		}
		return userList;
	}
	
	@Override
	public void saveUser(UserDTO userDTO) {
		User entity = new User(userDTO.getUserKey(), userDTO.getUserFirstName(), userDTO.getUserLastName(), userDTO.getUserEmail(), userDTO.getUserEmail(), userDTO.getUserAddress());
		userRepository.save(entity);
		
	}
}
