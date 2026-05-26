class Solution {
    public int maxDepth(String s) {
      int n=s.length();
      int count=0;
      int maxdepth=0;
      for(int i=0;i<n;i++){
        if(s.charAt(i)=='(') {
            count++;
            maxdepth=Math.max(maxdepth,count);
        }
        else if(s.charAt(i)==')') count--;
      } 
      return maxdepth; 
    }
}