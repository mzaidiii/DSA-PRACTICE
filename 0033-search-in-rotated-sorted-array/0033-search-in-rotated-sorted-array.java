class Solution {
    public int search(int[] nums, int target) {
        int ans = -1 ;
        int i = 0;
        int j = nums.length -1 ;
        if (nums[j] > target){
            for (int k = j ; k >= 0 ; k--){
                if (nums[k] == target){
                    ans =k ;
                    return ans;
                }
            }
        } else {
            for (int k = i ; k < nums.length ; k++){
                if (nums[k] == target){
                    ans =k ;
                    return ans ;
                }
            }
        }

        return ans ; 
    }
}