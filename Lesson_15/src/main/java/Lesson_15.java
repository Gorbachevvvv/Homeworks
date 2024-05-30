

public class Lesson_15 {
    //task1
    public static void main(String[] args) {
        MyThread myThread = new MyThread();
        myThread.start();
        Thread myRunnableThread = new Thread(new MyRunnable());
        myRunnableThread.start();

        try {
            myThread.join();
            myRunnableThread.join();
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        System.out.println("Main thread has finished");


        // task 2
        int[] array = {5, 8, 2, 14, 7, 3, 10};


        MaxFinder maxFinder = new MaxFinder(array);
        MinFinder minFinder = new MinFinder(array);


        Thread maxThread = new Thread(maxFinder);
        Thread minThread = new Thread(minFinder);


        maxThread.start();
        minThread.start();

        try {

            maxThread.join();
            minThread.join();
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

        // Вывод результатов
        System.out.println("Maximum value: " + maxFinder.getMaxValue());
        System.out.println("Minimum value: " + minFinder.getMinValue());


//task3
        Thread daemonThread = new Thread(new DaemonTask());
        daemonThread.setDaemon(true);
        daemonThread.start();

        try {

            Thread.sleep(3000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

        System.out.println("Main thread is finishing.");

        //task4
        Printer printer = new Printer();

        Thread thread1 = new Thread(new OnePrinter(printer));
        Thread thread2 = new Thread(new TwoPrinter(printer));

        thread1.start();
        thread2.start();
    }

}