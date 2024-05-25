package ru.alnever.dz1.logger;

public class Logger {
    private static Logger instance;

    private Logger() {
    }

    public static Logger getInstance() {
        if (instance == null) {
            instance = new Logger();
        }
        return instance;
    }

    public void logInfo(Class<?> clazz, String info) {
        System.out.println("Log info: " + clazz.getSimpleName() + ", " + info);
    }
}
