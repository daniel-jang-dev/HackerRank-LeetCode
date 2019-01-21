## 977. Squares of a Sorted Array
---
> Given an array of integers A sorted in non-decreasing order, return an array of the squares of each number, also in sorted non-decreasing order.

 

###### Example 1:
```
Input: [-4,-1,0,3,10]
Output: [0,1,9,16,100]
```
###### Example 2:
```
Input: [-7,-3,2,3,11]
Output: [4,9,9,49,121]
```

---
### Solution
```js
/**
 * @param {number[]} A
 * @return {number[]}
 */
var sortedSquares = function(A) {
    return A.map(e => Math.pow(e,2)).sort((a, b) => a-b);
};
```
