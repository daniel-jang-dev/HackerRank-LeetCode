## 1363. Largest Multiple of Three

Given an integer array of digits, return the largest multiple of three that can be formed by concatenating some of the given digits in any order.
Since the answer may not fit in an integer data type, return the answer as a string.
If there is no answer return an empty string.

###### Example 1:
```
Input: digits = [8,1,9]
Output: "981"
```
###### Example 2:
```
Input: digits = [8,6,7,1,0]
Output: "8760"
```
###### Example 3:
```
Input: digits = [1]
Output: ""
```
###### Example 4:
```
Input: digits = [0,0,0,0,0,0]
Output: "0"
```

##### Constraints:
* 1 <= digits.length <= 10^4
* 0 <= digits[i] <= 9
* The returning answer must not contain unnecessary leading zeros.

---
```
/**
 * @param {number[]} digits
 * @return {string}
 */
var largestMultipleOfThree = function(digits) {
  
  let sum = 0;
  const map = {
    0: [],
    1: [],
    2: []
  };
  digits.forEach(d => {
    map[d%3].push(d);
    sum += d;
  });
  const r = sum % 3;
  
  // 1. remainder = 0
  if(r === 0) {
    return print(digits);
  
  // 2. remainder != 0
  } else {
    
    // 2.1 DELETE 1 digit
    if(map[r].length) {
      const min = Math.min(...map[r]);
      const i = digits.findIndex(d => d === min);
      digits.splice(i, 1);
      return print(digits);
      
    // 2.2 DELETE 2 digits
    } else {
      if(map[3-r].length > 1) {
        
        let count = 2;
        while(count) {
          const min = Math.min(...map[3-r]);
          const i = digits.findIndex(d => d === min);
          digits.splice(i, 1);  
          const j = map[3-r].findIndex(d => d === min);
          map[3-r].splice(j, 1);
          count--;
        }
        return print(digits);
        
      } else {
        return '';      
      }
    }
  }
};

var print = function(arr) {
  if(!arr.length) return '';
  if(arr.every(d => d === 0)) return '0';
  return arr.sort((a, b) => b-a).join('');
}
```
