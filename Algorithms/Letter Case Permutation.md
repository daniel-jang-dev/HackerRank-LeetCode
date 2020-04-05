### 784. [Letter Case Permutation](https://leetcode.com/problems/letter-case-permutation/)

```javascript
/**
 * @param {string} S
 * @return {string[]}
 */
 
/*** 1. Brute Solution ***/
 
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


/*** 2. Backtracking ***/

var letterCasePermutation = function(S) {
    const ans = [];
    backtrack(S, ans, '', 0);
    return ans;
};

function backtrack(S, arr, sb, index) {
  
    // Base case - we reached the length of the string S
    if (index === S.length) {
        arr.push(sb);
        return;
    }
    const c = S[index];
    // In the case the current character is an upper alphabet, we want a permutation with a lower alphabet
    if (c >= 'A' && c <= 'Z') {
       backtrack(S, arr, sb + c, index + 1);
    }
    // In the case the current character is a lower alphabet we want a permutation with an upper alphabet
    if (c >= 'a' && c <= 'z') {
        backtrack(S, arr, sb + c.toUpperCase(), index + 1);
    }
    // no matter what we proceed with the original permutation
    backtrack(S, arr, sb + c, index + 1);
    
}
```
