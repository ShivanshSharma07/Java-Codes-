class Vehicle {
    String fuelType;

    Vehicle(String fuelType) {
        this.fuelType = fuelType;
    }

    void displayFuelType() {
        System.out.println("Fuel Type: " + fuelType);
    }

    public static void main(String[] args) {
        Vehicle car = new Vehicle("Petrol");
        Vehicle bike = new Vehicle("Diesel");
        Vehicle ev = new Vehicle("Electric");

        car.displayFuelType();
        bike.displayFuelType();
        ev.displayFuelType();
    }
}