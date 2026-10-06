class Solution {
    public int minAddToMakeValid(String s) {
        int count = 0;
        int additions = 0;

        for (int i = 0; i < s.length(); i++) {
            char ch = s.charAt(i);

            if (ch == '(') {
                count++;
            } 
            else {
                count--;

                if (count < 0) {
                    additions++;
                    count = 0;
                }
            }
        }

        return additions + count;
    }
}