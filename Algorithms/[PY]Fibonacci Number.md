### 509. [Fibonacci Number](https://leetcode.com/problems/fibonacci-number/)
```python
class Solution:
  def fib(self, N: int) -> int:
    
    # Base Case:
    if N < 2:
      return N
    
    arr = [0, 1]
    
    # Induction Rule:
    for i in range(2, N+1):
      arr = [arr[-1], arr[-1] + arr[-2]]
    
    return arr[-1]
```
