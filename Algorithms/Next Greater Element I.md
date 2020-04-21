### 496. [Next Greater Element I](https://leetcode.com/problems/next-greater-element-i/)
```javascript
/**
 * @param {number[]} nums1
 * @param {number[]} nums2
 * @return {number[]}
 */
var nextGreaterElement = function(nums1, nums2) {
  const stack = [];
  const map = new Map();
  nums2.forEach(d => {
    while(stack[stack.length - 1] < d) {
      map.set(stack.pop(), d);
    }
    stack.push(d);
  });
  while(stack.length) {
    map.set(stack.pop(), -1);
  }
  return nums1.map(num => map.get(num));
};
```
