/**
 * @param {string} s
 * @return {character}
 */
var repeatedCharacter = function(s) {
    const m =new Map();
    for(const char of s){
        if(m.has(char)){
            return char;
        }
        m.set(char,1);
    }
    
};