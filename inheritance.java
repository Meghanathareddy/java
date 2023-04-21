class add
{
    public int addi(int i, int j)
    {
        return i+j;
    }
}
class sub extends add
{
    public int subt(int k, int o)
    {
        return k-o;
    }
}
class mul extends sub
{
    public int mult(int p, int q)
    {
        return p*q;
    }
}

public class inheritance
{

    public static void main(String[] args)
    {
        
    mul m = new mul();
    int result1 = m.addi(4, 5);
    int result2 = m.subt(34, 334);
    int result3 = m.mult(23, 4);

    System.out.println(result1);
    System.out.println(result2);
    System.out.println(result3);
    }
}
