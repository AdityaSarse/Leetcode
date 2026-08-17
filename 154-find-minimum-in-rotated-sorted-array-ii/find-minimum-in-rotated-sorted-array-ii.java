class Solution {
    public int findMin(int[] nums) {
        int min = 5000 , i =0 ,j =nums.length -1;
        if(nums.length == 1){
            return nums[0];
        }
        while(i<=j){
            if(nums[i]>=nums[j]){
                min = Math.min(min,nums[j]);
            }
            else{
                min = Math.min(min,nums[i]);
            }
            i++;
            j--;
        } 
        return min ;

    }
}
