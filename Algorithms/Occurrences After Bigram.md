## 1078. [Occurrences After Bigram](https://leetcode.com/problems/occurrences-after-bigram/)
```javascript

/**
 * @param {string} text
 * @param {string} first
 * @param {string} second
 * @return {string[]}
 */
// Javascript
var findOcurrences = function(text, first, second) {
  const ans = [];
  const a = text.split(' ');
  for(let i = 2; i < a.length; i++) {
    if(a[i-2] == first && a[i-1] == second) {
      ans.push(a[i]);
    }
  }
  return ans;
};
```

```python
// Python
class Solution:
    def findOcurrences(self, t: str, f: str, s: str) -> List[str]:
        t=t.split()
        l=[]
        for i in range(len(t)-2):
            if t[i]==f and t[i+1]==s:
                l.append(t[i+2])
        return l
```
