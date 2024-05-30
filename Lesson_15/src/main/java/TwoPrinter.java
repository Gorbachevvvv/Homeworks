public class TwoPrinter implements Runnable {
    private Printer printer;

    public TwoPrinter(Printer printer) {
        this.printer = printer;
    }

    @Override
    public void run() {
        while (true) {
            printer.printTwo();
        }
    }
}