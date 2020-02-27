## 1047. Remove All Adjacent Duplicates In String

Given a string S of lowercase letters, a duplicate removal consists of choosing two adjacent and equal letters, and removing them.
We repeatedly make duplicate removals on S until we no longer can.
Return the final string after all such duplicate removals have been made.  It is guaranteed the answer is unique.

###### Example 1:
```
Input: "abbaca"
Output: "ca"
Explanation: 
For example, in "abbaca" we could remove "bb" since the letters are adjacent and equal, and this is the only possible move.  The result of this move is that the string is "aaca", of which only "aa" is possible, so the final string is "ca".
```

##### Note:
* 1 <= S.length <= 20000
* S consists only of English lowercase letters.
---
```
/**
 * @param {string} S
 * @return {string}
 */
var removeDuplicates = function(S) {
  let res = { ans: S };
  do {
    res = helper(res.ans);
  } while(res.changed);

  return res.ans;
};

var helper = function(str) {
  let ans = str;
  let changed = false;
  for(let i=0; i+1 < ans.length; i++) {
    if(ans[i] === ans[i+1]) {
      ans = ans.slice(0, i) + ans.slice(i+2);
      i--;
      changed = true;
    }
  }
  return { ans, changed }
}
```
