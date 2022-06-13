package com.muhammedtopgul.springkafka.listener;

import com.muhammedtopgul.springkafka.dto.NotificationDto;
import lombok.extern.slf4j.Slf4j;
import org.springframework.kafka.annotation.KafkaListener;
import org.springframework.messaging.handler.annotation.Payload;
import org.springframework.stereotype.Service;

/**
 * @author muhammed-topgul
 * @since 13/06/2022 15:40
 */
@Service
@Slf4j
public class ListenerService {
    @KafkaListener(
            topics = "${muhammedtopgul.kafka.topic}",
            groupId = "${muhammedtopgul.kafka.group.id}"
    )
    public void listen(@Payload NotificationDto message) {
        log.info("Received --> MessageID : {} Message: {} Date : {}",
                message.getId(),
                message.getMessage(),
                message.getMessageDate());
    }
}
