import java.lang.*;

/**
 * MathsMethod

 */
interface MathsMethod 
{
    int RetAdditon();
    

    
}


class Additon implements MathsMethod
{
    private int iA;
    private int iB;
    private int iSum;

    public Additon(int iA, int iB)
    {
        this.iA = iA;
        this.iB = iB;

    }

    public int RetAdditon()
    {
        iSum = iA + iB;
        return iSum;
    }



}




class Command_Line_Arguments
{
    public static void main(String [] args)
    {
        int iValue1 = 0;
        int iValue2 = 0;

        iValue1 = Integer.parseInt(args[0]);
        iValue2 = Integer.parseInt(args[1]);

        Additon aobj = new Additon(iValue1,iValue2);
        System.out.println(aobj.RetAdditon());

        
    }
}