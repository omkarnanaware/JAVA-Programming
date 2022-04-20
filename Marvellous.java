import java.lang.*;

class Demo
{
    public int i;
    public int j;

    public Demo()
    {
        this.i = 0;
        this.j = 0;

    }

    public Demo(int x, int y)
    {
        this.i = x;
        this.j = y;
    }

    public void fun()
    {
        System.out.println("Inside fun");
    }

    public void gun()
    {
        System.out.println("Inside gun");
    }
}




class Marvellous
{
    public static void main(String arg[])
    {
        System.out.println("Inside main");
        Demo obj = new Demo();  //obj is reference in this programm which refering to head memory location which allocted space for characteristics.
        obj.fun();  //fun(obj);
        obj.gun();  //gun(obj);
        System.out.println(obj.i);

        Demo objx = new Demo(10,11);
        objx.fun();  //fun(obj);
        objx.gun();  //gun(obj);
        System.out.println(objx.i);
    }


}
