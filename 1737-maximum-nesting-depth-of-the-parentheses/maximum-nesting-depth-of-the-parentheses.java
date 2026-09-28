class Solution {
    public int maxDepth(String s) {
        int max = 0 ;
        int current = 0 ;
        for(int i = 0 ; i < s.length() ;i++){
            char ch = s.charAt(i);
            if(ch=='('){
                current ++;
            }
            if(ch==')'){
                current--;
            }
            max=Math.max(max,current);
        }
        return max;
    }
}