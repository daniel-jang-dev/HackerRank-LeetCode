## [1442. Count Triplets That Can Form Two Arrays of Equal XOR](https://leetcode.com/problems/count-triplets-that-can-form-two-arrays-of-equal-xor/)
```javascript
// Runtime: 164 ms, faster than 6.90%
// Memory Usage: 40.7 MB, less than 17.24%
/**
 * @param {number[]} arr
 * @return {number}
 */
var countTriplets = function(arr) {
    const n = arr.length;
    const record = {};
    let ans = 0;
    for(let i = 0; i < n - 1; i++) {
        for(let k = i+1; k < n; k++) {
            let x = arr[i];
            let p = i+1;
            while(p <= k) {
                x ^= arr[p];
                if(x == 0) {
                    if(!record[i]) {
                        record[i] = new Set();
                    }
                    if(!record[i].has(p)) {
                        ans += p - i;
                        record[i].add(p);
                    }
                }
                p++;
            }
        }
    }
    return ans;
}
```
