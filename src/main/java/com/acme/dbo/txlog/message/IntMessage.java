package com.acme.dbo.txlog.message;

public class IntMessage implements Message {

    private final String PRIMITIVE_PREFIX = "primitive: ";
    private int value;

    public IntMessage(int value) {
        this.value = value;
    }

    public int getValue() {
        return value;
    }

    @Override
    public String decorate() {
        return PRIMITIVE_PREFIX + value;
    }

    @Override
    public boolean isSame(Message message) {
        return message instanceof IntMessage;
    }

    @Override
    public void accumulate(Message message) {
        value += ((IntMessage) message).value;
    }
}
