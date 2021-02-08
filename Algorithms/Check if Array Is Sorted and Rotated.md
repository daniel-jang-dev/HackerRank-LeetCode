## [1752. Check if Array Is Sorted and Rotated](https://leetcode.com/problems/check-if-array-is-sorted-and-rotated/)
```javascript
// Runtime: 80 ms, faster than 100.00%
// Memory Usage: 38.5 MB, less than 100.00%
/**
 * @param {number[]} nums
 * @return {boolean}
 */
var check = function(nums) {
    const n = nums.length;
    let count = 0;
    for(let i = 0; i < n; i++) {
        if(nums[i] > nums[(i+1) % n]) {
            count++;
        }
        if(count > 1) {
            return false;
        }
    }
    return true;
};
```

```python
# Runtime: 32 ms, faster than 100.00%
# Memory Usage: 14.2 MB, less than 100.00%
class Solution:
    def check(self, nums: List[int]) -> bool:
        n = len(nums)
        count = 0
        for i in range(0, n):
            if(nums[i] > nums[(i+1) % n]):
                count += 1
            if(count > 1):
                return False
        return True
 ```
