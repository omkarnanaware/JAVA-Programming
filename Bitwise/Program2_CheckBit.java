import java.lang.*;
import java.io.*;
class Bitwise
{

    public boolean checkBit(int iNo)
    {
       int Result = 0;
       int iMask = 1;       //
       int BitNo = 2;
       

        while((BitNo-1) > 0)
       {
            iMask =iMask * 2;

            BitNo--;
       }
       
       System.out.println(iMask);
        
       Result = iNo & iMask;

       if(Result == 0)
       {
        return false;
       }
       else
       {
        return true;
       }


    }



}

class Program2_CheckBit
{
    public static void main(String[] args) throws IOException
    {   
    

        InputStreamReader iobj = new InputStreamReader(System.in);
        BufferedReader bufobj = new BufferedReader(iobj);

        System.out.print("Enter no:");
        int iValue = Integer.parseInt(bufobj.readLine());


        Bitwise bobj = new Bitwise();
        boolean bRet = bobj.checkBit(iValue);

        if(bRet == true)
        {
            System.out.println("Bit is on");
        }
        else
        {
            System.out.println("Bit is off");
        }



    }


}