import java.util.ArrayList;

class Solution
{
    //Function to find a continuous sub-array which adds up to a given number.
    static ArrayList<Integer> subarraySum(int[] arr, int n, int s) 
    {
        // Your code here
        // to store result
        ArrayList<Integer> Result = new ArrayList<Integer>();
        
        int sum = 0; // sum counter

        for(int i=0; i< n; i++)
        {
            sum = arr[i];  // outer loop to keep track of 1 element
            
            for(int j=i+1; j<= n; j++)  // inner loop to iterate over subarrays
            {
                if( sum == s)
                {
                    int x = j-1;
                    Result.add(i+1);  // increment index positions i and x by 1 (since it starts from 0)
                    Result.add(x+1);
                    return Result;
                    
                }
                if( sum > s || j == n) // if calculated sum crosses given sum or inner loop reaches end of array, break
                {
                    break;
                }
                
                sum = sum + arr[j]; // add inner loop elements to sum with the first stored element.
            }
        }
        Result.add(-1); // if not found, add -1 to array result.
        return Result;
    }
}