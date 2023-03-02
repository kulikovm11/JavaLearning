package Lesson1_class_creation;

import lombok.*;
import lombok.experimental.FieldDefaults;


@ToString
@Getter
@Setter
@FieldDefaults(level = AccessLevel.PRIVATE)




public class Car {

     String model;
     int power;
     double volumeEngine;
     boolean turbo;

    public Car() {

    }

    public Car(String model, int power, double volumeEngine, boolean turbo) {
        this.model = model;
        this.power = power;
        this.volumeEngine = volumeEngine;
        this.turbo = turbo;
    }

    @Override
    public String toString() {
        return "Car{" +
                "model='" + model + '\'' +
                ", power=" + power +
                ", volumeEngine=" + volumeEngine +
                ", turbo=" + turbo +
                '}';
    }
}
