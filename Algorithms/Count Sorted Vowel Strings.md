## [1641. Count Sorted Vowel Strings](https://leetcode.com/problems/count-sorted-vowel-strings/submissions/)
```python
# Runtime: 28 ms, faster than 91.57%
# Memory Usage: 13.9 MB, less than 99.90% 

class Solution:
    def countVowelStrings(self, n: int) -> int:
        a, b, c, d, e = 1, 1, 1, 1, 1
        n -= 1
        while(n) :
            a, b, c, d, e = a, a+b, a+b+c, a+b+c+d, a+b+c+d+e
            n-= 1
        return a+b+c+d+e
```
