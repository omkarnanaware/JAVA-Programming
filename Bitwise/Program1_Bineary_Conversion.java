import java.lang.*;
import java.io.*;
class Bitwise
{

    public void DisplayBinary(int iNo)
    {
        int iDigit = 0;

        while(iNo != 0)
        {
            iDigit = iNo % 2;
            System.out.print(iDigit);
            iNo = iNo / 2;
        }
        System.out.println();

    }



}

class Program1
{
    public static void main(String[] args) throws IOException
    {
        InputStreamReader iobj = new InputStreamReader(System.in);
        BufferedReader bufobj = new BufferedReader(iobj);

        System.out.println("Enter integer");
        int no = Integer.parseInt(bufobj.readLine());

        Bitwise bobj = new Bitwise();
        bobj.DisplayBinary(no);


    }



}