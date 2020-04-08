### 1291. [Sequential Digits](https://leetcode.com/problems/sequential-digits/)
```javascript
/**
 * @param {number} low
 * @param {number} high
 * @return {number[]}
 */
var sequentialDigits = function(low, high) {
  const ans = [];
  
  // generate array
  const nums = '123456789';
  let len = 2;
  while(len < 10) {
    helper(ans, nums, len);
    len++;
  }
  
  return ans.filter(e => low <= e && e <= high);
};

function helper(ans, nums, len) {
  for(let i = 0; i < nums.length; i++) {
    const sb = nums.substring(i, len + i);
    if(sb.length == len) {
      ans.push(Number(sb));
    }
  }
}

```
