import java.util.ArrayList;

class MoveZeroes {
    public static void moveZeroes(int[] nums) {
        ArrayList<Integer> result = new ArrayList<Integer>();
        int zero_count=0;
        for(int i=0; i<nums.length; i++)
        {
            if(nums[i] == 0)
            {
                zero_count++;
            }
            else
            {
                result.add(nums[i]);
            }
        }
        while(zero_count > 0)
        {
            result.add(0);
            zero_count--;
        }
        for(int i=0; i<nums.length;i++)
        {
            nums[i] = result.get(i);
        }
        for(int i=0; i<nums.length;i++)
        {
            System.out.print(nums[i] + " ");
        }
        
        
    }
    public static void main(String[] args) {
        int[] nums = {0,1,0,3,12};
        moveZeroes(nums);
    }
}
     