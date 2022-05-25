/*
Subarray with given sum 

Given an unsorted array A of size N that contains only
non-negative integers, find a continuous sub-array
which adds to a given number S.

In case of multiple subarrays, return the subarray which
comes first on moving from left to right.



Example 1:

Input:
N = 5, S = 12
A[] = {1,2,3,7,5}
Output: 2 4
Explanation: The sum of elements 
from 2nd position to 4th position 
is 12.
 

Example 2:

Input:
N = 10, S = 15
A[] = {1,2,3,4,5,6,7,8,9,10}
Output: 1 5
Explanation: The sum of elements 
from 1st position to 5th position
is 


Your Task:
You don't need to read input or print anything. The task is to complete the function subarraySum() which takes arr, N and S as input parameters and returns an arraylist containing the starting and ending positions of the first such occurring subarray from the left where sum equals to S. The two indexes in the array should be according to 1-based indexing. If no such subarray is found, return an array consisting only one element that is -1.

 

Expected Time Complexity: O(N)
Expected Auxiliary Space: O(1)

 

Constraints:
1 <= N <= 105
1 <= Ai <= 109


*/



class Solution
{
    //Function to find a continuous sub-array which adds up to a given number.
    static ArrayList<Integer> subarraySum(int[] arr, int n, int s) 
    {
        
        int iCnto = 0, iCnti =  0;
        int iSum = 0;
        int iSindx = 0; int iEindx = 0;
        
        ArrayList<Integer> a1 = new ArrayList<Integer>();
        
        
        for(iCnto = 0; iCnto < arr.length; iCnto++)
        {
            
            iSindx = iCnto;
            iSum = 0;
            
        
            for(iCnti = iCnto; iCnti < arr.length; iCnti++)    
            {
                
                iEindx = iCnti;
                
                iSum = iSum + arr[iCnti];
                
                if(iSum == s)
                {
                   break;
                }
        
                if(iSum > s)
                {
                    break;
                }
                
            }
            
            if(iSum == s)
            {
                a1.add(iCnto + 1);
                a1.add(iCnti + 1);
                break;
            }
            
    
        
        }
    if(iSum != s)
    {
        a1.add(-1);
    }
        
       
    return a1;
        
    }
    
    
}