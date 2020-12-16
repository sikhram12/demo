package com.sparkle.demo.config;

import java.util.HashMap;
import java.util.Map;

import javax.annotation.PostConstruct;

import org.apache.kafka.clients.CommonClientConfigs;
import org.apache.kafka.clients.consumer.ConsumerConfig;



public class KafkaGlobalConfig {

//	@Value("${kafka.kerberosEnabled}")
//	boolean kerberosEnabled;
//
//	@Value(value = "${kafka.environment}")
//	private String environment;
//
//	@Value(value = "${kafka.bootstrapAddress}")
//	private String bootstrapAddress;

	Map<String, Object> configProps = new HashMap<>();

	/**
	 * Sets up environment variables for Kerberos(if needed) and common kafka config properties.
	 */
	@PostConstruct
	public void kafkaGlobalConfigInit() {
		//configProps.put(ConsumerConfig.BOOTSTRAP_SERVERS_CONFIG, "localhost:9092");

//		if (kerberosEnabled) {
//			configProps.put(CommonClientConfigs.SECURITY_PROTOCOL_CONFIG, "SASL_PLAINTEXT");
//			configProps.put("sasl.kerberos.service.name", "kafka");
//			//setEnvironmentVariables();
//		}
	}

	/**
	 * Sets up global level environment variables.
	 */
//	private void setEnvironmentVariables() {
//
//		String jaasConfigFile = null;
//		URL jaasConfigUrl = this.getClass().getClassLoader().getResource(environment + "/kafka.keytab.jaas.conf");
//		if (jaasConfigUrl != null) {
//			jaasConfigFile = jaasConfigUrl.getFile();
//			System.setProperty("java.security.auth.login.config", jaasConfigFile);
//		}
//
//		String krb5ConfigFile = null;
//		URL krb5ConfigUrl = this.getClass().getClassLoader().getResource(environment + "/krb5.conf");
//		if (krb5ConfigUrl != null) {
//			krb5ConfigFile = krb5ConfigUrl.getFile();
//			System.setProperty("java.security.krb5.conf", krb5ConfigFile);
//		}			
//	}
}
