import java.lang.*;

class Demo
{
    public int i;
    public final int j = 20;
    public final int k;

    public Demo()
    {
        this.i = 30;
        this.k = 40;
        //this.j = 50;    //NA

    }

    public Demo(int a,int b)
    {
        this.i = a;
        this.k = b;
        //this.j = b;   NA

    }

    public void fun()
    {
        i++;
        //j++;  NA
        //k++;  NA

    }
}


class Final1
{
    public static void main(String arg[])
    {
        Demo obj = new Demo();
        obj.fun();
        System.out.println(obj.i);
        System.out.println(obj.j);
        System.out.println(obj.k);

        Demo obj2 = new Demo(20,30);
        obj2.fun();
        System.out.println(obj2.i);
        System.out.println(obj2.j);
        System.out.println(obj2.k);
    }



}