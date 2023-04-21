//Encapsulation -> Binding data with methods.
class student
{
    private int rollno;
    private String name;

    public int getrollno()
    {
        return rollno;
    }
    public void setRollno(int rollno)
    {
        this.rollno = rollno;
    }
    public String getname()
    {
        return name;
    }
    public void setName(String name)
    {
        this.name = name;
    }
}
public class encapuslation 
{
    public static void main(String[] args) 
    {
        student s = new student();
        s.setRollno(1);
        s.setName("Meghanatha Reddy");

        System.out.println(s.getrollno());
        System.out.println(s.getname());
        
    }
    
}
