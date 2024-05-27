package TestSynchronizationNNotify;

class Consumer extends Thread{

    Company c;

    Consumer(Company c){
        this.c = c;
    }

    public void run() {
        while (true){
            try {
                this.c.consumeItem();
            } catch (Exception e) {
                throw new RuntimeException(e);
            }
            try { Thread.sleep(4000); } catch (Exception e) {}
        }
    }
}
