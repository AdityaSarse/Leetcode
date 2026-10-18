import java.util.*;

class Solution {
    private static final int MOD = 1_000_000_007;
    private long[][] comb;

    public int numOfWays(int[] nums) {
        int n = nums.length;
        comb = new long[n + 1][n + 1];
        for (int i = 0; i <= n; i++) {
            comb[i][0] = 1;
            for (int j = 1; j <= i; j++) {
                comb[i][j] = (comb[i - 1][j - 1] + comb[i - 1][j]) % MOD;
            }
        }

        List<Integer> list = new ArrayList<>();
        for (int x : nums) list.add(x);

        return (int) ((count(list) - 1 + MOD) % MOD);
    }

    private long count(List<Integer> arr) {
        int size = arr.size();
        if (size <= 2) return 1;

        int root = arr.get(0);
        List<Integer> left = new ArrayList<>();
        List<Integer> right = new ArrayList<>();
        for (int i = 1; i < size; i++) {
            if (arr.get(i) < root) left.add(arr.get(i));
            else right.add(arr.get(i));
        }

        long ways = comb[size - 1][left.size()];
        ways = ways * count(left) % MOD;
        ways = ways * count(right) % MOD;
        return ways;
    }
}