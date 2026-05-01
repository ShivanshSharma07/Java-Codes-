class Locker {
    private int pin = 1234;
    private boolean isOpen = false;

    public void openLocker(int enteredPin) {
        if (enteredPin == pin) {
            isOpen = true;
            System.out.println("Locker opened");
        } else {
            System.out.println("Wrong pin");
        }
    }

    public void checkStatus() {
        if (isOpen) {
            System.out.println("Locker is open");
        } else {
            System.out.println("Locker is closed");
        }
    }
}

public class Main1 {
    public static void main(String[] args) {
        Locker locker = new Locker(); 

        locker.checkStatus();
        locker.openLocker(1111);
        locker.openLocker(1234);
        locker.checkStatus();
    }
}