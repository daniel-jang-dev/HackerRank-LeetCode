## [654. Maximum Binary Tree](https://leetcode.com/problems/maximum-binary-tree/)

```typescript
// Runtime: 136 ms, faster than 25.00%
// Memory Usage: 46.1 MB, less than 41.67%

/**
 * Definition for a binary tree node.
 * class TreeNode {
 *     val: number
 *     left: TreeNode | null
 *     right: TreeNode | null
 *     constructor(val?: number, left?: TreeNode | null, right?: TreeNode | null) {
 *         this.val = (val===undefined ? 0 : val)
 *         this.left = (left===undefined ? null : left)
 *         this.right = (right===undefined ? null : right)
 *     }
 * }
 */

function constructMaximumBinaryTree(nums: number[]): TreeNode | null {
    
    const n = nums.length;
    if(n == 0) return null;
    
    let idx = 0, max = 0;
    
    for(let i = 0; i < n; i++) {
        if(max < nums[i]) {
            max = nums[i];
            idx = i;
        }
    }
    const node = new TreeNode(max);
    node.left  = constructMaximumBinaryTree(nums.slice(0, idx));
    node.right = constructMaximumBinaryTree(nums.slice(idx + 1));
    
    return node;
};
```
