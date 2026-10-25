class Solution {
    public int strStr(String haystack, String needle) {
        // Edge case: empty needle
        if (needle.isEmpty()) {
            return 0;
        }

        int n = haystack.length();
        int m = needle.length();

        // Traverse haystack
        for (int i = 0; i <= n - m; i++) {
            // Compare substring of length m
            if (haystack.substring(i, i + m).equals(needle)) {
                return i;
            }
        }

        return -1; // Not found
    }
}