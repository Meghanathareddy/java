class A
{
    public A()
    {
        System.out.println("In A");
    }
    // public A(int i)
    // {
    //     System.out.println("In A int ");
    // }
}
class B
{
    public B()
    {
        super();
        System.out.println("In B");
    }
    // public B(int i)
    // {
    //     super();
    //     System.out.println("In B int ");
    // }
}
public class superdemo 
{
     public static void main(String[] args) 
        
    {
        B a = new B();
        //B a1 = new B(12);
    }
    
}
