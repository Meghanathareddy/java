
public class threadPriority 
{
    public static void main(String[] args) throws InterruptedException
    {
        
            
        

        Thread obj = new Thread(() -> 
        {
            for(int i =0; i<= 5; i++)
            {
                System.out.println("hi" + Thread.currentThread().getPriority());
            
                try
                {
                    
                    Thread.sleep(5000);
                    
                } 
                catch (Exception e) 
                {
                    //TODO: handle exception
                }
            }
        }, " Thread1");

        Thread obj1 = new Thread(() -> 
        {
            for(int i =0; i<= 5; i++)
            {
                System.out.println("hello"+ Thread.currentThread().getPriority());
            
                try
                {
                    
                    Thread.sleep(5000);
                    
                } 
                catch (Exception e) 
                {
                    //TODO: handle exception
                }
            }
        }, "Thread2");


        System.out.println(obj.getName()+ " " + obj1.getName());
        System.out.println(obj.getPriority() + " " + obj1.getPriority());

        obj.setPriority(Thread.MAX_PRIORITY);
        obj1.setPriority(Thread.MIN_PRIORITY);

        System.out.println(obj.getPriority() + " " + obj1.getPriority());
        obj.start();
        
        try
        {
            Thread.sleep(100);
        }
        catch(Exception e)
        {

        }
        obj1.start();

        obj.join();
        obj1.join();
        
        System.out.print("Bye..");
        

    }
    
}



