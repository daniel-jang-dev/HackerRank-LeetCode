## [1476. Subrectangle Queries](https://leetcode.com/problems/subrectangle-queries/)

```typescript
// TYPESCRIPT
// Runtime: 124 ms, faster than 6.67%
// Memory Usage: 45.7 MB, less than 20.00%
class SubrectangleQueries {
  
    rectangle: number[][];
  
    constructor(rectangle: number[][]) {
      this.rectangle = rectangle;
    }

    updateSubrectangle(row1: number, col1: number, row2: number, col2: number, newValue: number): void {
      for(let i = row1; i <= row2; i++) {
        // FOR LOOP encountered TLE
        // for(let j = col1; j <= col2; j++) { 
        //   this.rectangle[i][j] = newValue;
        // }
        this.rectangle[i].fill(newValue, col1, col2 + 1);
      }
    }

    getValue(row: number, col: number): number {
      return this.rectangle[row][col];
    }
}
```

```python
# PYTHON 3
# Runtime: 196 ms, faster than 75.67%
# Memory Usage: 16 MB, less than 61.82%
class SubrectangleQueries:

    def __init__(self, rectangle: List[List[int]]):
        self.rectangle = rectangle

    def updateSubrectangle(self, row1: int, col1: int, row2: int, col2: int, newValue: int) -> None:
        for i in range(row1, row2 + 1):
          for j in range(col1, col2 + 1):
            self.rectangle[i][j] = newValue

    def getValue(self, row: int, col: int) -> int:
        return self.rectangle[row][col];        

```
