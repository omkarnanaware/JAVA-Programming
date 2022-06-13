import java.lang.*;
import java.io.*;



//  0   0   0   1   1   1   1   0   iNo
                                            // ^
//  0   0   0   0   0   0   0   0   iMask
//-----------------------------------

//  0   0   0   0   0   0   0   0   

class Bitwise
{

    public int toggleBit(int iNo,int ipos)
    {
        if(ipos <= 0 && ipos > 32)
        {
            System.out.println("Invalid position");
            return -1;
        }


        int iResult = 0;
        int iMask = 0X00000001;          //Toggle 4th and 7th Bit
       
        iMask = iMask << (ipos-1);

        iResult = iNo ^ iMask;

     return iResult;
    }



}

class Program7_Toggle_Bit_Shift_Operator
{
    public static void main(String[] args) throws IOException
    {   
    

        InputStreamReader iobj = new InputStreamReader(System.in);
        BufferedReader bufobj = new BufferedReader(iobj);

        System.out.print("Enter no:");
        int iValue = Integer.parseInt(bufobj.readLine());
        System.out.print("Enter pos:");
        int iValue2 = Integer.parseInt(bufobj.readLine());

        Bitwise bobj = new Bitwise();
        int iRet = bobj.toggleBit(iValue,iValue2);

        System.out.println(iRet);


    }


}