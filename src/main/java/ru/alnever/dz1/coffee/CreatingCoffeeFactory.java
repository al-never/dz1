package ru.alnever.dz1.coffee;

public class CreatingCoffeeFactory implements CoffeeFactory {


    @Override
    public Coffee createCoffee(String type) {
        if (type.equalsIgnoreCase("americano")) {
            return new Americano();
        } else if (type.equalsIgnoreCase("espresso")) {
            return new Espresso();
        } else {
            throw new RuntimeException(type + " not exists!");
        }
    }
}
