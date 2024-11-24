package com.task.singleton;

import java.text.SimpleDateFormat;
import java.util.Date;

public class Logger {

    private static Logger logger;

    private Logger() {}

    public static Logger getInstance() {
        if (logger == null) {
            logger = new Logger();
        }
        return logger;
    }

    public void classLogg(Object obj, String info) {
        String className = obj.getClass().getSimpleName();
        String currentDate = new SimpleDateFormat("dd.MM.yy").format(new Date());
        System.out.println("Log info: " + currentDate + " - " + className + " - " + info);
    }
}
