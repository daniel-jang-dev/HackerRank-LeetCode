### 1437. [Check If All 1's Are at Least Length K Places Away](https://leetcode.com/problems/check-if-all-1s-are-at-least-length-k-places-away/)
```javascript
/**
 * @param {number[]} nums
 * @param {number} k
 * @return {boolean}
 */
var kLengthApart = function(nums, k) {
  if(!k) return true;
  const gaps = [];
  
  let count = 0;
  for(const n of nums) {
    if(n == 1) {
      if(count > 0) {
        gaps.push(count);
      }
      count = 0;
    } else {
      count++;
    }
  }
  if(count > 0) {
    gaps.push(count);
  }
  return gaps.every(e => e >= k);
};
```

```python
class Solution:
    def kLengthApart(self, nums: List[int], k: int) -> bool:
        ones = nums.count(1)
        return len(nums) >= ones * (k+1) - k
```
