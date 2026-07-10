class Solution {
    public int[] runningSum(int[] nums) {
        if(nums.length==0){
            return nums;
        }
        int i = 0 ,j = 1;
        while(i < nums.length-1){
            int temp = nums[i]+nums[j];
            nums[j]=temp;
            i++;
            j++;
        }
        return nums;
    }
}