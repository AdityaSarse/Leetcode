/**
 * @param {string} s
 * @param {string} t
 * @return {boolean}
 */
var isAnagram = function(s, t) {
     if (s.len != t.len) return false;

    s = s.split("").sort().join("");
    t = t.split("").sort().join("");

    return s === t;
    
};