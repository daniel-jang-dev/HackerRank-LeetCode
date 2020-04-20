### 938. [Range Sum of BST](https://leetcode.com/problems/range-sum-of-bst/)
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
 * @param {number} L
 * @param {number} R
 * @return {number}
 */

// # 1. recursion
var rangeSumBST = function(root, L, R) {
  let sum = 0;
  if(!root) return sum;
  const { val } = root;
  if(val >= L && val <= R)
    sum += val;
  return sum + rangeSumBST(root.left, L, R) + rangeSumBST(root.right, L, R);
};

// # 2. loop
var rangeSumBST = function(root, L, R) {
  
  let sum = 0;
  const stack = [root];
  
  while(stack.length) {
    const node = stack.pop();
    const { val } = node;
    if(val >= L && val <= R)
      sum += val;
    if(node.left) stack.push(node.left);
    if(node.right) stack.push(node.right);
  }
  return sum;
}
```
