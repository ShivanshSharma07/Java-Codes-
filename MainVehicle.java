abstract class Vehicle {
    abstract void start();
    abstract void stop();
}

class Car extends Vehicle {
    @Override
    void start() {
        System.out.println("Car start");
    }

    @Override
    void stop() {
        System.out.println("Car stop");
    }
}

class Bike extends Vehicle {
    @Override
    void start() {
        System.out.println("bike start");
    }

    @Override
    void stop() {
        System.out.println("bike stop");
    }
}

class Bus extends Vehicle {
    @Override
    void start() {
        System.out.println("bus start");
    }

    @Override
    void stop() {
        System.out.println("bus stop");
    }
}

public class MainVehicle {
    public static void main(String[] args) {
        Car car = new Car();
        car.start();
        car.stop();

        Bike bike = new Bike();
        bike.start();
        bike.stop();

        Bus bus = new Bus();
        bus.start();
        bus.stop();
    }
}