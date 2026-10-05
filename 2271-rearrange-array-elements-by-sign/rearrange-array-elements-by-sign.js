/**
 * @param {number[]} nums
 * @return {number[]}
 */
var rearrangeArray = function(nums) {
    let i = 0 , j =1 ;
    let arr = [];
    for(const num of nums){
        if(num>0){
            arr.splice(i,0,num);
            i+=2;
        }
        else{
            arr.splice(j,0,num);
            j+=2;
        }
    }
    return arr ;
};