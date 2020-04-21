### 113. [Path Sum II](https://leetcode.com/problems/path-sum-ii/)
```javascript
/**
 * Definition for a binary tree node.
 * function TreeNode(val) {
 *     this.val = val;
 *     this.left = this.right = null;
 * }
 */
/**
 * @param {TreeNode} root
 * @param {number} sum
 * @return {number[][]}
 */
var pathSum = function(root, sum) {
  ans = [];
  dfs(root, sum, []);
  return ans;
};

let ans;

function dfs(node, sum, arr) {
  if(!node) return;
  
  sum -= node.val;
  const newArr = [...arr, node.val];
  if(!node.left && !node.right) {
    if(sum == 0) {
      ans.push(newArr);
    }
    return;
  }
  
  dfs(node.left,  sum, newArr);
  dfs(node.right, sum, newArr);
}
```
