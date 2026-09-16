class Solution {
    public List<String> generateParenthesis(int n) {
        List<String> ans = new ArrayList<>();
        make("" , ans , n ,0,0);
        return ans ;
    }

    private void make (String s , List<String> ans , int n , int open , int close ){
        if(open == n && close == n){
            ans.add(s);
            return ;
        }

        if (open <n){
            make(s+"(" , ans , n , open+1 ,close);
        }
        if(close < open){
            make(s+")" , ans , n , open , close+1);
        }
    }
}