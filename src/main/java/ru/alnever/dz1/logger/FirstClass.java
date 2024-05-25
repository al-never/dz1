package ru.alnever.dz1.logger;

public class FirstClass {
    private Logger logger = Logger.getInstance();

    public void doSomething() {
        logger.logInfo(FirstClass.class, "Doing something in FirstClass");
    }
}
