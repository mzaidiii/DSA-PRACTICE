class Solution {
    public boolean isValid(String s) {
        if (s == null) return false ;
        Stack <Character> check = new Stack<>();

        for (int i =0 ; i < s.length() ; i++){
            if (s.charAt(i) == '{' || s.charAt(i) == '(' || s.charAt(i) == '['){
                check.push(s.charAt(i));
            } else {
                if( check.isEmpty()) return false ;
                char  c = check.peek();
                if ((c == '{' && s.charAt(i) == '}') ||
                    (c == '[' && s.charAt(i) == ']') ||
                    (c == '(' && s.charAt(i) == ')')){
                        check.pop();
                }else {
                    return false ;
                }
            }
        }

        return check.isEmpty(); 
    }
}