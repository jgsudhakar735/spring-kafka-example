/**
 * 
 */
package com.jgsudhakar.kafka.config;

import java.util.HashMap;
import java.util.Map;

import org.apache.kafka.clients.consumer.ConsumerConfig;
import org.apache.kafka.common.serialization.StringDeserializer;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.kafka.annotation.EnableKafka;
import org.springframework.kafka.config.ConcurrentKafkaListenerContainerFactory;
import org.springframework.kafka.config.KafkaListenerContainerFactory;
import org.springframework.kafka.core.ConsumerFactory;
import org.springframework.kafka.core.DefaultKafkaConsumerFactory;
import org.springframework.kafka.listener.ConcurrentMessageListenerContainer;
import org.springframework.kafka.support.serializer.JsonDeserializer;

import com.jgsudhakar.kafka.KafkaConstants;
import com.jgsudhakar.kafka.modal.UserDTO;

/**
 * @author sudhakar.t
 *
 */
@Configuration
@EnableKafka
public class KafkaConsumerConfig {

	@Bean
	public ConsumerFactory<String, UserDTO> consumerConfig() {
		Map<String, Object> config = new HashMap<>();
		config.put(ConsumerConfig.BOOTSTRAP_SERVERS_CONFIG, KafkaConstants.SERVER_URL);
		config.put(ConsumerConfig.GROUP_ID_CONFIG, KafkaConstants.GROUP_ID);
		config.put(ConsumerConfig.KEY_DESERIALIZER_CLASS_CONFIG, StringDeserializer.class);
		config.put(ConsumerConfig.VALUE_DESERIALIZER_CLASS_CONFIG, JsonDeserializer.class);
		return new DefaultKafkaConsumerFactory<>(config, null, new JsonDeserializer<UserDTO>(UserDTO.class));
	}

	@Bean
	public KafkaListenerContainerFactory<ConcurrentMessageListenerContainer<String, UserDTO>> kafkaListenerContainerFactory() {
		ConcurrentKafkaListenerContainerFactory<String, UserDTO> listener = new ConcurrentKafkaListenerContainerFactory<>();
		listener.setConsumerFactory(consumerConfig());
		return listener;
	}
}
