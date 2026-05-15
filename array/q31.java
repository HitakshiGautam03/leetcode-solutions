class Solution {
    public void nextPermutation(int[] nums) {
        int n = nums.length;
        int index = -1;
        for(int i = n - 2; i >= 0; i--) {//find smallest element from right
            if(nums[i] < nums[i + 1]) {
                index = i;
                break;
            }
        }
        if(index == -1) {//if array in descending order
            reverse(nums, 0, n - 1);
            return;
        }
        for(int j = n - 1; j > index; j--) {
            if(nums[j] > nums[index]) {

                int temp = nums[j];
                nums[j] = nums[index];
                nums[index] = temp;

                break;
            }
        }
        reverse(nums, index + 1, n - 1);
    }
    public void reverse(int[] nums, int start, int end) {
        while(start < end) {
            int temp = nums[start];
            nums[start] = nums[end];
            nums[end] = temp;
            start++;
            end--;
        }
    }
}