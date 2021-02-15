## [1038. Binary Search Tree to Greater Sum Tree](https://leetcode.com/problems/binary-search-tree-to-greater-sum-tree/)
```javascript
// Runtime: 80 ms, faster than 63.84%
// Memory Usage: 38.9 MB, less than 71.66%
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
 * @return {TreeNode}
 */
var bstToGst = function(root) {

    function df(arr, node, acc) {
        if(node == null) return;
        df(arr, node.right, acc);
        const v = node.val;
        node.val += acc.val;
        acc.val += v;
        df(arr, node.left, acc);
    }
    df([], root, { val: 0 });
    return root;
};
```
