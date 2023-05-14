package org.example;

public class DebugLogProcessor extends LogProcessor {

    DebugLogProcessor(LogProcessor logProcessor){
        super(logProcessor);
    }

    public void log(int logLevel, String message){

        if(logLevel==DEBUG){
            System.out.println("DEBUG: "+message);
        }
        else{
            // basically, just go to next
            super.log(logLevel, message);
        }
    }
}
