### [Reducing Dishes](https://leetcode.com/problems/reducing-dishes/)
```javascript
/**
 * @param {number[]} satisfaction
 * @return {number}
 */
var maxSatisfaction = function(satisfaction) {
  
  // No dish is prepared
  if(satisfaction.every(e => e <= 0)) 
    return 0;
  
  const arr = [...satisfaction].sort((a,b) => a-b);
  const points = [];
  while(arr.length) {
    let point = 0;
    arr.forEach((v, i) => {
      point += v * (i+1);
    });
    points.push(point);
    arr.shift();
  }
  return Math.max(...points);
};
```
