## 162. Find Peak Element

> A peak element is an element that is greater than its neighbors.
> Given an input array nums, where nums[i] ≠ nums[i+1], find a peak element and return its index.
> The array may contain multiple peaks, in that case return the index to any one of the peaks is fine.
> You may imagine that nums[-1] = nums[n] = -∞.

###### Example 1:
```
Input: nums = [1,2,3,1]
Output: 2
Explanation: 3 is a peak element and your function should return the index number 2.
```

###### Example 2:
```
Input: nums = [1,2,1,3,5,6,4]
Output: 1 or 5 
Explanation: Your function can return either index number 1 where the peak element is 2, 
             or index number 5 where the peak element is 6.
```
## Solution

```javascript
/**
 * @param {number[]} nums
 * @return {number}
 */
 
// Approach 1: Linear Scan
var findPeakElement = function(nums) {
  for (var i = 0; i < nums.length - 1; i++) {
      if (nums[i] > nums[i + 1])
          return i;
  }
  return nums.length - 1;
};

// Approach 2: Recursive Binary Search
var findPeakElement = function(nums) {
  return search(nums, 0, nums.length - 1);
});

var search(nums, l, r) {
  if (l == r)
      return l;
  var mid = (l + r) / 2;
  if (nums[mid] > nums[mid + 1])
      return search(nums, l, mid);
  return search(nums, mid + 1, r);
}

// Approach 3: Iterative Binary Search
var findPeakElement = function(nums) {
  var l = 0, r = nums.length - 1;
  while (l < r) {
      const mid = (l + r) / 2;
      if (nums[mid] > nums[mid + 1])
          r = mid;
      else
          l = mid + 1;
  }
  return l;
}
```
