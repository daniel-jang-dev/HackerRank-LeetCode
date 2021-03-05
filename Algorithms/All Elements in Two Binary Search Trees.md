## [1305. All Elements in Two Binary Search Trees](https://leetcode.com/problems/all-elements-in-two-binary-search-trees/)
```javascript
// Runtime: 184 ms, faster than 87.31%
// Memory Usage: 49.9 MB, less than 63.85%

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
 * @return {number[]}
 */
var getAllElements = function(root1, root2) {
    const a1 = [];
    const a2 = [];
    
    function inOrder(node, arr) {
        if(node == undefined) return;
        inOrder(node.left, arr);
        arr.push(node.val);
        inOrder(node.right, arr);
    }
    inOrder(root1, a1);
    inOrder(root2, a2);

    const ans = [];
    const l1 = a1.length;
    const l2 = a2.length;
    let i = 0, j = 0;
    
    while( i < l1 || j < l2) {
        if(i == l1) {
            ans.push(a2[j]);
            j++;
        } else if ( j == l2) {
            ans.push(a1[i]);
            i++;
        } else {
            const x = a1[i];
            const y = a2[j];
            if(x < y) {
                ans.push(x);
                i++;
            } else if (x > y) {
                ans.push(y);
                j++;
            } else {
                ans.push(x, y);
                i++;
                j++;
            }            
        }
    }
    return ans;
};
```
