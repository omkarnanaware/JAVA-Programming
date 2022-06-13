import java.lang.*;
import java.lang.reflect.Array;





class Sort
{
    public static int[] sortArray(int iarr[])
    {
        int iLength = iarr.length;

        for(int i = 1; i <= (iLength -1);i++)
        {
            for(int j = 0; j <= (iLength - i - 1 ); j++ )
            {
                if(iarr[j] > iarr[j+1])
                {
                    int temp = 0;

                    temp=iarr[j];

                    iarr[j] = iarr[j+1];

                    iarr[j+1]=temp;
                }
            }


        }    
        return iarr;
    }



}

class Print
{
    public static void printArray(int iarr[])
    {
        for(int a:iarr)
        {
            System.out.println(a);
        }
    }

}


class Bubble_Sort
{

    public static void main(String[] args) {


       int iarr[]= {50,40,30,20,10};
        
        iarr = Sort.sortArray(iarr) ;

        Print.printArray(iarr);
        

    }


}
