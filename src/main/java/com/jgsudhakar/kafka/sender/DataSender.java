/**
 * 
 */
package com.jgsudhakar.kafka.sender;

import java.util.HashMap;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.kafka.core.KafkaTemplate;
import org.springframework.kafka.support.KafkaHeaders;
import org.springframework.messaging.support.GenericMessage;
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
public class DataSender {
	
	
	@Autowired
	private KafkaTemplate<String, String> kafkaTemplate;

	public void sendData(UserDTO userDTO) {
		Map<String, Object> headers = new HashMap<>();
		headers.put(KafkaHeaders.TOPIC, KafkaConstants.TOPIC);
		kafkaTemplate.send(new GenericMessage<UserDTO>(userDTO, headers));
		
		// use the below to send String values through kafka
		// kafkaTemplate.send(topicName, "some string value")
		log.info("Data - " + userDTO.toString() + " sent to Kafka Topic - " + KafkaConstants.TOPIC);
	}
}
