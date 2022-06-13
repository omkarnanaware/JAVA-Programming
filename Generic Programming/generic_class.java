/*
 * Auther  : Omkar Rajendra Nanaware
 * Topic : Generic Programming in Java
 * Date and Time : jun 13 01:39
 * Language : Java
 */



class Arithmatic <T>
{

    public T Addition(T No1, T No2)
    {
        if((No1 instanceof Integer) && (No2 instanceof Integer))
        {
            return (T)(Integer)((Integer)No1 +(Integer) No2);
        }

        else if((No1 instanceof Float) && (No2 instanceof Float))
        {
            return (T)(Float)((float)No1 + (Float)No2);
        }

        else if((No1 instanceof Double) && (No2 instanceof Double))
        {
            return (T)(Double)((Double)No1 + (Double)No2);
        }

        else
        {
            return null;
        }
    }

}


public class generic_class
{
    public static void main(String[] args) 
    {   
        Integer iret = 0;

        Arithmatic <Integer> iobj = new Arithmatic<Integer>();
        iret = iobj.Addition(10, 20);
        System.out.println(iret);

        Float fret = 0.0F;

        Arithmatic <Float> fobj = new Arithmatic<Float>();
        fret = fobj.Addition(10.0F, 20.0F);
        System.out.println(fret);
        
    }


}

