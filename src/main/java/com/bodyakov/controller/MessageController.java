package com.bodyakov.controller;

import com.bodyakov.model.MessageRequest;
import lombok.RequiredArgsConstructor;
import org.springframework.kafka.core.KafkaTemplate;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import static com.bodyakov.model.Topic.BODYAKOV;

@RestController
@RequestMapping("api/v1/messages")
@RequiredArgsConstructor
public class MessageController {

    private final KafkaTemplate<String, String> kafkaTemplate;

    @PostMapping
    public void publishMessage(@RequestBody MessageRequest messageRequest) {
        kafkaTemplate.send(BODYAKOV.getTopicName(), messageRequest.message());
    }
}