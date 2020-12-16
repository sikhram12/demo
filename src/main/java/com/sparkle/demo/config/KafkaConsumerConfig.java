package com.sparkle.demo.config;

import org.apache.kafka.clients.consumer.ConsumerConfig;
import org.apache.kafka.common.serialization.StringDeserializer;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.kafka.annotation.EnableKafka;
import org.springframework.kafka.config.ConcurrentKafkaListenerContainerFactory;
import org.springframework.kafka.core.ConsumerFactory;
import org.springframework.kafka.core.DefaultKafkaConsumerFactory;

import com.sparkle.demo.model.UniqueIdUtil;

//@EnableKafka
//@Configuration
public class KafkaConsumerConfig extends KafkaGlobalConfig {
	
	/**
	 * Base consumer factory for the for the kafka ConcurrentKafkaListenerContainerFactory.
	 * @return DefaultKafkaConsumerFactory
	 */
	@Bean
	public ConsumerFactory<String, String> consumerFactory() {
		configProps.put(ConsumerConfig.GROUP_ID_CONFIG, UniqueIdUtil.getUniqueNodeId());
		configProps.put(ConsumerConfig.MAX_POLL_RECORDS_CONFIG,"9999"); 
		return new DefaultKafkaConsumerFactory<>(configProps, new StringDeserializer(), new StringDeserializer());
	}

	/**
	 * Main Kafka consumer factory. 
	 * @return ConcurrentKafkaListenerContainerFactory
	 */
	@Bean
	public ConcurrentKafkaListenerContainerFactory<String, String> kafkaListenerContainerFactory() {
		ConcurrentKafkaListenerContainerFactory<String, String> factory = new ConcurrentKafkaListenerContainerFactory<>();
		factory.setConsumerFactory(consumerFactory());
		return factory;
	}

}