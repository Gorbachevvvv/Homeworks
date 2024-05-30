public class DaemonTask implements Runnable {
    @Override
    public void run() {
        while (true) {
            System.out.println("Daemon thread is running in background...");
            try {
                Thread.sleep(1000); // Поток-демон спит 1 секунду
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }
}