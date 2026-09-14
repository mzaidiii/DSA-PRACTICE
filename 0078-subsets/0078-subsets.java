class Solution {
    public List<List<Integer>> subsets(int[] nums) {
        List<List<Integer>> ans = new ArrayList<>();
        check (0,new ArrayList<>() , nums, ans);
        return ans ; 
    }

    private void check (int i , ArrayList temp , int[] nums , List<List<Integer>> ans){

        if (i == nums.length){
            ans.add(new ArrayList<>(temp));
            return ;
        }

        temp.add(nums[i]);
        check(i+1 , temp , nums, ans);

        temp.remove(temp.size() -1 );

        check(i+1 , temp , nums,ans);
    }
}