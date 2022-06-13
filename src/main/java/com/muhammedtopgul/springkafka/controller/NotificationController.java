package com.muhammedtopgul.springkafka.controller;

import com.muhammedtopgul.springkafka.dto.NotificationDto;
import lombok.RequiredArgsConstructor;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.kafka.core.KafkaTemplate;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.UUID;

/**
 * @author muhammed-topgul
 * @since 13/06/2022 14:34
 */
@RestController
@RequestMapping("/api/v1/notifications")
@RequiredArgsConstructor
public class NotificationController {
    @Value("${muhammedtopgul.kafka.topic}")
    private String topic;

    private final KafkaTemplate<String, NotificationDto> kafkaTemplate;

    @PostMapping
    public void sendMessage(@RequestBody NotificationDto message) {
        kafkaTemplate.send(topic, UUID.randomUUID().toString(), message);
    }
}
