## Leet Code 500. Keyboard Row
> Given a List of words, return the words that can be typed using letters of alphabet on only one row's of American keyboard like the image below.


##### Example:
```
Input: ["Hello", "Alaska", "Dad", "Peace"]
Output: ["Alaska", "Dad"]
```

##### Note:

1. You may use one character in the keyboard more than once.
2. You may assume the input string will only contain letters of alphabet.

---
## Solution
```javascript
/**
 * @param {string[]} words
 * @return {string[]}
 */
var findWords = function(words) {
  return words.filter(word => REGEXES.some(rgx => word.split('').every(c =>  rgx.includes(c.toLowerCase()))));
};

var REGEXES = [
  'qwertyuiop',
  'asdfghjkl',
  'zxcvbnmi'
];
```
