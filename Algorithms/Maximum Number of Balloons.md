## 1189. Maximum Number of Balloons

Given a string text, you want to use the characters of text to form as many instances of the word "balloon" as possible.
You can use each character in text at most once. Return the maximum number of instances that can be formed.

##### Example 1:
```
Input: text = "nlaebolko"
Output: 1
```
##### Example 2:
```
Input: text = "loonbalxballpoon"
Output: 2
```
##### Example 3:
```
Input: text = "leetcode"
Output: 0
```
##### Constraints:
- 1 <= text.length <= 10^4
- text consists of lower case English letters only.
---
```
/**
 * @param {string} text
 * @return {number}
 */
var maxNumberOfBalloons = function(text) {
  const map = {};
  text.split('').forEach(c => {
    map[c] = map[c] ? map[c]+1 : 1;
  });
  return countBalloon(map);
};

// a:1, b:1, l:2, o:2, n:1
function countBalloon(map) {
  
  const a1 = ['a', 'n', 'b'];
  const a2 = ['l', 'o'];
  if([...a1, ...a2].some(key => map[key] === undefined)) return 0;
  
  let count = 0;
  while(a1.every(k => map[k] >=1) && a2.every(k => map[k] >=2)) {
    count++;
    a1.forEach(k => {
      map[k] -= 1;
    });
    a2.forEach(k => {
      map[k] -= 2;
    });
  }
  return count;
}
```
