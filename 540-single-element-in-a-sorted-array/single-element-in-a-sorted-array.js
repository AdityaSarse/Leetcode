/**
 * @param {number[]} nums
 * @return {number}
 */
var singleNonDuplicate = function(nums) {
    let i = 0 , j = 1 , count = 0 ;
    while(i<j){
        if(nums[i]===nums[j]){
            count++;
        }
        else{
            count--;
        }
        if(count<0){
            return nums[i];
        }
        i++;
        j++;
    }
};