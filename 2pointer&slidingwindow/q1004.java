class Solution {
    public int longestOnes(int[] nums, int k) {
        int n=nums.length;
        int count=0;
        int l=0;
        int r=0;
        int maxlen=0;
        while(r < n){
            if(nums[r] == 0) count++;
            while(count > k){
                if(nums[l] == 0) count--;
                l++;
            }
            maxlen = Math.max(maxlen, r - l + 1);
            r++;
        }
        return maxlen;
    }
}