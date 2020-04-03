### 700. [Search in a Binary Search Tree](https://leetcode.com/problems/search-in-a-binary-search-tree/)
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
 * @param {number} val
 * @return {TreeNode}
 */
var searchBST = function(root, val) {
    
  if(!root) return null;
  
  let ptr = root;
  
  while(ptr) {
    if(ptr.val == val)
      return ptr;
    else if(ptr.val < val)
      ptr = ptr.right;
    else 
      ptr = ptr.left;
  }
  return null;
};
```
