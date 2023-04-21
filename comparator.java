import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

import javax.management.ValueExp;

import apple.laf.JRSUIState.ValueState;

class compl implements Comparator<Integer>
{

    public int compare(Integer o1, Integer o2)
    {
        if(01%10 > o2%10)
        {
            return 1;
        }
        return -1;
    }
}
public class comparator 
{
    public static void main(String[] args)
    {
        List<Integer> values = new ArrayList<>();
        values.add(305);
        values.add(998);
        values.add(120);
        values.add(236);
        values.add(881);

        Comparator<Integer> com = (Integer o1, Integer o2) ->
        {
         return o1%10 > o2%10 ? 1: -1;
        } ;

        Collections.sort(values, com);

        for(int i:values)
        {
            System.out.println(i);
        }

    }
}
