## LeetCode 941. Valid Mountain Array

> Given an array A of integers, return true if and only if it is a valid mountain array.

> Recall that A is a mountain array if and only if:

- `A.length >= 3`
- There exists some `i` with `0 < i < A.length - 1` such that:
  - `A[0] < A[1] < ... A[i-1] < A[i]`
  - `A[i] > A[i+1] > ... > A[B.length - 1]`
 

###### Example 1:
```
Input: [2,1]
Output: false
```
###### Example 2:
```
Input: [3,5,5]
Output: false
```
###### Example 3:
```
Input: [0,3,2,1]
Output: true
```

###### Note:
- `0 <= A.length <= 10000`
- `0 <= A[i] <= 10000 `
---
## Solution
```javascript
/**
 * @param {number[]} A
 * @return {boolean}
 */
var validMountainArray = function(A) {
  if(A.length < 3) return false;
  var max = Math.max(...A);
  var maxI = A.indexOf(max);
  if(maxI === A.length -1 || maxI === 0) return false;
  for(let i = 1 ; i < A.length - 1 ; i++) {
    
    if(i <= maxI && A[i-1] >= A[i]) return false;
    if(i >= maxI && A[i] <= A[i+1]) return false;
  }
  return true;
};
```
