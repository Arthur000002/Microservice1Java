package com.example.donorformicroservice1java.kafka;

import org.springframework.kafka.annotation.KafkaListener;
import org.springframework.stereotype.Component;

/**
 * Simple Kafka listener that logs received messages.
 */
@Component
public class SimpleKafkaListener {

    @KafkaListener(topics = "${app.kafka.topic:test-topic}",
            groupId = "${spring.kafka.consumer.group-id:donor-listener}")
    public void listen(String message) {
        System.out.println("Received message: " + message);
    }
}
