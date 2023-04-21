class A
{
    public final void show()
    {
        System.out.println("In A Show");
    }
}

class B extends A
{
    public void show()
    {
        System.out.println("in B show");
    }
}


public class finalDemo 
{
    public static void main(String[] args)
    {
        B obj = new B();
        obj.show();
        
    }
}
