// Types of interface:
// 1) Normal Interface
// 2) Single abstract Method -> Functional Interface -> lambda -> scala
// 3) Marker Interface -> which does not have methods.
interface ABC
{
    void show();
}


public class FunctionalInterface 
{
    public static void main(String[] args) 
    {
        ABC obj = () -> System.out.println("In the best1"); // LAMBDA EXPRESSIONS
            
            
        

        obj.show();
        
    }
}
