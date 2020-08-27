## 1556. [Thousand Separator](https://leetcode.com/problems/thousand-separator/)
```javascript
var thousandSeparator = function(n) {
  
  const s = n.toString();
  if(n < 1000) return s;
  
  const len = s.length;
  let ans = '';
  let count = 0;
  for(let i = len-1; i >= 0; i--) {
    ans = s[i] + ans;
    count++;
    if(count < len && count % 3 === 0) {
      ans = '.' + ans;
    }
  }
  return ans;
};
```
