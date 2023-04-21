class A
{
    public void show()
    {
        System.out.println("In A show");
    }
}
public class anonymousExample
{
 public static void main(String[] args) 
 {
    A obj = new A()
    {
        public void show()
        {
            System.out.println(" In the best");
        }
    };
    obj.show();
     
 }    
}
