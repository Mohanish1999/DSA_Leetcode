import java.util.*;

class Solution {
    public int maxFrequencyScore(int[] nums, long k) {

        Arrays.sort(nums);
        int n = nums.length;

        long[] prefix = new long[n];
        prefix[0] = nums[0];

        for (int i = 1; i < n; i++) {
            prefix[i] = prefix[i - 1] + nums[i];
        }

        int ans = 1;

        for (int l = 0; l < n; l++) {

            int low = l, high = n - 1;

            while (low <= high) {

                int mid = (low + high) / 2;

                int m = (l + mid) / 2; // median index

               long leftCost = (long) nums[m] * (m - l)
        - ((m > 0 ? prefix[m - 1] : 0) - (l > 0 ? prefix[l - 1] : 0));

                long rightCost = (prefix[mid] - prefix[m])
                        - (long) nums[m] * (mid - m);

                long cost = leftCost + rightCost;

                if (cost <= k) {
                    ans = Math.max(ans, mid - l + 1);
                    low = mid + 1;
                } else {
                    high = mid - 1;
                }
            }
        }

        return ans;
    }
}