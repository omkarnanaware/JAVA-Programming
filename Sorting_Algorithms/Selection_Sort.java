public class Selection_Sort
{

    public static int[] selection(int[] sort_Array)
    {
        int iCnt = 0;
        int iLast = (sort_Array.length -1);
        int iLength = sort_Array.length;
        int iMaxIndx = 0;

        for(int i=0 ;i < iLength-1 ; i++)
        {
            iLast = (sort_Array.length) -i -1;

            int max = sort_Array[0];
        
            for(int j = 0; j <= iLast;j++ )
            {
                if(sort_Array[j] > max)
                {
                    max = sort_Array[j];
                    iMaxIndx = j;
                }

            }
            int temp = sort_Array[iMaxIndx];

            sort_Array[iMaxIndx] = sort_Array[iLast];

            sort_Array[iLast] = temp;


        }
        return sort_Array;

    }

        public static void main(String args[])
        {

            int[] Arr  = {20,30,90,40,60};

            Arr = selection(Arr);

            for(int iCnt = 0; iCnt < Arr.length; iCnt++)
            {
                System.out.println(Arr[iCnt]);
            }

        }



}






