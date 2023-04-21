
interface Demo
{
    int num = 8;
    void abc();
    static void show()
    {
        System.out.println("Hi");
    }
}
class DemoImp implements Demo
{
    public void abc()
    {
        num =9;
    }
}

public class staticMethodsInterface 
{
    public static void main(String[] args) {
        Demo.show();
    }
}
