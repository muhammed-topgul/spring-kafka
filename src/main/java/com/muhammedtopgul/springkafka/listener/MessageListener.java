package com.muhammedtopgul.springkafka.listener;

import org.springframework.kafka.annotation.KafkaListener;
import org.springframework.stereotype.Component;

import static com.muhammedtopgul.springkafka.config.KafkaTopicConfig.GROUP_ID;
import static com.muhammedtopgul.springkafka.config.KafkaTopicConfig.TOPIC_NAME;

/**
 * @author muhammed-topgul
 * @since 13/06/2022 14:25
 */
@Component
public class MessageListener {
    @KafkaListener(topics = TOPIC_NAME, groupId = GROUP_ID)
    void listener(String data) {
        System.out.println("Listener Received: " + data);
    }
}
