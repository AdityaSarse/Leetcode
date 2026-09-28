var isGood = function(nums) {
    if(nums.length==1 || nums.length==0){
        return false;
    }

    const map = new Map();

    for (const num of nums) {
        map.set(num, (map.get(num) || 0) + 1);
    }

    const n = nums.length - 1;

    for (let i = 1; i <= n; i++) {

        const expected = i === n ? 2 : 1;

        if (map.get(i) !== expected) {
            return false;
        }
    }

    return true;
};