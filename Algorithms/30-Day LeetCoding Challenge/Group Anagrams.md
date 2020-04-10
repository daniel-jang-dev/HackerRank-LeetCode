### Week 1.6. [Group Anagrams](https://leetcode.com/explore/featured/card/30-day-leetcoding-challenge/528/week-1/3288/)
```javascript
/**
 * @param {string[]} strs
 * @return {string[][]}
 */
var groupAnagrams = function(strs) {
  const ans = {};
  strs.forEach(str => {
    
    // generate map
    const m = {};
    for(const c of str)
      m[c] = m[c] + 1 || 1;
    
    // generate label
    let label = '';
    Object.keys(m).sort().forEach(key => {
      label += key + m[key];
    });
    // store
    ans[label] ? ans[label].push(str) : ans[label] = [str];
  });
  return Object.values(ans);
};
```
