class Solution {
    public List<List<Integer>> combinationSum(int[] candidates, int target) {
        List<List<Integer>> list = new ArrayList<>();
        List<Integer> current = new ArrayList<>();
        Backtrack(0,target,current,list,candidates);
        return list;
    }
    public void Backtrack(int index,int target,List<Integer> current,List<List<Integer>> list,int[] candidates){
        if(target==0){
            list.add(new ArrayList<>(current));
            return ;
        }
        if (index == candidates.length || target < 0) {
            return;
        }
            current.add(candidates[index]);
            Backtrack(index,target-candidates[index],current,list,candidates);
            current.remove(current.size()-1);
            Backtrack(index + 1, target, current, list,candidates);
    }
}