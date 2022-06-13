package com.muhammedtopgul.springkafka.controller;

import com.muhammedtopgul.springkafka.request.MessageRequest;
import lombok.AllArgsConstructor;
import org.springframework.kafka.core.KafkaTemplate;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import static com.muhammedtopgul.springkafka.config.KafkaTopicConfig.TOPIC_NAME;

/**
 * @author muhammed-topgul
 * @since 13/06/2022 14:34
 */
@RestController
@RequestMapping("/api/v1/messages")
@AllArgsConstructor
public class MessageController {
    private final KafkaTemplate<String, String> kafkaTemplate;

    @PostMapping
    public void publish(@RequestBody MessageRequest request) {
        kafkaTemplate.send(TOPIC_NAME, request.message());
    }
}
