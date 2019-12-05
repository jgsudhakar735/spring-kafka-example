/**
 * 
 */
package com.jgsudhakar.kafka.receiver;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.kafka.annotation.KafkaListener;
import org.springframework.stereotype.Service;

import com.jgsudhakar.kafka.KafkaConstants;
import com.jgsudhakar.kafka.modal.UserDTO;
import com.jgsudhakar.kafka.service.UserService;

import lombok.extern.log4j.Log4j2;

/**
 * @author sudhakar.t
 *
 */
@Service
@Log4j2
public class DataReceiver {
	
	@Autowired
	UserService userService;

	@KafkaListener(topics = KafkaConstants.TOPIC, groupId =  KafkaConstants.GROUP_ID)
	public void recieveData(UserDTO userDTO) {
		userService.saveUser(userDTO);
		log.info("Data - " + userDTO.toString() + " recieved");
	}
}
