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

    public static void printToConsoleAndResetInt() {
        if (intCounter != 0) {
            printToConsole(intMessage);
            intMessage = 0;
            intCounter = 0;
        }
    }

    public static void printToConsoleAndResetString() {
        if (!incomingMessage.isEmpty() ) {
            if(equalStrCounter > 1) {
                printToConsole(decorateMessageWithPostfix(incomingMessage, equalStrCounter));
            }
            else {
                printToConsole(incomingMessage);
            }
            incomingMessage = "";
            equalStrCounter = 0;
        }
    }

}
