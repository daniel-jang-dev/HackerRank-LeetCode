## [1442. Count Triplets That Can Form Two Arrays of Equal XOR](https://leetcode.com/problems/count-triplets-that-can-form-two-arrays-of-equal-xor/)
```javascript
// Runtime: 80 ms, faster than 79.31%
// Memory Usage: 38.7 MB, less than 34.48%
/**
 * @param {number[]} arr
 * @return {number}
 */
var countTriplets = function(arr) {
    const n = arr.length;
    let acc = [arr[0]]; 
    let ans = 0;
    // acccumuation
    for(let i = 1; i < n; i++) {
        acc[i] = acc[i-1] ^ arr[i];
        if(acc[i] == 0) {
            ans += i;
        }
    }
    // XOR looping 
    for(let i = 0; i < n; i++) {
        for(let k = i; k < n; k++) {
            acc[k] = acc[k] ^ arr[i];
            if(acc[k] == 0 && k > i) {
                ans += k - i - 1;
            }
        }
    }
    return ans;
};

```

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


