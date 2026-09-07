class Solution {
    public int distinctSubseqII(String s) {
        int MOD = 1_000_000_007;
        long[] dp = new long[26];
        
        for (int i = 0; i < s.length(); i++) {
            int charIndex = s.charAt(i) - 'a';
            long currentSum = 0;
            
            for (long count : dp) {
                currentSum = (currentSum + count) % MOD;
            }
            
            dp[charIndex] = (currentSum + 1) % MOD;
        }
        
        long totalSubsequences = 0;
        for (long count : dp) {
            totalSubsequences = (totalSubsequences + count) % MOD;
        }
        
        return (int) totalSubsequences;
    }
}
