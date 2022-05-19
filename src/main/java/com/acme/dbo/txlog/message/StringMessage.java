package com.acme.dbo.txlog.message;

public class StringMessage {
    private String value;

    public StringMessage(String value) {
        this.value = value;
    }

    public String getValue() {
        return value;
    }
}
