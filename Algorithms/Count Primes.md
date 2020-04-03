#### 204. [Count Primes](https://leetcode.com/problems/count-primes/)

```javascript
/**
 * @param {number} n
 * @return {number}
 */
var countPrimes = function(n) {
  
  // The Sieve of Eratosthenes
  const isPrime = [];
  for(let i = 2; i < n; i++) {
    isPrime[i] = true;
  }
  
  for(let i = 2; i * i < n ;i++) {
    if(!isPrime[i]) continue;
    for(let j = i * i; j < n; j += i) {
      isPrime[j] = false;
    }
  }
  
  return isPrime.filter(e => e == true).length;
  
};
```
