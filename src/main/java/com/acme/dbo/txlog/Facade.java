package com.acme.dbo.txlog;

import static com.acme.dbo.txlog.MessageDecorator.decorateMessageWithPrefix;
import static com.acme.dbo.txlog.Printer.*;

// separate class PrefixMessageDecorator with static functions decorateMessage with different types of parameters
// constants should be private

public class Facade {

    public static String incomingMessage = "";
    public static int intMessage = 0;
    public static int intCounter = 0;
    public static int equalStrCounter = 0;

    public static void log(int message) {
        printToConsoleAndResetString();
        intMessage += message;
        intCounter++;
//TODO iteration01        printToConsole(decorateMessage(message));
    }

    public static void log(byte message) {
        printToConsole(MessageDecorator.decorateMessageWithPrefix(message));
    }

    public static void log(char message) {
        printToConsole(MessageDecorator.decorateMessageWithPrefix(message));
    }

    public static void log(String message) {
        printToConsoleAndResetInt();
        if(!message.equals(incomingMessage)) {
            printToConsoleAndResetString();
        }
        incomingMessage = message;
        equalStrCounter++;
// TODO: iteration01      printToConsole(decorateMessage(message));
    }

    public static void log(boolean message) {
        printToConsole(MessageDecorator.decorateMessageWithPrefix(message));
    }

    public static void log(Object message) {
        printToConsole(decorateMessageWithPrefix(message));
    }

    public static void close()
    {
        printToConsoleAndResetInt();
        printToConsoleAndResetString();
    }

}
