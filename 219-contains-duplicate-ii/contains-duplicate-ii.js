var containsNearbyDuplicate = function(nums, k) {
    const mp = new Map();

    for (let i = 0; i < nums.length; i++) {

        if (mp.has(nums[i])) {
            if (i - mp.get(nums[i]) <= k) {
                return true;
            }
        }

        mp.set(nums[i], i);
    }

    return false;
};