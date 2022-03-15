package com.ooad.cecs575_group05.model;
//SINGLETON PATTERN
public class Logger {
    private static Logger logger = null;

    public static synchronized Logger getInstance(){
        if(logger == null)
            logger = new Logger();
        return logger;
    }
}
