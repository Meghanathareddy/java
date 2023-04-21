class A
{
    public void show()
    {
        System.out.println("In A");
        
    }
}
class B extends A
{
    
    public void show()
    {
        System.out.println("In B");
        
    }

}
class C extends A
{
    public void show()
    {
        System.out.println("In C");
        
    }
}
class DynamicMethodDispatch 
{
    //compile time and runtime polymorphism
    public static void main(String[] args) 

    {   
        A obj = new B();// runtime polymorphism
        obj.show();// Dynamic method dispatch

        obj = new C();
        obj.show();

     
    }   
}
