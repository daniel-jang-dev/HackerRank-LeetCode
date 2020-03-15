## [Deepest Leaves Sum](https://leetcode.com/problems/deepest-leaves-sum/)

```
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
var deepestLeavesSum = function(root) {
  const dMap = {};
  inOrderHelper(root, dMap, 0);
  return outputHelper(dMap);
};
  
function inOrderHelper(node, map, depth) {
  if (node !== null) {
    inOrderHelper(node.left, map, depth+1);
    map[depth] = map[depth] || [];
    map[depth].push(node.val);
    inOrderHelper(node.right, map, depth+1);
  }
}

function outputHelper(map) {
  const arr = Object.keys(map).map(s => Number(s));
  const maxDepth = String(Math.max(...arr));
  return map[maxDepth].reduce((a, b) => a + b);
}
```
