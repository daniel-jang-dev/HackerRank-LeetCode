### 682. [Baseball Game](https://leetcode.com/problems/baseball-game/)
```javascript
/**
 * @param {string[]} ops
 * @return {number}
 */
var calPoints = function(ops) {
  const stack = [];
  ops.forEach(c => {
    const last = stack.length - 1;
    switch(c) {
      case '+':
        stack.push(stack[last-1] + stack[last]);
        break;
      case 'D':
        stack.push(stack[last] * 2);
        break;
      case 'C':
        stack.pop();
        break;
      default:
        stack.push(Number(c));
    }
  });
  return stack.reduce((a,b) => a+b);
};
```
