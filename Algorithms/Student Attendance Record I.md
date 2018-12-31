## LeetCode 551. Student Attendance Record I
> You are given a string representing an attendance record for a student. The record only contains the following three characters:

1. `A` : Absent.
2. `L` : Late.
3. `P` : Present.

> A student could be rewarded if his attendance record doesn't contain `more than one A (absent)` or `more than two continuous L (late)`.

You need to return whether the student could be rewarded according to his attendance record.

###### Example 1:
```
Input: "PPALLP"
Output: True
```
###### Example 2:
```
Input: "PPALLL"
Output: False
```

---
## Solution
```javascript
/**
 * @param {string} s
 * @return {boolean}
 */
var checkRecord = function(s) {
  if (s.split('').filter(c => c === 'A').length > 1) return false;
  for (let i = 1; i < s.length-1 ; i++) {
    if(s[i-1] === 'L' && s[i] === 'L' && s[i+1] === 'L') return false;
  }
  return true;
};
```
