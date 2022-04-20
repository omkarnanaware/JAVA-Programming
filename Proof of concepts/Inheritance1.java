import java.lang.*;

class Inheritance1
{
    static
    {
        System.out.println("Inside the static block ");
    }

    public static void main(String arg[])
    {
        System.out.println("Inside the main ");
        Derived dobj = new Derived();
        dobj.fun();
        dobj.fun(11);
        dobj.gun();
        dobj.sun();

    }
}




class Base
{
    public int i;
    public int j;

    public Base()
    {
        System.out.println("Inside base Constructor");
        this.i = 10;
        this.j = 20;
    }

    public Base(int a, int b)
    {
        System.out.println("Inside base parametrized Constructor");
        this.i = a;
        this.j = b;
    }

    public void fun()
    {
        System.out.println("Inside the fun ");
    }

    public void fun(int x)
    {
        System.out.println("Inside the fun with integer arguments ");
    }

    public void gun()
    {
        System.out.println("Inside the gun");
    }
}

class Derived extends Base  //class Derived : public Base 
{
    public int x;
    public int y ;

    public Derived()
    {
        super(11,21);
        System.out.println("Inside the Derived Constructor ");
        this.x = 30;
        this.y = 40;
    }

    public void sun()
    {
        System.out.println("Inside the Derived sun ");
        System.out.println(super.i);    //1
        super.fun();    //2
    }

}

