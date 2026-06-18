class Solution {
    public int largestRectangleArea(int[] heights) {
        int n=heights.length;
        int[] nse=findnse(heights);
        int[] pse=findpse(heights);
        int max=0;
        for(int i=0;i<n;i++){
            max=Math.max(max,heights[i]*(nse[i]-pse[i]-1));
        }
        return max;
    }
    int[] findpse(int[] heights){
        int n=heights.length;
        Stack<Integer> st=new Stack<>();
        int[] pse=new int[n];
        for (int i = 0; i < n; i++) {
            while (!st.isEmpty() && heights[st.peek()] > heights[i]) {
                st.pop();
            }
            pse[i] = st.isEmpty() ? -1 : st.peek();
            st.push(i);
        }
        return pse;
    }
    int[] findnse(int[] heights){
        int n=heights.length;
        Stack<Integer> st=new Stack<>();
        int[] nse=new int[n];
        for (int i = n - 1; i >= 0; i--) {
            while (!st.isEmpty() && heights[st.peek()] >= heights[i]) {
                st.pop();
            }
            nse[i] = st.isEmpty() ? n : st.peek();
            st.push(i);
        }
        return nse;
    }
}