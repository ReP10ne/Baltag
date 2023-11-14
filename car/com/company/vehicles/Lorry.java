package com.company.vehicles;

import com.company.details.Engine;
import com.company.professions.Driver;

public class Lorry extends Car {
    private int cargoCapacity;

    public Lorry(String brand, String carClass, int weight, Driver driver, Engine engine, int cargoCapacity) {
        super(brand, carClass, weight, driver, engine);
        this.cargoCapacity = cargoCapacity;
    }


    public int getCargoCapacity() {
        return cargoCapacity;
    }

    public void setCargoCapacity(int cargoCapacity) {
        this.cargoCapacity = cargoCapacity;
    }
}