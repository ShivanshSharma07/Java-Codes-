interface Vehicle {
    void start();
}

class Car implements Vehicle {
    @Override
    public void start() {
        System.out.println("Car starts with key");
    }
}

class Scooty implements Vehicle {
    @Override
    public void start() {
        System.out.println("Scooty starts with kick");
    }
}

public class Main4 {
    public static void main(String[] args) {

        
        Vehicle v1 = new Car();
        Vehicle v2 = new Scooty();

        v1.start();
        v2.start();
    }
}