## [1491. Average Salary Excluding the Minimum and Maximum Salary](https://leetcode.com/problems/average-salary-excluding-the-minimum-and-maximum-salary/)
```javascript
// Runtime: 72 ms, faster than 90.71%
// Memory Usage: 38.5 MB, less than 58.33%
/**
 * @param {number[]} salary
 * @return {number}
 */
var average = function(salary) {
    
    let sum = 0, min = 10 ** 6, max = 10**3, l = salary.length;
    for(let i = 0 ; i < l; i++) {
        const s = salary[i];
        sum += s;
        min = Math.min(min, s);
        max = Math.max(max, s);
    }
    return ((sum - max - min) / (l - 2)).toFixed(5);
};
```

```python
# Runtime: 24 ms, faster than 96.68%
# Memory Usage: 14.1 MB, less than 71.75%
class Solution:
    def average(self, salary: List[int]) -> float:
        
        sum = 0
        minV = 10**6
        maxV = 10**3
        l = len(salary)
        
        for s in salary:
            sum += s
            minV = min(minV, s)
            maxV = max(maxV, s)
            
        a = (sum - minV - maxV) / (l - 2)
        return float("%0.5f"%a)
        
```

```python

def average(self, salary: List[int]) -> float:
    # Solution 1
    salary.remove(max(salary))
    salary.remove(min(salary))
    return sum(salary)/len(salary)

    # Solution 2
    salary.sort()
    salary = salary[1:-1]
    return sum(salary)/len(salary)

    # Solution 3
    salary = sorted(salary)[1:-1]
    return sum(salary)/len(salary)

    # Solution 4
    return (sum(salary) - max(salary) - min(salary)) / (len(salary) - 2)
```
