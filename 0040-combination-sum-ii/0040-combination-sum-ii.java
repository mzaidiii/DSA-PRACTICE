class Solution {
    public List<List<Integer>> combinationSum2(int[] candidates, int target) {
        List<List<Integer>> ans = new ArrayList<>();
        Arrays.sort(candidates);
        sum(0, 0, new ArrayList<>(), target, candidates, ans);
        return ans;
    }

    private void sum(int i, int sum, ArrayList<Integer> temp,
            int target, int[] nums, List<List<Integer>> ans) {

        if (sum == target) {
            ans.add(new ArrayList<>(temp));
            return;
        }

        if (i == nums.length || sum > target) {
            return;
        }

        for (int j = i; j < nums.length; j++) {

            if (j > i && nums[j] == nums[j - 1]) {
                continue;
            }

            if (sum + nums[j] > target) {
                break;
            }

            temp.add(nums[j]);

            sum(j + 1, sum + nums[j], temp, target, nums, ans);

            temp.remove(temp.size() - 1);
        }
    }
}
