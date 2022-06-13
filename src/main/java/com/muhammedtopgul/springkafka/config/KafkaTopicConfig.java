package com.muhammedtopgul.springkafka.config;

import org.apache.kafka.clients.admin.NewTopic;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.kafka.config.TopicBuilder;

/**
 * @author muhammed-topgul
 * @since 13/06/2022 13:40
 */
@Configuration
public class KafkaTopicConfig {
    public static final String TOPIC_NAME = "muhammedtopgul";
    public static final String GROUP_ID = "muhammed-group";

    @Bean
    public NewTopic topic() {
        return TopicBuilder.name(TOPIC_NAME)
                .build();
    }
}
