class MyThread implements Runnable {
    public void run() {
        for (int i = 1; i <= 5; i++) {
            System.out.println(i);
            try {
                Thread.sleep(500);
            } catch (InterruptedException e) {
                System.out.println(e);
            }
        }
    }
}
public class ThreadDemo2 {
    public static void main(String[] args) {
        MyThread myRunnable = new MyThread();

        Thread t1 = new Thread(myRunnable, "Runnable-1");
        Thread t2 = new Thread(myRunnable, "Runnable-2");

        t1.start();
        t2.start();
    }
}

