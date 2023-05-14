package org.example;

public class Main {
    public static void main(String[] args){

        // info -->(next) debug -->(next) error
        LogProcessor logObject  = new InfoLogProcessor(new DebugLogProcessor(new ErrorLogProcessor(null)));

        logObject.log(LogProcessor.ERROR, "exception happens");
        logObject.log(LogProcessor.DEBUG, "need to debug this ");
        logObject.log(LogProcessor.INFO, "just for info ");


    }
}