package com.acme.dbo.txlog.message;

public class StringMessage extends PrefixDecoratingMessage {

    private String value;

    public StringMessage(String value) {
        super("string: ");
        this.value = value;
    }

    public String getValue() {
        return value;
    }

    @Override
    public String decorate() {
        return super.decorate(this.value);
    }

    @Override
    public boolean isSame(Message message) {
        return message instanceof StringMessage;
    }

    @Override
    public Message accumulate(Message message) {
        value += ((StringMessage) message).value;
        return this;
    }
}
