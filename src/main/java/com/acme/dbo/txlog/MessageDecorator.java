package com.acme.dbo.txlog;

public class MessageDecorator {

    private static final String REFERENCE_PREFIX = "reference: ";
    private static final String PRIMITIVE_PREFIX = "primitive: ";
    private static final String CHAR_PREFIX = "char: ";
    private static final String STRING_PREFIX = "string: ";
    private static final String STRING_POSTFIX = " (x";

    public static String decorateMessageWithPrefix(String message) {
        return STRING_PREFIX + message;
    }

    public static String decorateMessageWithPostfix(String message, int counter) {
        return message + STRING_POSTFIX + counter + ")";
    }

    public static String decorateMessageWithPrefix(char message) {
        return CHAR_PREFIX + message;
    }

    public static String decorateMessageWithPrefix(byte message) {
        return PRIMITIVE_PREFIX + message;
    }

    public static String decorateMessageWithPrefix(int message) {
        return PRIMITIVE_PREFIX + message;
    }

    public static String decorateMessageWithPrefix(boolean message) {
        return PRIMITIVE_PREFIX + message;
    }

    public static String decorateMessageWithPrefix(Object message) {
        return REFERENCE_PREFIX + message;
    }
}
