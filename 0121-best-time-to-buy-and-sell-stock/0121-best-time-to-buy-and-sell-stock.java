class Solution {
    public int maxProfit(int[] prices) {
        int min = prices[0] ;
        int max =0 ;
        int profit =0;
        for (int i =0 ; i< prices.length -1 ; i++){
            if (prices[i] < min ){
                min = prices[i];
            }
            if (prices[i+1] > min ){
                max  = prices[i+1] - min ;
            }
            if (max > profit){
                profit = max ;
            }

        }

        return profit ; 
    }
}