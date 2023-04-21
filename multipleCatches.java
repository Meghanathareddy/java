
public class multipleCatches 
{
    public static void main(String[] args)
    {
        
        try
        {
            int a[] = new int[5];
            a[4] = 8;
            int i = 7;
            int j = 0;
            int k = i/j;
            System.out.println("Output is"+ k);

        }
        catch(ArithmeticException e)
        {
            System.out.println(" Can not divide by zero ");
        }
        catch(ArrayIndexOutOfBoundsException e)
        {
            System.out.println("Stay in your limit");
        }
        catch(Exception e)
        {
            System.out.println(" Error");
        }
        finally
        {
            System.out.println("Bye");
        }
    }
}
