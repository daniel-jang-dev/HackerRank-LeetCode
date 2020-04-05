### 784. [Letter Case Permutation](https://leetcode.com/problems/letter-case-permutation/)

```javascript
/**
 * @param {string} S
 * @return {string[]}
 */
var letterCasePermutation = function(S) {
  
  if(!isNaN(S)) return [S]; // digit only
  
  let set = new Set();
  for(let i = 0; i < S.length; i++) {
    
    const c = S[i];
    if(!isNaN(c)) continue; // digit
    
    if(set.size == 0) {
      const prefix = S.substring(0, i);
      const suffix = S.substring(i+1);
      set.add(`${prefix}${c.toLowerCase()}${suffix}`);
      set.add(`${prefix}${c.toUpperCase()}${suffix}`);
    } else {
      for (let item of set) {
        const prefix = item.substring(0, i);
        const suffix = item.substring(i+1);
        set.add(`${prefix}${c.toLowerCase()}${suffix}`);
        set.add(`${prefix}${c.toUpperCase()}${suffix}`);
      }
    }
  }
  
  return [...set];
};
```
