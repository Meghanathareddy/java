import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.sql.SQLException;
class MyException extends Exception
{
    public MyException(String msg)
    {
        super(msg);
    }
} 

public class throwBlock 
{
    public static void main(String[] args)  throws IOException, SQLException
    {
        int i, j = 1, k =0;
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        try
        {
            System.out.println("Enter a number");
            i = Integer.parseInt(br.readLine());
            
            if (i > 1)
            {
                throw new MyException(" dasf ");
            }

        }
        catch(IOException e)
        {
            System.out.println("Some IO Error");
        }
        catch(ArithmeticException e)
        {
            System.out.println(" Error "+ e);
        }
        catch(Exception e)
        {
            System.out.println("error");
        }
    }
    
}


