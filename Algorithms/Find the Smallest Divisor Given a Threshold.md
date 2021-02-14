## [1283. Find the Smallest Divisor Given a Threshold](https://leetcode.com/problems/find-the-smallest-divisor-given-a-threshold/)
```javascript
// Runtime: 128 ms, faster than 35.88%
// Memory Usage: 42.3 MB, less than 67.65%
/**
 * @param {number[]} nums
 * @param {number} threshold
 * @return {number}
 */
var smallestDivisor = function(nums, threshold) {
    
    let left = 1, right = 1, sum = 0;
    nums.forEach(x => {
        left = left > x ? x : left;
        right = right < x ? x : right;
        sum += x;
    });
    if(sum <= threshold) return 1;
    
        
    while(left < right) {
        let mid = Math.ceil((left + right) / 2);
        let sum = 0;
        nums.forEach(num => {
            sum += Math.ceil(num / mid);
        });
        if(sum <= threshold) {
            if(right == mid) return right;
            right = mid;
        } else {
            left = mid;
        }
    }
    return left;  
};
```
