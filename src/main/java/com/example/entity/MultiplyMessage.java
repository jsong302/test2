package com.example.entity;

import com.fasterxml.jackson.annotation.JsonProperty;


public class MultiplyMessage {

    @JsonProperty("value")
    private String value;

    public int getValue() {
        return Integer.parseInt(value);
    }
}
