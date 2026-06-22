class Solution {
    public int removeDuplicates(int[] nums)
     {
        int n=0;
        for(int i=0;i<nums.length;i++)
        {
            if(n<2 || nums[i]>nums[n-2])
            {
                nums[n++]=nums[i];
            }
        }
        return n;
    }
}