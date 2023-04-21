import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Vector;

class Student
{
    int rollno;
    int marks;
    public Student(int rollno,  int marks)
    {
        this.rollno = rollno;
        this.marks= marks;
    }
    public  String  toString()
    {
        return rollno  + " " + marks;
    }

}
public class collectionscustomType 
{
    public static void main(String[] args) 
    {
        // Vector<Student> s = new Vector<Student>();
        List<Student> s = new ArrayList<Student>();
        s.add(new Student(1, 542));
        s.add(new Student(2, 54));
        s.add(new Student(3, 51));
        s.add(new Student(4, 5444));

        Collections.sort(s, (s1, s2)->
        {
            return s1.marks > s2.marks ?-1: s1.marks < s2.marks?1:0;
        });
        for(Student s1: s)
        {
            System.out.println(s1);
        }

    }
}
