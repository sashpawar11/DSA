public class RotateArray {

    public void rotateArr(int arr[], int d, int n)
    {
        //Function to rotate an array by d elements in counter-clockwise direction.
        int p = 1;
        while(p<= d)
        {
            int last = arr[0];
            for(int i=0; i<n-1; i++)
            {

                arr[i] = arr[i+1];
            }
            arr[n-1] = last;
            p++;
        }
        for(int x: arr)
        {
            System.out.print(x + " ");
        }
    }


    public static void main(String[] args) {
        
        int[] arr = { 1 , 2 , 3 , 4 , 5};
        int d = 2;
        RotateArray lr = new RotateArray();
        lr.rotateArr(arr,d, arr.length);
    }
    
}
