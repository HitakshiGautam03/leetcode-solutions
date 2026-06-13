class Solution {
    public int[] nextGreaterElement(int[] nums1, int[] nums2) {
        int n=nums1.length;
        int m=nums2.length;
        Stack<Integer> stack = new Stack<>();
        int[] nge=new int[m];
        for(int i=m-1;i>=0;i--){
            while(!stack.isEmpty()&&stack.peek()<=nums2[i]){
                stack.pop();
            }
            if(stack.isEmpty()) nge[i]=-1;
            else nge[i]=stack.peek();
            stack.push(nums2[i]);
        }
        HashMap<Integer,Integer> map = new HashMap<>();
        for(int i = 0; i < m; i++){
            map.put(nums2[i], nge[i]);
        }
        int[] ans = new int[n];
        for(int i=0;i<n;i++){
            ans[i] = map.get(nums1[i]);
        }
        return ans;
    }
}