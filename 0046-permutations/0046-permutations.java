class Solution {
    public List<List<Integer>> permute(int[] nums) {
        List<List<Integer>> result = new ArrayList<>();
        helper(0, nums, result);
        return result;
    }

    public static void helper(int pos, int[] nums, List<List<Integer>> result) {
        if (pos == nums.length) {
            List<Integer> list = new ArrayList<>();
            for (int n : nums) list.add(n);
            result.add(list);
            return;
        }

        for (int i = pos; i < nums.length; i++) {
            swap(nums, pos, i);
            helper(pos + 1, nums, result);
            swap(nums, pos, i); 
        }
    }

    static void swap(int[] nums, int i, int j) {
        int temp = nums[i];
        nums[i] = nums[j];
        nums[j] = temp;
    }
}