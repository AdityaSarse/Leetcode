class Solution {
    public int heightChecker(int[] heights) {
        int[] nums = heights.clone();

        Arrays.sort(nums);

        int count = 0;
        for (int i = 0; i < heights.length; i++) {
            if (heights[i] != nums[i]) {
                count++;
            }
        }

        return count;
    }
}