public class MyThread extends Thread {
    @Override
    public void run() {
        System.out.println("Thread from MyThread is running");
        try {
            Thread.sleep(2000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        System.out.println("Thread from MyThread has finished");
    }
}