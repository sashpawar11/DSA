class Solution {
    int rowWithMax1s(int arr[][], int n, int m) {
        // code here
        
        int row=0,count=0,max=0,rowcount=0;
        for(int i=0; i<n; i++)
        {
            for(int j=0; j<m; j++)
            {
                if(arr[i][j] == 1)
                {
                    count++;
                }
            }
                
                rowcount = count;
                count = 0;
                if(rowcount > max)
                {
                    max = rowcount;
                    row = i;
                }
        
        }
            
        if(max == 0)
            return -1;
        else
            return row;
    }
}