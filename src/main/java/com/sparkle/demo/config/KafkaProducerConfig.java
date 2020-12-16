package com.sparkle.demo.config;

import org.apache.kafka.clients.producer.ProducerConfig;
import org.apache.kafka.common.serialization.StringSerializer;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.kafka.core.DefaultKafkaProducerFactory;
import org.springframework.kafka.core.KafkaTemplate;
import org.springframework.kafka.core.ProducerFactory;
import org.springframework.kafka.support.serializer.JsonSerializer;


@Configuration
public class KafkaProducerConfig extends KafkaGlobalConfig {
	
	/**
	 * Producer factory for kafka.
	 * @return DefaultKafkaProducerFactory
	 */
	//@Bean
	public ProducerFactory<String, String> dashboardMetricsProducerFactory() {
		configProps.put(ProducerConfig.KEY_SERIALIZER_CLASS_CONFIG, StringSerializer.class);
		configProps.put(ProducerConfig.VALUE_SERIALIZER_CLASS_CONFIG, StringSerializer.class);
		configProps.put(JsonSerializer.ADD_TYPE_INFO_HEADERS, false);
		return new DefaultKafkaProducerFactory<>(configProps);
	}

	@Bean
	public KafkaTemplate<String, String> dashboardMetricsKafkaTemplate() {
		return new KafkaTemplate<>(dashboardMetricsProducerFactory());
	}

}
