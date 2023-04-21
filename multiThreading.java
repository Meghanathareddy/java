class A extends Thread
{
    public void run()
    {
        for(int i =0; i<= 1000; i++)
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
    }
}
class B extends Thread
{
    public void run()
    {
        for(int i =0; i<= 1000; i++)
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
    }
}
public class multiThreading
{
    public static void main(String[] args)
    {
        Thread obj = new A();
        Thread obj1 = new B();

        obj.start();
        try{
            Thread.sleep(300);
        }
        catch(Exception e)
        {

        }
        obj1.start();
    }
    
}
