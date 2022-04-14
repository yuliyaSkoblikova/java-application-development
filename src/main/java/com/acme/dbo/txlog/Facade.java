package com.acme.dbo.txlog;

import javax.print.DocFlavor;
import static com.acme.dbo.txlog.Printer.printToConsole;

public class Facade {
    public static final String REFERENCE_PREFIX = "reference: ";
    public static final String PRIMITIVE_PREFIX = "primitive: ";
    public static final String CHAR_PREFIX = "char: ";
    public static final String STRING_PREFIX = "string: ";

    public static void log(int message) {
        printToConsole(PRIMITIVE_PREFIX + message);
    }

    public static void log(byte message) {
        printToConsole(PRIMITIVE_PREFIX + message);
    }

    public static void log(char message) {
        printToConsole(CHAR_PREFIX + message);
    }

    public static void log(String message) {
        printToConsole(STRING_PREFIX + message);
    }

    public static void log(boolean message) {
        printToConsole(PRIMITIVE_PREFIX + message);
    }

    public static void log(Object message) {
        printToConsole(REFERENCE_PREFIX + message);
    }

}
