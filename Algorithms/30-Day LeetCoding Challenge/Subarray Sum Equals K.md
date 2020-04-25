### Week 4.1. [Subarray Sum Equals K](https://leetcode.com/explore/challenge/card/30-day-leetcoding-challenge/531/week-4/3307/)
```javascript
/**
 * @param {number[]} nums
 * @param {number} k
 * @return {number}
 */
var subarraySum = function(nums, k) {
  
  if(!nums.length) return 0;
  if(nums.length == 1) return k == nums[0] ? 1 : 0;
  
  let count = 0;
  let sum = 0;
  const map = {};
  for(const n of nums) {
    sum += n;
    if(sum == k) count++;
    if(map[sum-k]) count += map[sum-k];
    map[sum] = map[sum] + 1 || 1;
  }
  return count;
};

```
