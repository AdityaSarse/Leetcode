/**
 * @param {number[]} nums
 * @param {number} target
 * @return {number[]}
 */
var twoSum = function(nums, target) {
    const mp= new Map();

    for(let i = 0 ; i < nums.length ; i++){
        let current = nums[i];
        let complement = target-current;

        if(mp.has(complement)){
            return [mp.get(complement), i]
        }
        mp.set(current , i);
    }
    return [];
};