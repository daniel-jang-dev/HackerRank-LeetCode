## [617. Merge Two Binary Trees](https://leetcode.com/problems/merge-two-binary-trees/)
```javascript
// Runtime: 108 ms, faster than 92.97% 
// Memory Usage: 45.9 MB, less than 94.96%
/**
 * Definition for a binary tree node.
 * function TreeNode(val, left, right) {
 *     this.val = (val===undefined ? 0 : val)
 *     this.left = (left===undefined ? null : left)
 *     this.right = (right===undefined ? null : right)
 * }
 */
/**
 * @param {TreeNode} root1
 * @param {TreeNode} root2
 * @return {TreeNode}
 */
var mergeTrees = function(root1, root2) {
    
    if(!root1 && !root2) return null;
    
    function dp(node1, node2, node) {
        /* VAL */
        node.val = (node1 ? node1.val : 0) + (node2 ? node2.val : 0);
        /* LEFT */
        if(node1 && node1.left || node2 && node2.left) {
            node.left = new TreeNode();
            dp(node1 ? node1.left  : null, node2 ? node2.left  : null, node.left );
        }
        /* RIGHT */
        if(node1 && node1.right || node2 && node2.right) {
            node.right = new TreeNode();
            dp(node1 ? node1.right : null, node2 ? node2.right : null, node.right);
        }
    }
    
    let ans = new TreeNode();
    dp(root1, root2, ans);
    return ans;
};
```
