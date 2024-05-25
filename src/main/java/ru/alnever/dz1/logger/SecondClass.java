package ru.alnever.dz1.logger;

public class SecondClass {
    private Logger logger = Logger.getInstance();

    public void doSomething() {
        logger.logInfo(SecondClass.class, "Doing something in SecondClass");
    }
}
