### 2020 May 5th. [First Unique Character in a String](https://leetcode.com/explore/challenge/card/may-leetcoding-challenge/534/week-1-may-1st-may-7th/3320/)
```javascript
/**
 * @param {string} s
 * @return {number}
 */
var firstUniqChar = function(s) {
  
  const map = {};
  for(const c of s) {
    map[c] = map[c] + 1 || 1;
  }
  for(let i = 0; i < s.length; i++) {
    if(map[s[i]] == 1) return i;
  }
  return -1;
};
```
