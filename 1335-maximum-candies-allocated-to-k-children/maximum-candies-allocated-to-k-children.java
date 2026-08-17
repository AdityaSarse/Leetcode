class Solution {
    public int maximumCandies(int[] candies, long k) {
        int l = 1 ,h = 0 ,ans = 0;
        for (int c : candies) {
            h = Math.max(h, c);
        }

        while (l <= h) {
            int mid = l + (h - l) / 2;
            long children = 0;
            for (int c : candies) {
                children += c / mid;
            }
            if (children >= k) {
                ans = mid;
                l = mid + 1;
            } 
            else {
                h = mid - 1;
            }
        }
        return ans;
    }
}