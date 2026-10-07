class Solution {
    public int numberOfSpecialChars(String word) {

        int[] first = new int[26];
        int[] last = new int[26];

        Arrays.fill(first, -1);
        Arrays.fill(last, -1);

        for (int i = 0; i < word.length(); i++) {
            char ch = word.charAt(i);

            if (Character.isLowerCase(ch)) {
                int index = ch - 'a';

                if (first[index] == -1) {
                    first[index] = i;
                }

                last[index] = i;
            }
        }

        int count = 0;

        for (int i = 0; i < word.length(); i++) {
            char ch = word.charAt(i);

            if (Character.isUpperCase(ch)) {
                int index = ch - 'A';

                if (first[index] != -1) {

                    if (last[index] < i) {
                        count++;
                    }
                    first[index] = -1;
                }
            }
        }

        return count;
    }
}