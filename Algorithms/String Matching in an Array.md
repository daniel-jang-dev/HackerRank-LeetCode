### 1408. [String Matching in an Array](https://leetcode.com/problems/string-matching-in-an-array/)
```javascript
/**
 * @param {string[]} words
 * @return {string[]}
 */
var stringMatching = function(words) {
  
  const ans = [];
  
  for(let i = 0; i < words.length; i++) {
    
    const s1 = words[i];
    for(let j = 0; j < words.length; j++) {
      
      if(i == j) continue;
      
      const s2 = words[j];
      if(s1.length >= s2.length) continue;
      
      if(s2.includes(s1) && !s1.includes(s2)) {
        ans.push(s1);
        break;
      }
    }
  }
  return ans;
};
```
