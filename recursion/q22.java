class Solution {
    public List<String> generateParenthesis(int n) {
        List<String> xlist = new ArrayList<>();
        int open=0;
        int close=0;
        backtrack("",open,close,n,xlist);
        return xlist;
    }
    public void backtrack(String current,int open,int close,int n,List<String> xlist){
        if(open==n&&close==n){
            xlist.add(current);
            return ;
        }
        if(open<n){
            backtrack(current+"(",open+1,close,n,xlist);
        }
        if(close<open){
            backtrack(current+")",open,close+1,n,xlist);
        }
    }
}