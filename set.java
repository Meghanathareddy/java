import java.util.HashSet;
import java.util.Set;
import java.util.TreeSet;

public class set 
{
    public static void main(String[] args) 
    {
        Set<Integer> values = new HashSet<>();
        System.out.println(values.add(23));
        System.out.println(values.add(33));
        System.out.println(values.add(43));
        System.out.println(values.add(53));
        System.out.println(values.add(23));
        for(int i:values)
        {
            System.out.println(i);
        }

        Set<Integer> valuess = new TreeSet<>();
        System.out.println(valuess.add(23));
        System.out.println(valuess.add(33));
        System.out.println(valuess.add(43));
        System.out.println(valuess.add(53));
        System.out.println(valuess.add(23));
        for(int i:valuess)
        {
            System.out.println(i);
        }
    }   
}
