## [832. Flipping an Image](https://leetcode.com/problems/flipping-an-image/)
```typescript
// TYPESCRIPT
// Runtime 84 ms, faster than 95.60%
// Memory Usage: 40.9 MB, less than 41.76%
function flipAndInvertImage(A: number[][]): number[][] {
  return A.map((row: number[]) => {
    const rRow = [];
    for(let j = row.length - 1; j >= 0; j--) {
      rRow.push(1 - row[j]);
    }
    return rRow;
  });
}
```

```python
# PYTHON 3
# Runtime: 48 ms, faster than 98.46%
# Memory Usage: 14.1 MB, less than 86.64%
class Solution:
    def flipAndInvertImage(self, A: List[List[int]]) -> List[List[int]]:
      result = []
      for row in A:
        result.append(list(map(lambda x: 1 - x, reversed(row))))
      return result
```
