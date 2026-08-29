class Solution {
    public List<Integer> findMissingElements(int[] nums) {
        int min = Integer.MAX_VALUE , max = Integer.MIN_VALUE;
        TreeSet<Integer> set = new TreeSet<>();
        List<Integer> li = new ArrayList<>();
        for(int n : nums){
            set.add(n);
        }
        for(int i = 0 ; i <nums.length-1; i++){
            if(nums[i]>nums[i+1]){
                max=Math.max(nums[i],max);
                min=Math.min(nums[i+1],min);
            }else{
                min=Math.min(nums[i],min);
                max=Math.max(nums[i+1],max);
            }
        }
        for(int i = min ; i <= max ; i++){
            if(set.contains(i)){
                continue;
            }
            else{
                li.add(i);
            }
        }
        return li ;

    }
}