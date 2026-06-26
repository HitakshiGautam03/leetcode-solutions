

//<---RECURSIVE CODE--->//
class Solution {
    public boolean checkValidString(String s) {
        return solve(s, 0, 0);
    }
    public boolean solve(String s, int ind, int cnt) {
        if (cnt < 0)
            return false;
        if (ind == s.length())
            return cnt == 0;
        if (s.charAt(ind) == '(')
            return solve(s, ind + 1, cnt + 1);
        if (s.charAt(ind) == ')')
            return solve(s, ind + 1, cnt - 1);
        return solve(s, ind + 1, cnt + 1)
            || solve(s, ind + 1, cnt - 1)
            || solve(s, ind + 1, cnt);
    }
}