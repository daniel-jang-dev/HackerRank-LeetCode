### 1422. [Maximum Score After Splitting a String](https://leetcode.com/problems/maximum-score-after-splitting-a-string/)
```javascript
/**
 * @param {string} s
 * @return {number}
 */
var maxScore = function(s) {
  
  let left = 0;
  let right = 0;
  for(const c of s) {
    if(c == '1') right++;
  }
  let max = 0;  
  for(let i = 0; i < s.length - 1; i++) {
    if(s[i] == '0')
      left++;
    else
      right--;
    max = Math.max(max, left + right);
  }
  return max;
};
```
