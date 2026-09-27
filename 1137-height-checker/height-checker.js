/**
 * @param {number[]} heights
 * @return {number}
 */
var heightChecker = function(heights) {
    const clone = Array.from(heights).sort((a,b)=>a-b);
    let count = 0 ; 
    for(let num = 0 ; num < heights.length ;num++){
        if(clone[num]!==heights[num]){
            count++;
        }
    }
    return count ;
};