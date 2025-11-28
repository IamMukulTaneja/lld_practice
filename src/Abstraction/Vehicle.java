package Abstraction;

abstract class Vehicle {
    private String brand;

    Vehicle(String brand ) {
        this.brand = brand;
    }

    abstract void start();

    void displayBrand() {
        System.out.println("Brand: " + brand);
    }
}


class Car extends Vehicle {

    Car(String brand) {
        super(brand);
    }

    @Override
    void start() {
        System.out.println("A car is starting....");
    }
}

class Main {
    public static void main(String[] args) {
        Car car = new Car("Alto");
        car.start();
        car.displayBrand();
    }
}
