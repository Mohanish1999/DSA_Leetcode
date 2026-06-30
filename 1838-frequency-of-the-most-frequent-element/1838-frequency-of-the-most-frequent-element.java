class Solution {
    public int maxFrequency(int[] nums, int k) {
        Arrays.sort(nums);
        long sum = 0;
        int left = 0;
        int maxFreq = 1;

        for (int i = 0; i < nums.length; i++) {
            sum += nums[i];
            while ((long) nums[i] * (i - left + 1) - sum > k) {
                sum -= nums[left];
                left++;
            }
            maxFreq = Math.max(maxFreq, i - left + 1);
        }
        return maxFreq;
    }
}