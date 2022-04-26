package com.acme.dbo.txlog;

import static com.acme.dbo.txlog.Facade.*;
import static com.acme.dbo.txlog.MessageDecorator.decorateMessageWithPostfix;

public class Printer {

    public static void printToConsole(String message) {
        System.out.println(message);
    }

    public static void printToConsole(int message) {
        System.out.println(message);
    }

}
