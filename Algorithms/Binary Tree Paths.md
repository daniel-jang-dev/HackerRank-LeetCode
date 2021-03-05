## [257. Binary Tree Paths](https://leetcode.com/problems/binary-tree-paths/)
```javascript
// Runtime: 84 ms, faster than 73.08%
// Memory Usage: 40.6 MB, less than 14.47%
/**
 * Definition for a binary tree node.
 * function TreeNode(val, left, right) {
 *     this.val = (val===undefined ? 0 : val)
 *     this.left = (left===undefined ? null : left)
 *     this.right = (right===undefined ? null : right)
 * }
 */
/**
 * @param {TreeNode} root
 * @return {string[]}
 */
var binaryTreePaths = function(root) {
    
    function path(node, arr, str) {
        
        if(!node) return;
        str += (str === '' ? '' : '->') + node.val;
        
        if(!node.left && !node.right) {
            arr.push(str);
            return;
        }
        path(node.left, arr, str);
        path(node.right, arr, str);
    }
    
    const ans = [];
    path(root, ans, '');
    return ans;
};
```
