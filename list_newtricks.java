import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class list_newtricks 
{
    public static void main(String[] args) 
    {
        List<Integer> list = new ArrayList<>();
        list.add(12);
        list.add(13);
        list.add(14);

        for(int i: list)
        {
            System.out.println(i);
        }
        System.out.println("Arrays as list");
        List<Integer> list1 = Arrays.asList(12,13,14);

        for(int i: list1)
        {
            System.out.println(i);
        }
        System.out.println("Arrays as list");
        List<Integer> list2 = new ArrayList<Integer>()
        {
            {
                add(12); 
                add(13); 
                add(14);
            }
        };
        
        for(int i: list2)
        {
            System.out.println(i);
        }
    }
}
