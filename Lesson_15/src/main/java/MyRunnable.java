public class MyRunnable implements Runnable {
    @Override
    public void run() {
        System.out.println("Thread from MyRunnable is running");
        try {
            Thread.sleep(2000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        System.out.println("Thread from MyRunnable has finished");
    }
}