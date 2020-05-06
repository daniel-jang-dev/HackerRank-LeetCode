### 2020 May 6th. [Majority Element](https://leetcode.com/explore/challenge/card/may-leetcoding-challenge/534/week-1-may-1st-may-7th/3321/)
```javascript
/**
 * @param {number[]} nums
 * @return {number}
 */
var majorityElement = function(nums) {
  const map = {};
  const len = nums.length;
  for(let i = 0; i < len; i++) {
    const n = nums[i];
    map[n] = map[n] + 1 || 1;
    if(map[n] > len / 2) {
      return n;
    }
  }
};
```

```python
class Solution(object):
    def majorityElement(self, nums):
        from collections import Counter
        n = Counter(nums)
        for i in n:
            if n.get(i)>(len(nums)/2):
                return i
```
