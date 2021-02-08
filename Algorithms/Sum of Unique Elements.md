## [1748. Sum of Unique Elements](https://leetcode.com/problems/sum-of-unique-elements/)
```javascript
// Runtime: 80 ms, faster than 100%
// Memory Usage: 41 MB, less than 100%
/**
 * @param {number[]} nums
 * @return {number}
 */
var sumOfUnique = function(nums) {
    const map =  {};
    nums.forEach(n => {
        map[n] = map[n] ? map[n] + 1 : 1;
    });
    let ans = 0;
    Object.keys(map).forEach(key => {
        if(map[key] == 1) {
            ans += Number(key);
        }
    });
    return ans;
};
```

```python
def sumOfUnique(self, A):
    return sum(a for a, c in collections.Counter(A).items() if c == 1)
```
