import java.lang.*;
import java.util.*;


class LL
{
    public static void main(String [] args)
    {
        LinkedList <String> obj = new LinkedList<String>();
        obj.add("January");
        obj.add("Febuary");
        obj.add("March");
        obj.add("April");
        obj.add("May");
        obj.add(2,"new");

        System.out.println("Size is :"+obj.size());


        System.out.println("Arraylist contians :"+obj);

        obj.remove("May");
        obj.remove(4);

        System.out.println("Size is :"+obj.size());

        System.out.println("ArrayList contians:"+obj);

        //iteration over the Arraylist

        for(int i=0;i < obj.size(); i++)
        {
            System.out.println(obj.get(i));
        }

        // Element present 
        // 1

        if(obj.contains("April"))
        {
            System.out.println("Element is there");
        }

        //2
        String str;
        int cnt = 0;
        for(int i=0;i < obj.size();i++)
        {   
            str = obj.get(i);
            if(str.equals("Jaunary"))
            {
                System.out.println("January present");
            }
        }

        if(obj.contains("April"))
        {
            System.out.println("Element is there");
        }

        //////////////////////////////

        int ret = obj.indexOf("April");
        System.out.println("Element is at:"+ret);

        System.out.println("Element at index 3 is:"+obj.get(3));


        obj.clear();
        System.out.println("Update list is:"+obj);

        
    }


}