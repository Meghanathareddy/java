abstract class Human
{
    public abstract void eat();

    public void walk()
    {
        System.out.println("walk");
    }
}

class Man extends Human
{
    public void eat()
    {
        System.out.println("eat");
    }
}
public class abstractclass 
{
    public static void main(String[] args) 
    {
        Human obj = new Man();
        obj.walk();
    }
}
