package com.acme.dbo.txlog;

import com.acme.dbo.txlog.message.IntMessage;
import com.acme.dbo.txlog.saver.ConsoleSaver;

import static com.acme.dbo.txlog.MessageDecorator.decorateMessageWithPostfix;
import static com.acme.dbo.txlog.MessageDecorator.decorateMessageWithPrefix;

public class Facade {

    private static String stringAccumulator = "";
    private static int intMessage = 0;
    private static int intCounter = 0;
    private static int stringCounter = 0;

    private static LogService service = new LogService();

    public static void log(int intMessage){
        service.log(new IntMessage(intMessage));
    }

//    public static void log(String message) {
//        printAndFlushInt();
//        Object myObject = new Object();
//        if (!stringAccumulator.equals(message)) {
//            printAndFlushString();
//        }
//        stringAccumulator = message;
//        stringCounter++;
//    }

//    public static void log(byte message) {
//        printToConsole(decorateMessageWithPrefix(message));
//    }
//
//    public static void log(char message) {
//        printToConsole(decorateMessageWithPrefix(message));
//    }


//    public static void log(boolean message) {
//        printToConsole(decorateMessageWithPrefix(message));
//    }
//
//    public static void log(Object message) {
//        printToConsole(decorateMessageWithPrefix(message));
//    }

//    public static void printAndFlushInt() {
//        if (intCounter != 0) {
//            consoleSaver.save(MessageDecorator.decorateMessageWithPrefix(intMessage));
//            intMessage = 0;
//            intCounter = 0;
//        }
//    }
//
//    public static void printAndFlushString() {
//        if (stringAccumulator.isEmpty()) return;
//        if (stringCounter > 1) {
//            printToConsole(decorateMessageWithPostfix(stringAccumulator, stringCounter));
//        } else {
//            printToConsole(decorateMessageWithPrefix(stringAccumulator));
//        }
//        stringAccumulator = "";
//        stringCounter = 0;
//    }
//
//    public static void close() {
//        printAndFlushInt();
//        printAndFlushString();
//    }

}
