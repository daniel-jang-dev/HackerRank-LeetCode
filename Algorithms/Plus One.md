## LeetCode 66. Plus One
> Given a __non-empty__ array of digits representing a non-negative integer, plus one to the integer.

> The digits are stored such that the most significant digit is at the head of the list, and each element in the array contain a single digit.

> You may assume the integer does not contain any leading zero, except the number 0 itself.

###### Example 1:
```
Input: [1,2,3]
Output: [1,2,4]
Explanation: The array represents the integer 123.
```
###### Example 2:
```
Input: [4,3,2,1]
Output: [4,3,2,2]
Explanation: The array represents the integer 4321.
```
---
## Solution: 52ms

```javascript
/**
 * @param {number[]} digits
 * @return {number[]}
 */
var plusOne = function(digits) {
  let lastI = digits.length - 1;
  digits[lastI]++;
  if(digits[lastI] < 10) return digits;
  
  if(lastI < 1) return [1, 0];
  
  for (let i = lastI ; i >= 0 ; i--) {
    if(digits[i] < 10) break;
    digits[i] = 0;
    if (i > 0) {
      digits[i-1]++;
    } else {
      digits.unshift(1);
      break;
    }
  }
  return digits;
};
```
