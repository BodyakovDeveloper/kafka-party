package com.bodyakov.config;

import org.apache.kafka.clients.admin.NewTopic;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.kafka.config.TopicBuilder;

import static com.bodyakov.model.Topic.BODYAKOV;

@Configuration
public class KafkaTopicConfig {

    @Bean
    public NewTopic bodyakovTopic() {
        return TopicBuilder.name(BODYAKOV.getTopicName())
                .replicas(1)
                .partitions(1)
                .build();
    }
}