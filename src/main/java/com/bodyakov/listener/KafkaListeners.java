package com.bodyakov.listener;

import org.springframework.kafka.annotation.KafkaListener;
import org.springframework.stereotype.Component;

@Component
public class KafkaListeners {

    @KafkaListener(topics = "bodyak0v", groupId = "groupId")
    public void listener(String data) {
        System.out.println("Listener received: " + data + " =)");
    }
}