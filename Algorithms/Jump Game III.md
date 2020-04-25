### 1306. [Jump Game III](https://leetcode.com/problems/jump-game-iii/)
```javascript
/**
 * @param {number[]} arr
 * @param {number} start
 * @return {boolean}
 */
var canReach = function(arr, start) {
  let ans = false;
  const visited = {};
  
  function jump(a, i) {
    if(a[i] == undefined) return;
    while(!visited[i]) {
      visited[i] = true;
      const v = a[i];
      if(v == 0) {
        ans = true;
        return; 
      }
      jump(a, i - v);
      jump(a, i + v);
    }
  }
  jump(arr, start);
  return ans;
};
```
