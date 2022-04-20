import java.lang.*;

class Base
{
    public void fun()
    {
        System.out.println("Base fun");
    }
    public void gun()
    {
        System.out.println("Base gun");
    }
    public void sun()
    {
        System.out.println("Base sun");
    }    
}

class Derived extends Base
{
    public void fun()
    {
        System.out.println("Derived fun");
    }
    public void gun()
    {
        System.out.println("Derived gun");
    }
    public void run()
    {
        System.out.println("Derived run");
    }    


}

class Virtual
{
    public static void main(String arg[])
    {
//        Base bobj = new Base();
 //       Derived dobj = new Derived()

        Base obj1 = new Derived();  //upcasting
        //Derived obj2 = new Base();   Downcasting not allowed

        obj1.fun();
        obj1.sun();
        obj1.gun();
        //obj1.run();  

    }
}