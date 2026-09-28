/**
 * @param {number[]} nums
 * @return {number[]}
 */
var separateDigits = function(nums) {

    let s=nums.join("");
    nums=[];
    for(const char of s){
        const num1 = Number(char);
        nums.push(num1);
    }
     return nums;
    
};