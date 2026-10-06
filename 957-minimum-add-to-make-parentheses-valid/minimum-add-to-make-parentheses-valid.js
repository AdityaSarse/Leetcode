/**
 * @param {string} s
 * @return {number}
 */
var minAddToMakeValid = function(s) {
    let count = 0 , add = 0 ;
    for(const ch of s){
        if(ch=='('){
            count++;
        }
        else{
            count--;
            if(count<0){
                add++;
                count=0;
            }
        }
    }
    return count+add;
};