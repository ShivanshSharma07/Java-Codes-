interface Printer {
    void printing();
}

interface Scanner {
    void scanning();
}

interface Fax {
    void faxing();
}

class AllInOne implements Printer, Scanner, Fax {
    @Override
    public void printing() {
        System.out.println("Printing document...");
    }

    @Override
    public void scanning() {
        System.out.println("Scanning document...");
    }

    @Override
    public void faxing() {
        System.out.println("Sending fax...");
    }
}

public class ManyFunction {
    public static void main(String[] args) {
        AllInOne device = new AllInOne();
        
        device.printing();
        device.scanning();
        device.faxing();
    }
}