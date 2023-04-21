class A implements Runnable
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
class B implements Runnable
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
public class runnable
{
    public static void main(String[] args)
    {
        Runnable o = new A();
        Runnable o1 = new B();

        Thread obj = new Thread(o);
        Thread obj1 = new Thread(o1);

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
