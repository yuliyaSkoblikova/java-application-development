package com.acme.dbo.txlog;

import static com.acme.dbo.txlog.PrefixMessageDecorator.decorateMessage;
import static com.acme.dbo.txlog.Printer.printToConsole;

// separate class PrefixMessageDecorator with static functions decorateMessage with different types of parameters
// constants should be private

public class Facade {

    public static void log(int message) {
        printToConsole(decorateMessage(message));
    }

    public static void log(byte message) {
        printToConsole(decorateMessage(message));
    }

    public static void log(char message) {
        printToConsole(decorateMessage(message));
    }

    public static void log(String message) {
        printToConsole(decorateMessage(message));
    }

    public static void log(boolean message) {
        printToConsole(decorateMessage(message));
    }

    public static void log(Object message) {
        printToConsole(decorateMessage(message));
    }

}
