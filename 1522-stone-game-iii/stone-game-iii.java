class Solution {
    public String stoneGameIII(int[] stoneValue) {
        int n = stoneValue.length;
        int[] dp = new int[4];
        int sum = 0;
        
        for (int i = n - 1; i >= 0; i--) {
            sum += stoneValue[i];
            int minv = Math.min(dp[(i + 1) % 4], Math.min(dp[(i + 2) % 4], dp[(i + 3) % 4]));
            dp[i % 4] = sum - minv;
        }
        
        if (dp[0] * 2 == sum) {
            return "Tie";
        }
        return dp[0] * 2 > sum ? "Alice" : "Bob";
    }
}
