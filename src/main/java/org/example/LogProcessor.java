package org.example;

public abstract class LogProcessor {

    public static int INFO =1;
    public static int DEBUG=2;
    public static int ERROR =3;

    LogProcessor next;

    LogProcessor(LogProcessor logProcessor){
        this.next = logProcessor;
    }

    public void log(int logLevel, String message){

        if(next!=null){
            next.log(logLevel, message);
        }
    }
}
