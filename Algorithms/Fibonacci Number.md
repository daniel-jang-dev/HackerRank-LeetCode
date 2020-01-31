### 509. Fibonacci Number

The Fibonacci numbers, commonly denoted F(n) form a sequence, called the Fibonacci sequence, such that each number is the sum of the two preceding ones, starting from 0 and 1. That is,
```
F(0) = 0,   F(1) = 1
F(N) = F(N - 1) + F(N - 2), for N > 1.
```
Given N, calculate F(N).


---
```
/**
 * @param {number} N
 * @return {number}
 */
var fib = function(N) {
    const arr = [0, 1];
    if(N <2) return arr[N];
    for(let i = 2 ; i <= N ; i++) {
        arr[i] = arr[i-2] + arr[i-1];
    }
    return arr[N];
};
```
