package com.acme.dbo.txlog.message;

public class StringMessage implements Message{
    private final String STRING_PREFIX = "string: ";
    private String value;

    public StringMessage(String value) {
        this.value = value;
    }

    public String getValue() {
        return value;
    }

    @Override
    public String decorate() {
        return STRING_PREFIX + value;
    }

    @Override
    public boolean isSame(Message message) {
        return message instanceof StringMessage;
    }

    @Override
    public void accumulate(Message message){
        value += ((StringMessage)message).value;
    }
}
