### Week 2.4. [Diameter of Binary Tree](https://leetcode.com/explore/challenge/card/30-day-leetcoding-challenge/529/week-2/3293/)
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
 * @return {number}
 */
var diameterOfBinaryTree = function(root) {
  return diameter(root);  
};

function height(node) { 
  /* base case tree is empty */
  if (node == null) 
    return 0; 

  /* If tree is not empty then height = 1 + max of left height and right heights */
  return (1 + Math.max(height(node.left), height(node.right))); 
}

function diameter(root) { 
  /* base case if tree is empty */
  if (root == null) 
      return 0; 

  const lheight = height(root.left); 
  const rheight = height(root.right); 

  const ldiameter = diameter(root.left); 
  const rdiameter = diameter(root.right); 

  return Math.max(lheight + rheight, Math.max(ldiameter, rdiameter)); 
} 
```
