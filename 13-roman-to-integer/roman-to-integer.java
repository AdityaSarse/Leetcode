class Solution {
    public int romanToInt(String s) {
        java.util.Map<Character, Integer> d = new java.util.HashMap<>();
        d.put('I', 1);
        d.put('V', 5);
        d.put('X', 10);
        d.put('L', 50);
        d.put('C', 100);
        d.put('D', 500);
        d.put('M', 1000);
        
        int n = s.length();
        int ans = d.get(s.charAt(n - 1));
        
        for (int i = 0; i < n - 1; ++i) {
            if (d.get(s.charAt(i)) < d.get(s.charAt(i + 1))) {
                ans -= d.get(s.charAt(i));
            } else {
                ans += d.get(s.charAt(i));
            }
        }
        
        return ans;
    }
}