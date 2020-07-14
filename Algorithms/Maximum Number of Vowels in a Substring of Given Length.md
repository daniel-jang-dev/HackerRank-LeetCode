## 1456.[Maximum Number of Vowels in a Substring of Given Length](https://leetcode.com/problems/maximum-number-of-vowels-in-a-substring-of-given-length/)

```javascript
/**
 * @param {string} s
 * @param {number} k
 * @return {number}
 */
var maxVowels = function(s, k) {
  
  const vowels = 'aeiou';
  let count = 0;

  for(let i = 0; i < k; i++) {
    if(vowels.includes(s[i])) {
      count++;
    }
  }

  let max = count;
  for(let i = k; i < s.length; i++) {
    if(vowels.includes(s[i])) {
      count++;
    }
    if(vowels.includes(s[i-k])) {
      count--;
    }
    if(max < count) {
      max = count;
    }
  }
  return max;
};
```
