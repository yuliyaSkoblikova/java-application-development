package com.acme.dbo.txlog;

import static com.acme.dbo.txlog.MessageDecorator.decorateMessageWithPostfix;
import static com.acme.dbo.txlog.MessageDecorator.decorateMessageWithPrefix;
import static com.acme.dbo.txlog.Printer.*;

public class Facade {

    private static String stringAccumulator = "";
    private static int intMessage = 0;
    private static int intCounter = 0;
    private static int stringCounter = 0;

    public static void log(int message) {
        printAndFlushString();
        intMessage += message;
        intCounter++;
//TODO iteration01        printToConsole(decorateMessage(message));
    }

    public static void log(byte message) {
        printToConsole(decorateMessageWithPrefix(message));
    }

    public static void log(char message) {
        printToConsole(decorateMessageWithPrefix(message));
    }

    public static void log(String message) {
        printAndFlushInt();
        Object myObject = new Object();
        if (!stringAccumulator.equals(message)) {
            printAndFlushString();
        }
        stringAccumulator = message;
        stringCounter++;
// TODO: iteration01      printToConsole(decorateMessage(message));
    }

    public static void log(boolean message) {
        printToConsole(decorateMessageWithPrefix(message));
    }

    public static void log(Object message) {
        printToConsole(decorateMessageWithPrefix(message));
    }

    public static void printAndFlushInt() {
        if (intCounter != 0) {
            printToConsole(MessageDecorator.decorateMessageWithPrefix(intMessage));
            intMessage = 0;
            intCounter = 0;
        }
    }

    public static void printAndFlushString() {
        if (stringAccumulator.isEmpty()) return;
        if (stringCounter > 1) {
            printToConsole(decorateMessageWithPostfix(stringAccumulator, stringCounter));
        } else {
            printToConsole(decorateMessageWithPrefix(stringAccumulator));
        }
        stringAccumulator = "";
        stringCounter = 0;
    }

    public static void close() {
        printAndFlushInt();
        printAndFlushString();
    }

}
