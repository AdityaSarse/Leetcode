class Solution {
    public int heightChecker(int[] heights) {
        int [] nums = new int[heights.length];

        for(int i = 0 ; i<heights.length ; i++){
            nums[i]=heights[i];
        }

        Arrays.sort(nums);
        int count = 0;
        for(int i = 0 ; i<heights.length ; i++){
            if(nums[i]!=heights[i]){
                count++;
            }

        }
        return count;
        
    }
}