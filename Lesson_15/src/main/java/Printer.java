public class Printer {
    private boolean isOneTurn = true;

    public synchronized void printOne() {
        while (!isOneTurn) {
            try {
                wait();
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
        for (int i = 0; i < 3; i++) {
            System.out.println(1);
            try {
                Thread.sleep(500); // Небольшая задержка
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
        isOneTurn = false;
        notify();
    }

    public synchronized void printTwo() {
        while (isOneTurn) {
            try {
                wait();
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
        for (int i = 0; i < 3; i++) {
            System.out.println(2);
            try {
                Thread.sleep(500); // Небольшая задержка
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
        isOneTurn = true;
        notify();
    }
}
