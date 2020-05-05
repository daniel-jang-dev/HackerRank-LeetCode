### 2020 May 3rd. [Ransom Note](https://leetcode.com/explore/challenge/card/may-leetcoding-challenge/534/week-1-may-1st-may-7th/3318/)
```javascript
/**
 * @param {string} ransomNote
 * @param {string} magazine
 * @return {boolean}
 */
var canConstruct = function(ransomNote, magazine) {
  
  const m1 = {};
  for(const c of ransomNote) {
    m1[c] = m1[c] + 1 || 1;
  }
  const m2 = {};
  for(const c of magazine) {
    m2[c] = m2[c] + 1 || 1;
  }
  return Object.keys(m1).every(c => m2[c] && m1[c] <= m2[c]);
};
``
