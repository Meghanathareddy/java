import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class ListInterface 
{
    public static void main(String[] args) 
    {
        List<Integer> values = new ArrayList<Integer>();
        values.add(3);
        values.add(99);
        values.add(2);
        values.add(88);
        Collections.sort(values);

        values.forEach(System.out::println); //Stream API ... Lambda Expression


    }
}
