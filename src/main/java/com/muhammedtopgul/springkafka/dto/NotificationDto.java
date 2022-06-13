package com.muhammedtopgul.springkafka.dto;

import lombok.*;

import java.time.LocalDate;
import java.util.UUID;

/**
 * @author muhammed-topgul
 * @since 13/06/2022 15:35
 */
@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@ToString(of = {"id", "message", "messageDate"})
public class NotificationDto {
    private String message;
    private String id = UUID.randomUUID().toString();
    private LocalDate messageDate = LocalDate.now();
}
