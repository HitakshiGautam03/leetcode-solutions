class Solution {
    public int searchInsert(int[] nums, int target) {
        int n=nums.length;
        int low=0;
        int high=n-1;
        int ans=0;
        while(low<=high){
            int mid=(low+high)/2;
            if(nums[mid]==target) return mid;
            if(nums[mid]>target){
                ans=mid;
                high=mid-1;
            }
            else{
                ans=low+1;
                low=mid+1;
            }
        }
        return ans;
    }
}