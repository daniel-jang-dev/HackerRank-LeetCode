### Week 1.3. [Maximum Subarray](https://leetcode.com/explore/featured/card/30-day-leetcoding-challenge/528/week-1/3285/)
```javascript
/**
 * @param {number[]} nums
 * @return {number}
 */
var maxSubArray = function(nums) {

  let maxSum = nums[0];
  for(let i = 0; i < nums.length; i++) {
    let sum = nums[i];
    if(sum > maxSum) {
        maxSum = sum;
    }
    
    // Right side walkthrought
    let j = i+1;
    while(j < nums.length) {
      sum += nums[j];
      if(sum > maxSum) {
        maxSum = sum;
      }
      j++;
    }
    
    // Left side walkthrought
    let k = i-1;
    while(k >=0) {
      sum += nums[k];
      if(sum > maxSum) {
        maxSum = sum;
      }
      k--;
    }
  }
  return maxSum;
};
```
