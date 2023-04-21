class A
{
    int i;
    public void show()
    {
        System.out.println("In A"+i);
    }

}
class B extends A
{
    int i;
    @Override
    public void show()
    {
        i = 8;
        super.i = 8;
        super.show();
        System.out.println("In b"+ i);
    }

}

class methodOverloadig 
{
    public static void main(String[] args) 
    {
        
        B obj = new B();
        obj.show();
    }
    
}
