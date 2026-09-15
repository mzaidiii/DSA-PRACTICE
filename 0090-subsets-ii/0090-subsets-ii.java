class Solution {
    public List<List<Integer>> subsetsWithDup(int[] nums) {
        List<List<Integer>> result = new ArrayList<>();
        Arrays.sort(nums);
        int pos =0 ;
        helper(pos , new ArrayList<>() , nums , result);
        return result ;
    }
    public static void helper (int pos , List<Integer> temp , int[] nums, List<List<Integer>> result ){
        if (pos == nums.length){
            result.add(new ArrayList(temp));
            return ;
        }
        temp.add(nums[pos]);
        helper(pos+1 , temp , nums, result);
        temp.remove(temp.size() -1);
        while(pos < nums.length -1 && nums[pos] == nums[pos+1]) {
            pos++;
        }
        helper (pos+1 , temp,nums,result);

    }
    }