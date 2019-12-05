/**
 * 
 */
package com.jgsudhakar.kafka.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.jgsudhakar.kafka.modal.UserDTO;
import com.jgsudhakar.kafka.sender.DataSender;
import com.jgsudhakar.kafka.service.UserService;

import lombok.extern.log4j.Log4j2;

/**
 * @author sudhakar.t
 *
 */
@RestController
@RequestMapping("/user/1.0/")
@Log4j2
public class UserController {
	
	@Autowired
	UserService userService;
	
	@Autowired
	DataSender dataSender;
	
	@Autowired
	private DataSender sender;

	@GetMapping(path = "/retriveUserList",produces = {MediaType.APPLICATION_JSON_VALUE,MediaType.APPLICATION_ATOM_XML_VALUE})
	public List<UserDTO> retriveUserList() {
		return userService.retriveList();
	}
	
	@PostMapping(path = "/saveUser", consumes = {MediaType.APPLICATION_JSON_VALUE})
	public void saveUser(@RequestBody UserDTO userDTO) {
		log.info("{}",() -> userDTO.toString());
		sender.sendData(userDTO);
	}
}
