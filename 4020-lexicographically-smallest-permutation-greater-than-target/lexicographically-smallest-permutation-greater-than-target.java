class Solution {
    public String lexGreaterPermutation(String s, String target) {
        int n = s.length();
        if (n != target.length()) return "";

        int[] freq = new int[26];
        for (char c : s.toCharArray()) freq[c - 'a']++;

        char[] result = new char[n];
        int[][] freqStack = new int[n + 1][26];
        freqStack[0] = freq.clone();

        // Match target as a tight prefix for as long as possible
        int i = 0;
        for (; i < n; i++) {
            int idx = target.charAt(i) - 'a';
            if (freqStack[i][idx] > 0) {
                result[i] = target.charAt(i);
                freqStack[i + 1] = freqStack[i].clone();
                freqStack[i + 1][idx]--;
            } else {
                break;
            }
        }

        // Backtrack: find the rightmost position where we can place
        // a character strictly greater than target's, then fill the
        // rest ascending to keep the result as small as possible.
        int start = (i == n) ? n - 1 : i;
        for (int pos = start; pos >= 0; pos--) {
            int[] f = freqStack[pos].clone();
            int tc = target.charAt(pos) - 'a';
            int chosen = -1;
            for (int c = tc + 1; c < 26; c++) {
                if (f[c] > 0) { chosen = c; break; }
            }
            if (chosen != -1) {
                result[pos] = (char) ('a' + chosen);
                f[chosen]--;
                int p = pos + 1;
                for (int c = 0; c < 26; c++) {
                    while (f[c] > 0) {
                        result[p++] = (char) ('a' + c);
                        f[c]--;
                    }
                }
                return new String(result);
            }
        }
        return "";
    }
}