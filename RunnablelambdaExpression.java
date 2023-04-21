
public class RunnablelambdaExpression
{
    public static void main(String[] args)
    {
         
            
        Thread o1 = new Thread(() -> 
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
            });

        

        Thread obj1 = new Thread(() -> 
        {
            for(int i =0; i<= 10; i++)
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

        o1.start();
        try{
            Thread.sleep(300);
        }
        catch(Exception e)
        {

        }
        obj1.start();
    }
    
}

