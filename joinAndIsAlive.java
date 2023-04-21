
public class joinAndIsAlive
{
    public static void main(String[] args) throws InterruptedException
    {
        
            
        

        Thread obj = new Thread(() -> 
        {
            for(int i =0; i<= 5; i++)
            {
                System.out.println("hi");
            
                try
                {
                    
                    Thread.sleep(5000);
                    
                } 
                catch (Exception e) 
                {
                    //TODO: handle exception
                }
            }
        });

        Thread obj1 = new Thread(() -> 
        {
            for(int i =0; i<= 5; i++)
            {
                System.out.println("hello");
            
                try
                {
                    
                    Thread.sleep(5000);
                    
                } 
                catch (Exception e) 
                {
                    //TODO: handle exception
                }
            }
        });

        obj.start();
        
        obj.join();
        obj1.start();
        obj1.join();
        System.out.print("Bye..");
        

    }
    
}

