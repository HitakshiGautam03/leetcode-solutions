class Solution {

    public boolean possible(int[] nums, int k, int maxSum) {

        int subarrays = 1;
        int sum = 0;

        for (int i = 0; i < nums.length; i++) {

            if (sum + nums[i] > maxSum) {
                subarrays++;
                sum = nums[i];
            } else {
                sum += nums[i];
            }
        }

        return subarrays <= k;
    }

    public int splitArray(int[] nums, int k) {

        int low = Arrays.stream(nums).max().getAsInt();
        int high = Arrays.stream(nums).sum();

        int ans = high;

        while (low <= high) {

            int mid = low + (high - low) / 2;

            if (possible(nums, k, mid)) {
                ans = mid;
                high = mid - 1;
            } else {
                low = mid + 1;
            }
        }

        return ans;
    }
}