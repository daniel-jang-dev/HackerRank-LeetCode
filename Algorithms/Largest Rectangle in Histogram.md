## [84. Largest Rectangle in Histogram](https://leetcode.com/problems/largest-rectangle-in-histogram/)
```typescript
TYPESCRIPT
// # 1. Brute force // 
// Runtime: 920 ms, faster than 16.67%
// Memory Usage: 40.2 MB, less than 100.00%
function largestRectangleArea(heights: number[]): number {

  let maxArea = 0;
  const len = heights.length;
  
  for(let i = 0; i < len; i++) {
    let minHeight = heights[i];
    for(let j = i; j < len; j++) {
      minHeight = Math.min(minHeight, heights[j]);
      const currentArea = (j - i + 1) * minHeight;
      maxArea = Math.max(maxArea, currentArea);
    }
  }
  return maxArea;
};
```

```python
PYTHON 3
// # 1. Brute force 
// Time Limit Exceeded
class Solution:
    def largestRectangleArea(self, heights: List[int]) -> int:
        
        max_area = 0
        
        for i in range(len(heights)):
          min_height = heights[i]
          for j in range(i, len(heights)):
            min_height = min(min_height, heights[j])
            current_area = (j - i + 1) * min_height
            max_area = max(max_area, current_area)
            
        return max_area
        
```
