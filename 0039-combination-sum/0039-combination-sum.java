class Solution {
    public List<List<Integer>> combinationSum(int[] candidates, int target) {
        List<List<Integer>> result = new ArrayList<>();
        combine (0,target,0,new ArrayList<>() , candidates,result);
        return result ;
    }
    static void combine (int pos , int target , int sum , ArrayList temp , int[] candidates,List<List<Integer>> result){
         if (sum == target) {
            result.add(new ArrayList<>(temp));
            return;
        }

        if (sum > target || pos == candidates.length) {
            return;
        }

        temp.add(candidates[pos]);
        combine(pos, target, sum + candidates[pos], temp, candidates, result);

        temp.remove(temp.size() - 1);
        combine(pos + 1, target, sum , temp, candidates, result);
    }
}