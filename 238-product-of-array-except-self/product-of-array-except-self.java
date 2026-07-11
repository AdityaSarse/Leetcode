class Solution {
    public int[] productExceptSelf(int[] nums) {
        int n = nums.length;
        int[] ans = new int[n];
        Arrays.fill(ans,1);
        int preffix=1,suffix=1;
        for(int i = 0 ; i <nums.length ; i++){
            ans[i]=preffix;
            preffix=preffix*nums[i];
        }
        for(int i = nums.length-1 ; i >=0 ; i--){
            ans[i] = ans[i] * suffix;
            suffix = suffix * nums[i];
        }
        return ans;
    }
}