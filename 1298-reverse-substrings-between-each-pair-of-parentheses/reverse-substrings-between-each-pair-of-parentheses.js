var reverseParentheses = function(s) {
    const stack = [];
    let cur = [];
    for (const ch of s) {
        if (ch === '(') {
            stack.push(cur);
            cur = [];
        } else if (ch === ')') {
            cur.reverse();
            cur = stack.pop().concat(cur);
        } else {
            cur.push(ch);
        }
    }
    return cur.join("");
};