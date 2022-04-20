import java.lang.*;

class Base
{
    public void gun()
    {
        System.out.println("Inside the gun");

    }

    public final void fun()
    {
        System.out.println("Inside the fun");
        
    }


}


class Derived extends Base

{
    public void gun()   //override
    {
        System.out.println("Inside the gun");
        
    }

   /* public void fun()   //Not allowed
    {
        System.out.println("Inside the fun");
        
    }
    */


}



class Final2
{
    public static void main(String arg[])
    {
        Base bobj = new Derived();

        bobj.fun();
        
        
        Derived dobj = new Derived();

        dobj.fun();


    }

}