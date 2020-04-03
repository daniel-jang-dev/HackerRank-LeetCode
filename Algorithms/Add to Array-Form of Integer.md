### 989. [Add to Array-Form of Integer](https://leetcode.com/problems/add-to-array-form-of-integer/)
```
/**
 * @param {number[]} A
 * @param {number} K
 * @return {number[]}
 */
var addToArrayForm = function(A, K) {
  const a = BigInt(A.join(''));
  const b = BigInt(K);
  return String(a+b).split('');
};
```
