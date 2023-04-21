import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class TrywithResource 
{
    public static void main(String[] args) throws IOException
    {
        // BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        // try
        // {
        //     String str = " ";
        //     str = br.readLine();

        // }
        // catch(Exception e)
        // {
        //     System.out.println("Error" +e);
        // }
        // finally
        // {
        //     br.close();
        // }
        
        /*

        Try with Resource - 1.7
        */
        try(BufferedReader br = new BufferedReader(new InputStreamReader(System.in));)
        {
            
            String str = " ";
            str = br.readLine();
            System.out.println("str:"+str);

        }
    }
    
}
