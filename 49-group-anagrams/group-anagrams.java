import java.util.*;

class Solution {
    public List<List<String>> groupAnagrams(String[] strs) {
        if (strs == null || strs.length == 0 ){
            return new ArrayList<>();
        }
        Map<String , List<String>> mp =new HashMap<>();
        for (String str : strs) {
            char[] chars = str.toCharArray();
            Arrays.sort(chars);
            String sortedKey = new String(chars);
            mp.computeIfAbsent(sortedKey, k -> new ArrayList<>()).add(str);
        }
        
        return new ArrayList<>(mp.values());
    }
}
