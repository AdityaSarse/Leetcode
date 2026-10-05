class Solution {
    public int scoreOfParentheses(String s) {
        int count = 0 , res = 0 ;
        
        for(int i = 0 ; i < s.length() ; i++){
            char ch = s.charAt(i);

            if(ch == '('){
                count++;
            }
            else{
                count--;
                if (s.charAt(i - 1) == '(') {
                    res += 1 << count ;
                }
            }
        }
        return res ;
    }
}