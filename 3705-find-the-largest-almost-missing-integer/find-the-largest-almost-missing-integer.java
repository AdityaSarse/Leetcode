class Solution {
    public int largestInteger(int[] nums, int k) {

        HashMap<Integer, Integer> mp = new HashMap<>();

        for (int num : nums) {
            mp.put(num, mp.getOrDefault(num, 0) + 1);
        }

        if (k == 1) {
            int ans = -1;

            for (int num : nums) {
                if (mp.get(num) == 1) {
                    ans = Math.max(ans, num);
                }
            }

            return ans;
        }

        if (k == nums.length) {
            int ans = 0;

            for (int num : nums) {
                ans = Math.max(ans, num);
            }

            return ans;
        }

        int ans = -1;

        if (mp.get(nums[0]) == 1) {
            ans = Math.max(ans, nums[0]);
        }

        if (mp.get(nums[nums.length - 1]) == 1) {
            ans = Math.max(ans, nums[nums.length - 1]);
        }

        return ans;
    }
}