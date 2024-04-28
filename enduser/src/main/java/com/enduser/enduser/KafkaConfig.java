package com.enduser.enduser;

import org.springframework.context.annotation.Configuration;
import org.springframework.kafka.annotation.KafkaListener;

@Configuration
public class KafkaConfig {
	
	@KafkaListener(topics = AppConstants.LOCATION_UPDATE_TOPIC, groupId = AppConstants.LOCATION_GROUP_ID )
	public void updatedLocation(String values) {
		System.out.println("listening the data "+values);
	}
	
}
