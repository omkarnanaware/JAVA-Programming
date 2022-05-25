import java.lang.*;
import java.util.*;

class ChkNo
{
    public boolean DisplayB(int iNo)
    {
        int iCnt = 0;
        int iSum = 0;

        for(iCnt = (iNo/2); (iCnt > 0) && (iNo >= iSum ); iCnt--)
        {
            if(iNo % iCnt == 0)
            {
                iSum = iSum + iCnt;
            }

            if(iSum > iNo)
            {
                break; 
            }

        }

        if(iSum == iNo)
        {
            return true; 
        }
        else
        {
            return false;
        }

    }

}



class PerfectNo
{
    public static void main(String[] arg)
    {
        int iValue = 0;
        boolean bAns = false;

        Scanner scn = new Scanner(System.in);

        System.out.println("Enter no:");
        iValue = scn.nextInt();
        
        ChkNo chk = new ChkNo();
        
        bAns = chk.checkPerfect(iValue);

        if(bAns == true)
        {
            System.out.println("Perfect No");
        }

        else
        {
            System.out.println("Not a Perfect no");
        }



    }


}