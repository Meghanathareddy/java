class calc {
    public int add(int ...k)
    {
        int sum = 0;
        for(int i:k)
        {
            sum = sum + i;
        }
        return sum;
    }
}
public class varargs {
    public static void main(String[] args)
    {
        calc obj = new calc();
        System.out.println(obj.add(4,5,6,7,8,34,5,6));
    }
}
