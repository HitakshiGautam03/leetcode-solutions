class Solution {
    public boolean rotateString(String s, String goal) {
        int n=s.length();
        if(s.length()!=goal.length()) return false;
        for(int i=0;i<n;i++){
            char ch=s.charAt(0);
            String t=s.substring(1,n);
            t=t+ch;
            s=t;
            if(s.equals(goal)) return true;
        }
        return false;
    }
}