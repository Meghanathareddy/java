class Q
{
    int num ;
    boolean valueset = false;
    public synchronized void put(int num )
    {
        while(valueset)
        {
            try
            {
                wait();
            }
            catch(Exception e)
            {

            }
        }
        System.out.println("put:"+num);
        this.num = num;
        valueset = true;
        notify();
    }
    public synchronized void get()
    {
        while(!valueset)
        {
            try
            {
                wait();
            }
            catch(Exception e)
            {

            }
        }
        System.out.println("Get:" +  num);
        valueset = false;
        notify();
    }
}
class Producer implements Runnable
{
    Q q;
    public Producer(Q q)
    {
        this.q = q;
        Thread t1 = new Thread(this, "Producer");
        t1.start();

    }
    public void run()
    {
        int i =0;

        while(true)
        {
            q.put(i++);
            try
            {
                Thread.sleep(1000);
            }
            catch(Exception e)
            {
            }
        }
    }
}
class Consumer implements Runnable
{
    Q q;
    public Consumer(Q q)
    {
        this.q = q;
        Thread t2 = new Thread(this, "Consumer");
        t2.start();
    }
    public void run()
    {
        
        while(true)
        {
            q.get();
            try
            {
                Thread.sleep(1000);
            }
            catch(Exception e)
            {
            }
        }
    }
}

public class interThreadcommunication
{

    private static Consumer consumer;
    private static Producer producer;

    public static void main(String[] args) 
    {
        Q q = new Q();
        producer = new Producer(q);
        consumer = new Consumer(q);
    }
}
