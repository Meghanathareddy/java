interface demo
{
    void abc();
    default void show()
    {
        System.out.println("In demo show");
    }
}
interface Mydemo
{
    default void show()
    {
        System.out.println("In MYDEMO show");
    }
}
class DemoImp implements demo, Mydemo
{
    public void abc()
    {
        System.out.println("In abc");
    }
    // public void show()
    // {
    //     System.out.println("In the show of best in dealult");
    // }

    public void show()
    {
        Mydemo.super.show();
    }

}
public class multipleInheritanceissueswithInterface 
{
    public static void main(String[] args) {
        DemoImp obj = new DemoImp();
        obj.abc();
        obj.show();
    }
}
