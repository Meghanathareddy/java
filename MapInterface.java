import java.util.HashMap;
import java.util.Hashtable;
import java.util.Map;
import java.util.Set;

public class MapInterface
{
    public static void main(String[] args) 
    {
        System.out.println("HashMap");
        Map<String, String> map = new HashMap<>(); // Thread unsafe

        map.put("Myname", "Meghanatha Reddy");
        map.put("Actor", "John");
        map.put("ceo", "Marsia");
        map.put("Myname", "Meghanatha Reddy");

        Set<String> keys = map.keySet();
        for(String key:keys)
        {
            System.out.println(key+ "  "+map.get(key));
        }
        System.out.println(); 
        System.out.println("EntrySet");

        Set<Map.Entry<String, String>> map2 = map.entrySet();
        for(Map.Entry<String, String> e:map2)
        {
            System.out.println(e.getKey()+ "  "+e.getValue());
        }
        System.out.println();
        System.out.println("HashTable");
        Map<String, String> map1 = new Hashtable<>(); //  Thread safe

        map1.put("Myname", "Meghanatha Reddy");
        map1.put("Actor", "John");
        map1.put("ceo", "Marsia");
        map1.put("Myname", "Meghanatha Reddy");

        Set<String> keys1 = map1.keySet();
        for(String key:keys1)
        {
            System.out.println(key+ "  "+map.get(key));
        }

    }
}
