## [1726. Tuple with Same Product](https://leetcode.com/problems/tuple-with-same-product/)
```javascript
// Runtime: 988 ms, faster than 100.00%
// Memory Usage: 154.3 MB, less than 100.00%
/**
 * @param {number[]} nums
 * @return {number}
 */
var tupleSameProduct = function(nums) {
  
    const myMap = {};
    for(let i = 0; i < nums.length-1; i++) {
        for(let j = i+1; j < nums.length; j++) {
            const p = nums[i] * nums[j];
            myMap[p] = (myMap[p] || 0) + 1;
        }
    }
    const filtered = Object.values(myMap).filter(v => v > 1);
    let output = 0;
    filtered.forEach(k => {
       output += k * (k-1) * (2 ** 2);
    });
    return output;
}; 
```
