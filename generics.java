import java.util.ArrayList;

class container<T extends Number>
{
    T value;
    public void setValue(T value)
    {
        this.value = value;
    }
    public T getValue()
    {
        return value;
    }
    public void show()
    {
        System.out.println(value.getClass().getName());
    }
    public void demo(ArrayList<? extends T> obj)
    {

    }
}
public class generics
{
    public static void main(String[] args) 
    {
        container<Number> obj = new container<>();
        obj.show();
        obj.demo(new ArrayList<Integer>());
    }
}
