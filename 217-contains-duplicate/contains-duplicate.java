class Solution {
    public boolean containsDuplicate(int[] nums) {
        Arrays.sort(nums);
        int i = 1 , j = 0 ;
        while(i<nums.length){
            if(nums[i]==nums[j]){
                return true;
            }
            else{
                i++;
                j++;
            }
        }
        return false;
    }
}