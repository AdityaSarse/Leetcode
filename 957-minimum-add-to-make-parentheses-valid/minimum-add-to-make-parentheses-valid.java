class Solution {
    public int minAddToMakeValid(String s) {
        int count = 0 , add = 0;

        for (int i = 0; i < s.length(); i++) {
            char ch = s.charAt(i);

            if (ch == '(') {
                count++;
            } 
            else {
                count--;

                if (count < 0) {
                    add++;
                    count = 0;
                }
            }
        }

        return add + count;
    }
}