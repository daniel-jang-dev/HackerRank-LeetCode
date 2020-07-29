## 1528. [Shuffle String](https://leetcode.com/problems/shuffle-string/)
```javascript

/**
 * @param {string} s
 * @param {number[]} indices
 * @return {string}
 */
 
// Javascript
var restoreString = function(s, indices) {
  const ans = [];
  indices.forEach((v, i) => {
    ans[v] = s[i];
  });
  return ans.join('');
};
```

```python
// Python
class Solution:
    def restoreString(self, s: str, indices: List[int]) -> str:
        
        size = len(s)
        shuffle_s = [' ' for _ in range(size)]
        
        for idx, char in enumerate(s):
            shuffle_s[ indices[idx] ] = char
            
        return ''.join(shuffle_s)
```  
