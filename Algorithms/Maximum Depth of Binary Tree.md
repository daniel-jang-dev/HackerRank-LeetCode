### [Maximum Depth of Binary Tree](https://leetcode.com/explore/featured/card/recursion-i/256/complexity-analysis/2375/)
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
var maxDepth = function(root) {
  const ans = {max: 0};
  backtrack(root, 0, ans);
  return ans.max;
};

function backtrack(node, count, ans) {
  if(!node) {
    if(count > ans.max) {
      ans.max = count;
    }
    return;
  }
  backtrack(node.left, count + 1, ans);
  backtrack(node.right, count + 1, ans);
}
```
