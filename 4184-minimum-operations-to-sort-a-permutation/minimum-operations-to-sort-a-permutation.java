class Solution {
    public int minOperations(int[] nums) {
        int n = nums.length;
        if (n == 1) return 0;

        int z = 0;
        boolean inc = true, dec = true;

        for (int i = 0; i < n; i++) {
            if (nums[i] == 0) z = i;
            int next = nums[(i + 1) % n];
            if (next != (nums[i] + 1) % n) inc = false;
            if (next != (nums[i] - 1 + n) % n) dec = false;
        }

        int ans = Integer.MAX_VALUE;
        if (inc) ans = Math.min(z, n - z + 2);
        if (dec) ans = Math.min(ans, Math.min(z + 2, n - z));

        return ans == Integer.MAX_VALUE ? -1 : ans;
    }
}