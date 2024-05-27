package TestProgram;

class DemoThread implements Runnable {
    @Override
    public void run() {
        System.out.println("Hey, Demo Thread started");
        for(int i = 0; i < 10; i++){
            System.out.println(i);
            try { Thread.sleep(1000); }
            catch (Exception e) {};
        }
    }
}

class EgThread extends Thread {
    @Override
    public void run() {
        System.out.println("Hey, Example Thread  started");
        for(int i = 100; i < 200; i+=10){
            System.out.println(i);
            try { Thread.sleep(1000); }
            catch (Exception e) {};
        }
    }
}

public class TestMultithreading {
    public static void main(String[] args) {

        // DemoThread Object
        DemoThread t = new DemoThread();
        Thread thread = new Thread(t);


        // EgThread Object
        EgThread thread1 = new EgThread();

        // starting both thread
        thread.start();
        thread1.start();



    }
}
