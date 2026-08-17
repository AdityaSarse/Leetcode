class Solution {
    public List<Integer> targetIndices(int[] nums, int target) {
        List<Integer> li = new ArrayList<>();
        int min = 0 ;
        for(int i = 0 ; i<nums.length ;i++){
            if(nums[i]<target){
                min++;
            }
        }
        for(int i = 0 ; i <nums.length ; i++){
            if(nums[i]==target){
                li.add(min);
                min++;
            }
        }
        return li ;
    }
}