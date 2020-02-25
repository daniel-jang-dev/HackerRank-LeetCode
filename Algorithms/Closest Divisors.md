## 1362. Closest Divisors

Given an integer num, find the closest two integers in absolute difference whose product equals num + 1 or num + 2.

Return the two integers in any order.

 

###### Example 1:
```
Input: num = 8
Output: [3,3]
Explanation: For num + 1 = 9, the closest divisors are 3 & 3, for num + 2 = 10, the closest divisors are 2 & 5, hence 3 & 3 is chosen.
```
###### Example 2:
```
Input: num = 123
Output: [5,25]
```
###### Example 3:
```
Input: num = 999
Output: [40,25]
```

##### Constraints:

* 1 <= num <= 10<sup>9</sup>

---
```
/**
 * @param {number} num
 * @return {number[]}
 */
var closestDivisors = function(num) {
  const ans = {};
  helper(num + 1, ans);
  helper(num + 2, ans);
  return ans[Math.min(...Object.keys(ans))];
};

var helper = function(num, ans) {
  for(let i = Math.floor(Math.sqrt(num)); i >= 1; i--) {
    if(num % i === 0) {
      const diff = Math.abs(num / i - i);
      ans[diff] = [i, num / i];
      break;
    }
  }
}
```
