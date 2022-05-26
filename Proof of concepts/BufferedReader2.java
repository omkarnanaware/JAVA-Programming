import java.lang.*;
import java.io.*;


class BufferedReader2
{
    public static void main(String arg[])
    {

        InputStreamReader iobj = new InputStreamReader(System.in);
        BufferedReader bobj =  new BufferedReader(iobj);
    try
    {
        System.out.println("Enter your name:");
        String name =bobj.readLine();
        System.out.println("Your name is :"+name);
    }
    catch(IOException obj)
    {
       System.out.println("Exception occurs ");
    }  
    
    finally
    {
       iobj = null;
       bobj = null;
    }
        
        

    }

}