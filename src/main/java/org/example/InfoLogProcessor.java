package org.example;

public class InfoLogProcessor extends LogProcessor{

    InfoLogProcessor(LogProcessor logProcessor){
        super(logProcessor);
    }

    public void log(int logLevel, String message){

        if(logLevel==INFO){
            System.out.println("INFO: "+message);
        }
        else{
            // basically, just go to next
            super.log(logLevel, message);
        }
    }
}
