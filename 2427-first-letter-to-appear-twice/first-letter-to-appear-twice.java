class Solution {
    public char repeatedCharacter(String s) {
      HashSet<Character> se = new HashSet<>();

        for(int i = 0 ; i < s.length() ; i++){
            char ch = s.charAt(i);
            if(se.contains(ch)){
                return ch ;
            }
            se.add(ch);
        }
        return '\0';
    }
}