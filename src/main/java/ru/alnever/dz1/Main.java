package ru.alnever.dz1;

import ru.alnever.dz1.coffee.CreatingCoffeeFactory;
import ru.alnever.dz1.db.Database;
import ru.alnever.dz1.db.ProxyDatabase;
import ru.alnever.dz1.logger.FirstClass;
import ru.alnever.dz1.logger.SecondClass;
import ru.alnever.dz1.usb.AdapterMemoryCardToComputer;
import ru.alnever.dz1.usb.Computer;
import ru.alnever.dz1.usb.MemoryCard;
import ru.alnever.dz1.usb.USB;

public class Main {
    public static void main(String[] args) {
        FirstClass firstClass = new FirstClass();
        firstClass.doSomething();
        SecondClass secondClass = new SecondClass();
        secondClass.doSomething();
        System.out.println("-------------------------------");

        CreatingCoffeeFactory creatingCoffeeFactory = new CreatingCoffeeFactory();
        creatingCoffeeFactory.createCoffee("Espresso").seeName();
        creatingCoffeeFactory.createCoffee("Americano").seeName();
        System.out.println("-------------------------------");

        USB usb = new AdapterMemoryCardToComputer(new MemoryCard());
        Computer computer = new Computer();
        computer.seeDataMemoryCard(usb);
        System.out.println("-------------------------------");

        Database database = new ProxyDatabase("mydatabase");
        database.connect();
    }
}