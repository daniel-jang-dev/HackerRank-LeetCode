## 137. Single Number II

Given a non-empty array of integers, every element appears three times except for one, which appears exactly once. Find that single one.

##### Note:

Your algorithm should have a linear runtime complexity. Could you implement it without using extra memory?

###### Example 1:
```
Input: [2,2,3,2]
Output: 3
```
###### Example 2:
```
Input: [0,1,0,1,0,1,99]
Output: 99
```
---
```
/**
 * @param {number[]} nums
 * @return {number}
 */
var singleNumber = function(nums) {
  const map = {};
  nums.forEach(n => {
    if(map[n]) map[n]++;
    else map[n] = 1;
  });
  
  return Object.keys(map).find(key => map[key] === 1);
};
```
