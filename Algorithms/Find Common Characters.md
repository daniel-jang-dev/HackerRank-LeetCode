## 1002. Find Common Characters

Given an array A of strings made only from lowercase letters, return a list of all characters that show up in all strings within the list (including duplicates).  For example, if a character occurs 3 times in all strings but not 4 times, you need to include that character three times in the final answer.
You may return the answer in any order. 

##### Example 1:
```
Input: ["bella","label","roller"]
Output: ["e","l","l"]
```
##### Example 2:
```
Input: ["cool","lock","cook"]
Output: ["c","o"]
```
##### Note:
- 1 <= A.length <= 100
- 1 <= A[i].length <= 100
- A[i][j] is a lowercase letter

---
```
/**
 * @param {string[]} A
 * @return {string[]}
 */
var commonChars = function(A) {
  
    // Initiate Table
  const ch = 'abcdefghijklmnopqrstuvwxyz';
  const tb = {};
  ch.split('').forEach(c => {
    tb[c] = new Array(A.length);
    tb[c].fill(0);
  });
  
  // Populate Table
  A.forEach((str, index) => {
    helper(str, index, tb);
  });
  
  // Generate Answer
  const ans = [];
  Object.keys(tb).forEach(key => {
    const row = tb[key];
    if(row.every(n => n > 0)) {
      let count = Math.min(...row);
      while(count) {
        ans.push(key);
        count--;
      }
    }
  });
  return ans;
};

// Populate Table
function helper(str, index, tb) {
  str.split('').forEach(c => {
    tb[c][index]++;
  });
}
```
