class Solution {
    public int[] intersection(int[] nums1, int[] nums2) {
        HashSet<Integer> mp = new HashSet<>();
        for(int n : nums1) {
            mp.add(n);
        }
        
        int i = 0;
        for(int n : nums2) {
            if(mp.contains(n)) {
                nums1[i] = n;
                i++;
                mp.remove(n);
            }
        }
        int[] result = new int[i]; 
        
        for(int idx = 0; idx < i; idx++) {
            result[idx] = nums1[idx];
        } 
        
        return result;
    }
}
