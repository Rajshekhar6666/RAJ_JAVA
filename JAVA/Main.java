class MyThread extends Thread {
    public void run(){
        System.out.println("Running");
        try{
            Thread.sleep(1000);
        }
        catch (InterruptedException e){
            System.out.println(e);
        }
    }
}
public class Main
{
    public static void main(String[] args) {
        MyThread t1 = new MyThread();
        System.out.println(t1.getState());
        t1.start();
        System.out.println(t1.getState());
        Thread.sleep(1000);
        System.out.println(t1.getState());

        t1.join();
        System.out.println(t1.getState());
    }
}
