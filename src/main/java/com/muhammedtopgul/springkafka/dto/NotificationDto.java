package com.muhammedtopgul.springkafka.dto;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

import java.time.LocalDateTime;
import java.util.UUID;

/**
 * @author muhammed-topgul
 * @since 13/06/2022 15:35
 */
@Getter
@Setter
@AllArgsConstructor
@ToString(of = {"id", "message", "messageDate"})
public class NotificationDto {
    private final String message;
    private final String id = UUID.randomUUID().toString();
    private final LocalDateTime messageDate = LocalDateTime.now();

    public NotificationDto() {
        message = "Default Message";
    }
}
