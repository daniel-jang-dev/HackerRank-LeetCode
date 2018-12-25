## Leet Code 242. Valid Anagram

> Given two strings s and t , write a function to determine if t is an anagram of s.

##### Example 1:
```
Input: s = "anagram", t = "nagaram"
Output: true
```
##### Example 2:
```
Input: s = "rat", t = "car"
Output: false
```
##### Note:
You may assume the string contains only lowercase alphabets.

---
## Solution
```javascript
/**
 * @param {string} s
 * @param {string} t
 * @return {boolean}
 */
var isAnagram = function(s, t) {
  
  if(s.length !== t.length) return false;

  var m1 = {}, m2 = {};
  s.split('').forEach(v => {
    m1[v] = m1[v] ? m1[v] + 1 : 1;
  });
  t.split('').forEach(v => {
    m2[v] = m2[v] ? m2[v] + 1 : 1;
  });
  
  return Object.keys(m1).every(key => m1[key] === m2[key]);
};
```
