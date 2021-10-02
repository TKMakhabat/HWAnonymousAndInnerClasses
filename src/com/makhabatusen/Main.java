package com.makhabatusen;

public class Main {

    public static void main(String[] args) {

        // Task1
        Car car = new Car("Crysler", "4WD");
        Car.Engine engine = car.new Engine();
        engine.setEngineType();
        engine.engineInfo();

        Car car2 = new Car("Mazda", "8WD");
        Car.Engine engine1 = car2.new Engine();
        engine1.setEngineType();
        engine1.engineInfo();


        //Task2
        System.out.println("\n____");

        Plant plant = () -> System.out.println("\nGrows the plant");
        plant.grow();


        Machine machine = new Machine() {
            @Override
            void start() {
                super.start();
                System.out.println("Starts in Main");
            }
        };
        machine.start();

    }
}
