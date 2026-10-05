class Solution {
    public int[] rearrangeArray(int[] nums) {
        int [] res = new int[nums.length];
        int i = 0 , j =1 ,k =0;

        while(k<nums.length){
            if(nums[k]>0){
                res[i]=nums[k];
                i+=2;
            }
            else{
                res[j]=nums[k];
                j+=2;
            }
            k++;
        }  
        return res; 
    }
}