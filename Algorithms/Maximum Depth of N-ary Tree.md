### 559. [Maximum Depth of N-ary Tree](https://leetcode.com/problems/maximum-depth-of-n-ary-tree/)
```javascript
/**
 * // Definition for a Node.
 * function Node(val,children) {
 *    this.val = val;
 *    this.children = children;
 * };
 */

/**
 * @param {Node} root
 * @return {number}
 */
function maxDepth(root){
  if(root == null) return null; // base case
  let max = 0;
  for(let child of root.children){ // Check for all children and find 
    max = Math.max(max, maxDepth(child)); // the maximum depth 
  }
  return max + 1;
}
```
