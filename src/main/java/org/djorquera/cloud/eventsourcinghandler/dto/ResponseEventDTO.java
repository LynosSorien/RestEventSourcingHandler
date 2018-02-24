package org.djorquera.cloud.eventsourcinghandler.dto;

import lombok.Builder;

import java.io.Serializable;

@Builder
public class ResponseEventDTO implements Serializable {
    @Builder.Default private boolean posted;
    private Long id;
    private String message;
}
