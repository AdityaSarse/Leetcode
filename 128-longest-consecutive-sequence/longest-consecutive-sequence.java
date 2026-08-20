class Solution {
    public int longestConsecutive(int[] nums) {

        if (nums.length == 0) {
            return 0;
        }

        TreeSet<Integer> set = new TreeSet<>();

        for (int n : nums) {
            set.add(n);
        }

        int count = 1 ,max = 1 ,previous = set.first();

        for (int n : set) {

            if (n == previous + 1) {
                count++;
            } else {
                count = 1;
            }

            max = Math.max(max, count);
            previous = n;
        }

        return max;
    }
}