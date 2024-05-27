package TestSynchronizationNNotify;

public class Company {

    int product;
    boolean chance = false;

    // chance = false -> producer
    // chance = true -> consumer

    synchronized public void produceItem(int _product) throws Exception{
        if(chance){
            wait();
        }
        this.product = _product;

        chance = true;
        notify();

        System.out.println(" Produced Item = " + this.product);
    }
    synchronized public int consumeItem() throws Exception{
        if(!chance){
            wait();
        }
        System.out.println(" Consumed Item = " + this.product);

        chance = false;
        notify();

        return this.product;
    }
}
