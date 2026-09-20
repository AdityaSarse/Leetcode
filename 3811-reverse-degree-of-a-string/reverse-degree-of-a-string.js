var reverseDegree = function(s) {
    let ans = 0;
    for (let i = 0; i < s.length; i++) {
        const reversePos = 123 - s.charCodeAt(i);
        ans += reversePos * (i + 1);
    }
    return ans;
};