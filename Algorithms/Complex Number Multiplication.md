## LeetCode 537. Complex Number Multiplication

> Given two strings representing two complex numbers.

> You need to return a string representing their multiplication. Note i2 = -1 according to the definition.

###### Example 1:
```
Input: "1+1i", "1+1i"
Output: "0+2i"
Explanation: (1 + i) * (1 + i) = 1 + i2 + 2 * i = 2i, and you need convert it to the form of 0+2i.
```
###### Example 2:
```
Input: "1+-1i", "1+-1i"
Output: "0+-2i"
Explanation: (1 - i) * (1 - i) = 1 + i2 - 2 * i = -2i, and you need convert it to the form of 0+-2i.
```
###### Note:

- The input strings will not have extra blank.
- The input strings will be given in the form of `a+bi`, where the integer `a` and `b` will both belong to the range of [-100, 100]. And `the output should be also in this form`.

---
## Solution
```javascript

var complexNumberMultiply = function(a, b) {

  var ca = a.split('+');
  var p = Number(ca[0]);
  var q = Number(ca[1].substring(0, ca[1].length-1));
  
  var cb = b.split('+');
  var r = Number(cb[0]);
  var s = Number(cb[1].substring(0, cb[1].length-1));
  
  var t = p * r - q * s;
  var u = q * r + p * s;
  
  return `${t}+${u}i`;
};
```
