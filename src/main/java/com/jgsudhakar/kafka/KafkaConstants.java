/**
 * 
 */
package com.jgsudhakar.kafka;

import java.util.UUID;

/**
 * @author sudhakar.t
 *
 */
public class KafkaConstants {

	public static final String GROUP_ID = "jgsudhakar-group";
	public static final String TOPIC = "jgsudhakar";
	public static final String SERVER_URL = "localhost:9092";
	
	public static void main(String[] args) {
		System.out.println(UUID.randomUUID().toString());
	}
}
