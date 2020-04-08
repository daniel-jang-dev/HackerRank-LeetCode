### 526. [Beautiful Arrangement](https://leetcode.com/problems/beautiful-arrangement/)

```javascript
/**
 * @param {number} N
 * @return {number}
 */
var countArrangement = function(N) {
  
  const nums = Array.from({length: N}, (v,i) => i+1);
  const used = nums.map(e => false);
  const ans = [];
  backtrack(ans, [], nums, used, 1);
  return ans.length;
};

function backtrack(ans, sb, nums, used, index) {
  
  // Base case
  if(index > nums.length) {
    ans.push(sb);
    return;
  }
  
  for(let i = 0; i < nums.length; i++) {
    if(used[i]) continue;
    const n = nums[i];
    if(n % index == 0 || index % n == 0) {
      used[i] = true;
      backtrack(ans, [...sb, n], nums, used, index + 1);
      used[i] = false;
    }
  }
}
```
