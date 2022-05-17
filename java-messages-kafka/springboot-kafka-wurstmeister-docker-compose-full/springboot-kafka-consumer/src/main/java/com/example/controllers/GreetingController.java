package com.example.controllers;

import org.springframework.kafka.annotation.KafkaListener;
import org.springframework.messaging.handler.annotation.Header;
import org.springframework.messaging.handler.annotation.Payload;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.kafka.support.KafkaHeaders;


@RestController
public class GreetingController {
		
	@KafkaListener(topics = "#{'${topic.name}'.split(',')}")
	public void greetingListener(@Payload String message,
	        @Header(KafkaHeaders.RECEIVED_MESSAGE_KEY) String key,
	        @Header(KafkaHeaders.RECEIVED_PARTITION_ID) int partition,	        
	        @Header(KafkaHeaders.RECEIVED_TIMESTAMP) Long ts,
	        @Header(KafkaHeaders.GROUP_ID) String groupId,
	        @Header(KafkaHeaders.OFFSET) int offset) {	
		
		System.out.println(String.format(
				"Event Details: Group Id: %s, Offset: %s, Key: %s, Partition: %s, Timestamp: %s, Message: %s", 
				groupId, offset, key, partition, ts, message));
		
	}
	
}