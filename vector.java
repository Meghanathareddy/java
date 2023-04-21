import java.util.Vector;

public class vector 
{
    public static void main(String[] args) 
    {
        Vector<Integer> v = new Vector<>();

        v.add(1);
        v.add(6);
        v.add(2);
        v.add(1);
        v.add(6);
        v.add(2);
        v.add(1);
        v.add(6);
        v.add(2);
        v.add(1);
        v.add(6);
        v.add(2);
        v.add(1);
        v.add(6);
        v.add(2);
        v.add(1);
        v.add(6);
        v.add(2);
        v.add(1);
        v.add(6);
        v.add(2);
        v.add(1);
        v.add(6);
        v.add(2);
        v.add(1);
        v.add(6);
        v.add(2);
        v.add(1);
        v.add(6);
        v.add(2);
        
        v.remove(2);
        v.remove(3);
        v.remove(1);
        System.out.println(v.capacity());
        for(int i : v)
        {
            System.out.println(i);
        }
    }
}
