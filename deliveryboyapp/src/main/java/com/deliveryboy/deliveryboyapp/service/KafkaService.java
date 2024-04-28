package com.deliveryboy.deliveryboyapp.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.kafka.core.KafkaTemplate;
import org.springframework.stereotype.Service;

import com.deliveryboy.deliveryboyapp.config.AppConstants;

@Service
public class KafkaService {

	@Autowired
	private KafkaTemplate<String, String> kafkaTemplate;
	
	public boolean updateLocation(String location) {
		this.kafkaTemplate.send(AppConstants.LOCATION_TOPIC_NAME, location);
		return true;
	}
	
}