package com.cap.kafkademp;

import lombok.AllArgsConstructor;

@AllArgsConstructor
public class MessageRequest {

    private String message;

    public String getMessage() {
        return message;
    }
    public void setMessage(String message) {
        this.message = message;
    }
}
