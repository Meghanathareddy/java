
interface writer
{
    void write();
}
class Pen implements writer
{
    public void write()
    {
        System.out.println("I am Pen");
    }
}
class Pencil implements writer
{
    public void write()
    {
        System.out.println("I am Pencil");
    }
}
class kit
{
    public void dosomething(writer p)
    {
        p.write();
    }
}

public class interfaceDemo
{
    public static void main(String[] args)
    {

        kit k = new kit();
        writer p = new Pen();
        writer pc = new Pencil();

        k.dosomething(p);
    

    }
}
