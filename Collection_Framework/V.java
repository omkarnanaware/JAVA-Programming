import java.lang.*;
import java.util.*;


class V
{
    public static void main(String[] args)
    {
        Vector <Integer> obj = new Vector<Integer>();

        obj.add(11);
        obj.add(21);
        obj.add(51);
        obj.add(101);
        obj.add(111);
        obj.add(111); //allows duplicate

        //////////////////////////////////
        System.out.println("Capacity of vector:"+obj.capacity());
        System.out.println("Size of the vector:"+obj.size());
        //////////////////////////////////


        int i = 0;
        for(i = 0; i < obj.size(); i++)
        {
            System.out.println(obj.get(i));
        }


        int no = 0,cnt = 0;

        for(i=0;i < obj.size();i++)
        {
            no = obj.get(i);
            if((no % 2 ) == 0)
            {
                cnt++;
            }
        }
        System.out.println("Number of even no in vector are:"+cnt);

        Iterator iobj = obj.iterator();
        while(iobj.hasNext())
        {
            System.out.println(iobj.next());
        }

        obj.clear();


    }



}