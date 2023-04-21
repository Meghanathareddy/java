import java.text.CollationElementIterator;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;

// collection -> 1.2 and generics -> 1.5
public class collection 
{
    public static void main(String[] args) 
    {
        // int a[] = new int[4];
        // Object values[] = new Object[4];
        // values[0] = "Navin";
        // values[1] = 345;
        Collection<Integer> values = new ArrayList<Integer>();
        values.add(3);
        values.add(77);
        values.add(88);
        System.out.println("Iterator ");
        Iterator itr = values.iterator();
        while(itr.hasNext())
        {
            System.out.println(itr.next());
        }
        values.remove(77);
        System.out.println("Enchanced for loop");
        for(int i : values)
        {
            System.out.println(i);
        }
    }
}
