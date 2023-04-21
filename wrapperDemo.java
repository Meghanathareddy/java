//int, float, double
//Integer



public class wrapperDemo 
{
    public static void main(String[] args)
    {
        int i = 5; //primitive value
        Integer li = new Integer(i);// boxing --> wrapping
        int j = li.intValue(); //unboxing - unwrapping

        Integer value = i; //AutoBoxing
        int k = value; // unBoxing

        System.out.println(j+":"+k);

        
    }    
}
