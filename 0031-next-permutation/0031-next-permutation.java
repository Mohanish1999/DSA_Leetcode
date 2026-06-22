class Solution {
    public void reverse(int[] nums, int start, int end) {
    while (start < end) {
        int temp = nums[start];
        nums[start] = nums[end];
        nums[end] = temp;

        start++;
        end--;
    }
    }
    public void swap(int[] nums, int i, int j) {
    int temp = nums[i];
    nums[i] = nums[j];
    nums[j] = temp;
}
    public void nextPermutation(int[] nums) {
        int piv = -1;
        int n = nums.length;
        for(int i = n-2; i>=0; i--){
            if(nums[i]<nums[i+1]){
                piv = i;
                break;
            }
        }
        if(piv==-1){
            reverse(nums, 0, nums.length - 1);
            return;
        }
       for (int i = n - 1; i > piv; i--) {
            if (nums[i] > nums[piv]) {
                swap(nums, i, piv);
                break;
            }
        }
        int i = piv + 1;
        int j = n - 1;
        while(i<=j){
            swap(nums, i, j);
            i++;
            j--;
        }
    }
}