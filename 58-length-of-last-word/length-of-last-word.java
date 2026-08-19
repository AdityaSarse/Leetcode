class Solution {
    public int lengthOfLastWord(String s) {
        String[] ans = s.split("\\s+");
        int m =ans.length-1;
        return ans[m].length();
    }
}