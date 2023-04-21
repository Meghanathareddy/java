// Abstract Class -> Define And Declare
//Interface -> Declare -> 1.7
// from 1.8 can define methods in interface
interface demo
{
    void abc();
    default void show()
    {
        System.out.println("In show");
    }
}
class DemoImp implements demo
{
    public void abc()
    {
        System.out.println("In abc");
    }
    public void show()
    {
        System.out.println("In the show of best in dealult");
    }
}
public class defaultMethodsWIthInterface 
{
     public static void main(String[] args) 
     {
        demo obj = new DemoImp();
        obj.abc();
        obj.show();
     }
}
