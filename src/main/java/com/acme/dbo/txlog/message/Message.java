package com.acme.dbo.txlog.message;

public interface Message {

    public String decorate();

    public boolean isSame(Message message);

    public Message accumulate(Message message);
}
