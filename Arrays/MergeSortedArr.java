class MergeSortedArr {
     
        public void merge(int[] nums1, int m, int[] nums2, int n) {
             
            for(int i = m; i<n-1; i++)
            {
              int k = 0;
         
              nums1[i] = nums2[k];
              k++;

            }
            for(int i = 0; i<nums1.length; i++)
            {
                System.out.println(nums1[i]);
            }

        }

    

    public static void main(String[] args) {
        int[] nums1 = {1,2,3,0,0,0};
        int m = 3;
        int[] nums2 = {2,5,6};
        int n = 3;
        MergeSortedArr mr = new MergeSortedArr();
        mr.merge(nums1,m,nums2,n);
       
        
    }
}

    