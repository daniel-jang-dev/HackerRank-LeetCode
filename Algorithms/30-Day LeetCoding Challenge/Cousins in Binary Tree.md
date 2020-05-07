### 2020 May 7th. [Cousins in Binary Tree](https://leetcode.com/explore/challenge/card/may-leetcoding-challenge/534/week-1-may-1st-may-7th/3322/)
```javascript
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
 * @param {number} x
 * @param {number} y
 * @return {boolean}
 */
var isCousins = function(root, x, y) {

  const map = {};
  
  function bfs(node, prev, val, depth) {
    
    if(node.val == val) {
      map[node.val] = [ prev.val, depth ];
      return;
    }
    
    if(node.left) {
      bfs(node.left, node, val, depth + 1);
    }
    if(node.right) {
      bfs(node.right, node, val, depth + 1);
    }
  }
  
  bfs(root, '', x, 0);
  bfs(root, '', y, 0);

  return map[x][0] !== map[y][0] && map[x][1] === map[y][1];
};




```
