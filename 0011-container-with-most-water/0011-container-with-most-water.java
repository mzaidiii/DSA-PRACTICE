class Solution {
    public int maxArea(int[] height) {
        int i =0 , j = height.length -1 ;
        int len , wid ;
        int main_area =0 ;
        while (i<j){
            if (height[i] > height[j]){
                len = height[j];
            }else {
                len = height[i];
            }
            wid = j-i;
            int area = len *wid;
            if (area > main_area){
                main_area = area;
            }
            if (height[i] < height[j]){
                i++;
            }else{
                j--;
            }
        }
        return main_area;
    }
}