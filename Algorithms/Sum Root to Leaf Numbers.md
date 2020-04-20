### 129. [Sum Root to Leaf Numbers](https://leetcode.com/problems/sum-root-to-leaf-numbers/)
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
 * @return {number}
 */
 
// # 1. Long version
 
var sumNumbers = function(root) {
  const arr = [];
  if(!root) return null;
  dfs(root, 0, arr);
  return arr.reduce((a,b)=>a+b);
};
function dfs(node, num, arr) {
  if(!node) return;
  let { val } = node;
  val = num * 10 + val;
  if(!node.left && !node.right) {
    arr.push(val);
    return;
  };
  dfs(node.left, val, arr);
  dfs(node.right, val, arr);
}

// # 2. Short version
function sumNumbers(node, sum = 0) {

  if(!node) return 0;
  const newV = sum * 10 + node.val;
  // base case
  if(!node.left && !node.right) return newV;
  
  return sumNumbers(node.left, newV) + sumNumbers(node.right, newV);
};
```
