## [1287. Element Appearing More Than 25% In Sorted Array](https://leetcode.com/problems/element-appearing-more-than-25-in-sorted-array/)
```javascript
// Runtime: 68 ms, faster than 99.23% of JavaScript
// Memory Usage: 39.6 MB, less than 62.69% of JavaScript
/**
 * @param {number[]} arr
 * @return {number}
 */
var findSpecialInteger = function(arr) {
    
    const qLen = arr.length / 4;
    
    for(let i = 0; i < arr.length; i++) {
        if(arr[i] == arr[i+qLen]) return arr[i];
    }
    
};
```

```python
# Runtime: 104 ms, faster than 22.20% of Python3
# Memory Usage: 15.5 MB, less than 54.44%
class Solution:
    def findSpecialInteger(self, arr: List[int]) -> int:
        q = len(arr) / 4
        for i in range(len(arr)):
            if(arr[i] == arr[i+q]):
                return arr[i]
```
