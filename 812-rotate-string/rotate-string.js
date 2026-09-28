/**
 * @param {string} s
 * @param {string} goal
 * @return {boolean}
 */
var rotateString = function(s, goal) {

    let s1 = s.concat(s) ;
    if(s1.includes(goal) && s.length==goal.length){
        return true;
    }
    return false;
};