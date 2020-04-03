#### 415.[Add Strings](https://leetcode.com/problems/add-strings/)
```
/**
 * @param {string} num1
 * @param {string} num2
 * @return {string}
 */
var addStrings = function(num1, num2) {
  const a = num1.split('').reverse();
  const b = num2.split('').reverse();
  const ans = [];
  for(let i=0; i < Math.max(a.length, b.length); i++) {
    const sum = Number(a[i] || 0) + Number(b[i] || 0) + (ans[i] || 0);
    if(sum < 10) {
      ans[i] = sum;
    } else {
      ans[i] = sum - 10;
      ans[i+1] = 1;
    }
  }
  return ans.reverse().join('');
};
```
