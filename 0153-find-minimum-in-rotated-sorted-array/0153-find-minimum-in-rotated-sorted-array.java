class Solution {
    public int findMin(int[] nums) {
        int i =0 ; 
        int j = nums.length -1;
        int min ;
        if (nums[i] > nums[j]){
            min = nums[j];
            for (int k = j ; k >=0 ;k--){
                if (nums[k] < min){
                    min = nums[k];
                }
            }
        }
        else {
            min = nums[i];
            for (int k = i ; k < nums.length ;k++){
                if (nums[k] < min){
                    min = nums[k];
                }
            }
        }

        return min ;

    }
}