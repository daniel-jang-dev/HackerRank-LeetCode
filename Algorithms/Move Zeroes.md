### D-04. [Move Zeroes](https://leetcode.com/explore/challenge/card/30-day-leetcoding-challenge/528/week-1/3286/)
```javascript
/**
 * @param {number[]} nums
 * @return {void} Do not return anything, modify nums in-place instead.
 */
var moveZeroes = function(nums) {
  const done = nums.map(e => false);
  for(let i = nums.length- 1 ; i >= 0; i--)   {
    
    if(nums[i] != 0 || done[i]) continue;
    
    
    while(i+1 < nums.length && !done[i+1]) {
      let tmp = nums[i];
      nums[i] = nums[i+1];
      nums[i+1] = tmp;
      i++;
    }
    done[i] = true;
  }
};
```

