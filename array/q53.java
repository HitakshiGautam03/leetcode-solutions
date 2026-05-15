class Solution {
    public int maxSubArray(int[] nums) {
        int sum=0;
        int msum=nums[0];
        int n=nums.length;
        for(int num:nums){
            sum+=num;
            if(sum>msum){
                msum=sum;
            }
            if(sum<0){
                sum=0;
            }
        }
        return msum;
    }
}