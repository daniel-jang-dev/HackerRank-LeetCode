## [1315. Sum of Nodes with Even-Valued Grandparent](https://leetcode.com/problems/sum-of-nodes-with-even-valued-grandparent/)
```javascript
// Runtime: 96 ms, faster than 99.65%
// Memory Usage: 48.7 MB, less than 81.63%
/**
 * Definition for a binary tree node.
 * function TreeNode(val, left, right) {
 *     this.val = (val===undefined ? 0 : val)
 *     this.left = (left===undefined ? null : left)
 *     this.right = (right===undefined ? null : right)
 * }
 */
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
 * @return {number}
 */
var sumEvenGrandparent = function(root) {
    
    let sum = 0;
    
    function dp(node) {

        if(node.left) {
            acc(node, node.left);
        }

        if(node.right) {
            acc(node, node.right);
        }
    }
    
    function acc(prev, curr) {
        if(prev.val % 2 == 0) {
            if(curr.left) {
                sum += curr.left.val;
            }
            if(curr.right) {
                sum += curr.right.val;
            }                    
        }
        dp(curr);
    }

    dp(root);
    return sum;
};
```
