import java.lang.*;
import java.util.*;

class Student
{
    public int rno;
    public String name;
    public int marks;

    public Student(int a,String str,int b)
    {
        this.rno = a;
        this.name = str;
        this.marks = b;

    }

    public void Display()
    {
        System.out.println("Name :"+this.name +" Roll no :"+this.rno+ " Marks :"+this.marks);

    }

}


class ST
{
    public static void main(String args[])
    {
    
        Stack <Student> obj = new Stack<Student>();

        Student s1 = new Student(11,"Amit",89);
        Student s2 = new Student(21,"Pooja",93);
        Student s3 = new Student(51,"Rohit",93);
        Student s4 = new Student(101,"Sachin",97);
        //Student s5 = new Student();
        //Student s6 = new Student();

        obj.push(s1);
        obj.push(s2);
        obj.push(s3);
        obj.push(s4);
        
        Student ref = null;
        Iterator iob = obj.iterator();
        while(iob.hasNext())
        {
            ref =(Student)iob.next();
            ref.Display();
        }

        System.out.println("Popped elements are:");
        ref = obj.pop();
        ref.Display();

        ref = obj.pop();
        ref.Display();

        


    }


}