package com.makhabatusen;

public class Car {

    private final String carName;
    private final String carType;

    public Car(String carName, String carType) {
        this.carName = carName;
        this.carType = carType;
    }

    public String getCarName() {
        return carName;
    }

    public String getCarType() {
        return carType;
    }

    class Engine {
        private String engineType;

        public void setEngineType() {
           if (getCarName().equals("Crysler") && getCarType().equals("4WD"))
               this.engineType = "small engine";
           else this.engineType = "big engine";

        }

        public String getEngineType() {
            return engineType;
        }


        void engineInfo() {
            System.out.printf("\nEngine Type for %s: %s", getCarType(), getEngineType());
        }
    }
}
