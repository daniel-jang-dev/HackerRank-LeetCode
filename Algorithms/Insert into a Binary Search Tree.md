### 701. [Insert into a Binary Search Tree](https://leetcode.com/problems/insert-into-a-binary-search-tree/)

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
var insertIntoBST = function(root, val) {
  
  const newOne = new TreeNode(val);
  if(!root) newOne;
  
  let ptr = root;
  let prev = root;
  let flag;
  while(ptr) {
    prev = ptr;
    if(ptr.val < val) {
      flag = 'right';
      ptr = ptr.right;
    } else if(ptr.val > val) {
      ptr = ptr.left;
      flag = 'left';
    }    
  }
  prev[flag] = newOne;
  return root;
};
```
