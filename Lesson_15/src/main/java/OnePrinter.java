public class OnePrinter implements Runnable {
    private Printer printer;

    public OnePrinter(Printer printer) {
        this.printer = printer;
    }

    @Override
    public void run() {
        while (true) {
            printer.printOne();
        }
    }
}

