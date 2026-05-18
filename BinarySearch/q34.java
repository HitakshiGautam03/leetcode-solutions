class Solution {

    public int[] searchRange(int[] nums, int target) {

        int first = firstOcc(nums, target);
        int last = lastOcc(nums, target);

        return new int[]{first, last};
    }
    //to find it on the left side
    public int firstOcc(int[] nums, int target) {

        int low = 0;
        int high = nums.length - 1;
        int ans = -1;

        while(low <= high) {

            int mid = (low + high) / 2;

            if(nums[mid] == target) {

                ans = mid;
                high = mid - 1;
            }

            else if(nums[mid] < target) {
                low = mid + 1;
            }

            else {
                high = mid - 1;
            }
        }

        return ans;
    }
    //to find it on the right side
    public int lastOcc(int[] nums, int target) {

        int low = 0;
        int high = nums.length - 1;
        int ans = -1;

        while(low <= high) {

            int mid = (low + high) / 2;

            if(nums[mid] == target) {

                ans = mid;
                low = mid + 1; 
            }

            else if(nums[mid] < target) {
                low = mid + 1;
            }

            else {
                high = mid - 1;
            }
        }

        return ans;
    }
}