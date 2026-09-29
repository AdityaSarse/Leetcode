var minSumOfLengths = function(arr, target) {
    const n = arr.length;
    // best[i] = shortest subarray with sum == target that ends at or before index i
    const best = new Array(n).fill(Infinity);
    let ans = Infinity;
    let sum = 0;
    let l = 0;

    for (let r = 0; r < n; r++) {
        sum += arr[r];
        while (sum > target) sum -= arr[l++];

        best[r] = r > 0 ? best[r - 1] : Infinity;

        if (sum === target) {
            const len = r - l + 1;
            // pair this window with the best one that ends before it starts
            if (l > 0) ans = Math.min(ans, best[l - 1] + len);
            best[r] = Math.min(best[r], len);
        }
    }
    return ans === Infinity ? -1 : ans;
};