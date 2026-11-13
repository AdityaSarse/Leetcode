class Solution {
    public long countNonDecreasingSubarrays(int[] nums, int k) {
        int n = nums.length;
        long[] pre = new long[n + 1];
        for (int i = 0; i < n; i++) pre[i + 1] = pre[i] + nums[i];

        Deque<Integer> dq = new ArrayDeque<>();
        long cost = 0, ans = 0;
        int r = n - 1;

        for (int l = n - 1; l >= 0; l--) {
            while (!dq.isEmpty() && nums[dq.peekFirst()] <= nums[l]) {
                int p = dq.pollFirst();
                int end = dq.isEmpty() ? r : dq.peekFirst() - 1;
                cost -= (long) nums[p] * (end - p + 1) - (pre[end + 1] - pre[p]);
            }
            int end = dq.isEmpty() ? r : dq.peekFirst() - 1;
            cost += (long) nums[l] * (end - l + 1) - (pre[end + 1] - pre[l]);
            dq.addFirst(l);

            while (cost > k) {
                int p = dq.peekLast();
                cost -= nums[p] - nums[r];
                r--;
                if (p > r) dq.pollLast();
            }

            ans += r - l + 1;
        }
        return ans;
    }
}