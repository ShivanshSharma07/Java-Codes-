interface Camera {
    void capturePhoto();
    void captureVideo();
}

class Mobile implements Camera {

    public void capturePhoto() {
        System.out.println("Capturing Photo...");
    }

    public void captureVideo() {
        System.out.println("Capturing Video...");
    }
}

public class Main2 {
    public static void main(String[] args) {
        Mobile m = new Mobile();

        m.capturePhoto();
        m.captureVideo();
    }
}