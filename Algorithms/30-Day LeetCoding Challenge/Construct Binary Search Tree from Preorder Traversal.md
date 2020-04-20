### Week 3.6. [Construct Binary Search Tree from Preorder Traversal](https://leetcode.com/explore/challenge/card/30-day-leetcoding-challenge/530/week-3/3305/)
```javascript
/**
 * Definition for a binary tree node.
 * function TreeNode(val) {
 *     this.val = val;
 *     this.left = this.right = null;
 * }
 */
/**
 * @param {number[]} preorder
 * @return {TreeNode}
 */
var bstFromPreorder = function(preorder) {
  
  const head = new TreeNode(preorder[0]);
  for(let i = 1; i < preorder.length; i++) {
    generateBST(head, preorder[i]);
  }
  return head;
  
};

function generateBST(node, val) {
  if(val < node.val) {
    if(node.left) {
      generateBST(node.left, val);
    } else {
      node.left = new TreeNode(val);
    } 
  } else {
    if(node.right) {
      generateBST(node.right, val);
    } else {
      node.right = new TreeNode(val);
    } 
  }
}
```
