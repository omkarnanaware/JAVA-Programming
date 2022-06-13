import java.lang.*;
import java.io.*;



//  0   0   0   1   1   1   1   0   iNo
                                            // ^
//  0   0   0   0   0   0   0   0   iMask
//-----------------------------------

//  0   0   0   0   0   0   0   0   

class Bitwise
{

    public int toggleBit(int iNo)
    {
       int iResult = 0;
       int iMask = 0X00000048;          //Toggle 4th and 7th Bit
       
        iResult = iNo ^ iMask;

     return iResult;
    }



}

class Program6_Toggle_Bit
{
    public static void main(String[] args) throws IOException
    {   
    

        InputStreamReader iobj = new InputStreamReader(System.in);
        BufferedReader bufobj = new BufferedReader(iobj);

        System.out.print("Enter no:");
        int iValue = Integer.parseInt(bufobj.readLine());


        Bitwise bobj = new Bitwise();
        int iRet = bobj.toggleBit(iValue);

        System.out.println(iRet);


    }


}