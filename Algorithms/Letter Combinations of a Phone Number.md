## 17. Letter Combinations of a Phone Number



Given a string containing digits from 2-9 inclusive, return all possible letter combinations that the number could represent.
A mapping of digit to letters (just like on the telephone buttons) is given below. Note that 1 does not map to any letters.

![img](http://upload.wikimedia.org/wikipedia/commons/thumb/7/73/Telephone-keypad2.svg/200px-Telephone-keypad2.svg.png)

##### Example:
```
Input: "23"
Output: ["ad", "ae", "af", "bd", "be", "bf", "cd", "ce", "cf"].
```
#####Note:
- Although the above answer is in lexicographical order, your answer could be in any order you want.

---
```
/**
 * @param {string} digits
 * @return {string[]}
 */
var letterCombinations = function(digits) {
  
  const pMap = {
  '2': ['a', 'b', 'c'],
  '3': ['d', 'e', 'f'],
  '4': ['g', 'h', 'i'],
  '5': ['j', 'k', 'l'],
  '6': ['m', 'n', 'o'],
  '7': ['p', 'q', 'r', 's'],
  '8': ['t', 'u', 'v'],
  '9': ['w', 'x', 'y', 'z'],
  }
  
  let ans = [];
  for(let i = 0; i < digits.length; i++) {
    ans = helper(ans, digits[i], pMap);
  }
  return ans;
};

function helper(res, key, pMap) {
  const arr = pMap[key];
  let ans = [];
  if(res.length === 0) {
    ans = [...arr];
  } else {
    res.forEach(prefix => {
      arr.forEach(c => {
        ans.push(prefix + c);
      });
    });
  }
  res = [...ans];
  return res;
}
```
