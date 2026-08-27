class Solution {
    public boolean isPalindrome(String s) {
        s= s.toLowerCase();
        s = s.trim();
        for (int i =0 ; i<s.length();i++){
            if (!Character.isLetterOrDigit(s.charAt(i))){
                s = s.substring(0,i) + s.substring(i+1);
                i--;
            }
        }

        int i =0,j=s.length()-1;
        while (i<j){
            if (s.charAt(i) != s.charAt(j)){
                return false;
            }
            i++;
            j--;
        }
        return true ; 
    }
}