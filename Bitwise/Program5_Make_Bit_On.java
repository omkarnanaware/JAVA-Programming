import java.lang.*;
import java.io.*;
class Bitwise
{

    public int onBit(int iNo)
    {
       int iResult = 0;
       int iMask = 0X0000008;
       
        iResult = iNo | iMask;

     return iResult;
    }



}

class Program5_Make_On_Bit
{
    public static void main(String[] args) throws IOException
    {   
    

        InputStreamReader iobj = new InputStreamReader(System.in);
        BufferedReader bufobj = new BufferedReader(iobj);

        System.out.print("Enter no:");
        int iValue = Integer.parseInt(bufobj.readLine());


        Bitwise bobj = new Bitwise();
        int iRet = bobj.onBit(iValue);

        System.out.println(iRet);


    }


}