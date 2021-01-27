## [1734. Decode XORed Permutation](https://leetcode.com/problems/decode-xored-permutation/)
```javascript
// Runtime: 528 ms, faster than 7.14%
// Memory Usage: 90.5 MB, less than 7.14%
/**
 * @param {number[]} encoded
 * @return {number[]}
 */
var decode = function(encoded) {
    const m = encoded.length;
    const n = m + 1;
    let a = 1;
    let k = 2;
    while(k <= n) {
        a ^= k;
        k++;
    }
    for(let i = 1; i < m; i +=2) {
        a ^= encoded[i];
    }
    const res = [a];
    for(let i = 0; i < m; i++) {
        res[i+1] = res[i] ^ encoded[i];
    }
    return res;
};
```

```python
# Runtime: 1140 ms, faster than 69.65%
# Memory Usage: 33.8 MB, less than 49.50%
class Solution:
    def decode(self, encoded: List[int]) -> List[int]:
        m = len(encoded)
        n = m + 1
        a = 1
        k = 2
        while(k <= n):
            a = a ^ k
            k = k + 1
            
        for i in range(1, m, 2):
            a = a ^ encoded[i]
            
        res = [a]
        for i in range(0, m):
            res.append(res[i] ^ encoded[i])
        
        return res
```
