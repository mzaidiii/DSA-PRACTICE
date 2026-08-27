class Solution {
    public int[] twoSum(int[] numbers, int target) {
        int [] ans = new int [2];
        ans[0] = 0;
        ans[1] =0;
        int i =0 ;
        int j = numbers.length -1 ;
        while (i<j){
            if ((numbers[i]+numbers[j]) == target ){
                ans[0]=i+1;
                ans[1]=j+1;
                return ans;
            }
            if ((numbers[i]+numbers[j]) > target ){
                j--;
            }
            else{
                i++;
            }
        }
        return ans;
    }
}