### 762. [Prime Number of Set Bits in Binary Representation](https://leetcode.com/problems/prime-number-of-set-bits-in-binary-representation/)
```javascript
/**
 * @param {number} L
 * @param {number} R
 * @return {number}
 */
var countPrimeSetBits = function(L, R) {
  // const dic = Array.from({ length: 22 }, () => []);
  let total = 0;
  const primes = [2, 3, 5, 7, 11, 13, 17, 19];
  for(let i = L; i <= R; i++) {
    const s = i.toString(2);
    const count = s.split('').filter(d => d == 1).length;
    if(primes.includes(count)) {
      total++;
    }
  }
  return total;
};
```
