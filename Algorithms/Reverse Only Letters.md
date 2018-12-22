## Leet Code 917. Reverse Only Letters

> Given a string S, return the "reversed" string where all characters that are not a letter stay in the same place, 
> and all letters reverse their positions.


##### Example 1:
```
Input: "ab-cd"
Output: "dc-ba"
```
##### Example 2:
```
Input: "a-bC-dEf-ghIj"
Output: "j-Ih-gfE-dCba"
```
##### Example 3:
```
Input: "Test1ng-Leet=code-Q!"
Output: "Qedo1ct-eeLg=ntse-T!"
```
---
### Solution
```javascript

/**
 * @param {string} S
 * @return {string}
 */
var reverseOnlyLetters = function(S) {
    
  const regex = /[A-Z]/gi;
  const letters = S.match(regex);
  return S.split('').map(c => c.match(regex) ? letters.pop() : c).join('');
};

```
