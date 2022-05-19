package com.acme.dbo.txlog.message;

import com.acme.dbo.txlog.MessageDecorator;
import com.acme.dbo.txlog.saver.ConsoleSaver;

public class IntMessage {

    private final String PRIMITIVE_PREFIX = "primitive: ";
    private int value;

    public IntMessage(int value) {
        this.value = value;
    }

    public int getValue() {
        return value;
    }

    public void log(int message, ConsoleSaver consoleSaver) {
//        printAndFlushString();
        value += message;
//        intCounter++;
        consoleSaver.save(decorate());
    }

    private String decorate() {
        return PRIMITIVE_PREFIX + value;
    }
}
