### Week 2.7. [Last Stone Weight](https://leetcode.com/explore/challenge/card/30-day-leetcoding-challenge/529/week-2/3297/)
```javascript
/**
 * @param {number[]} stones
 * @return {number}
 */
var lastStoneWeight = function(stones) {
  
  const sorted = stones.sort((a, b)=> b - a);
  
  while(sorted.length > 1) {

    const diff = sorted[0] - sorted[1];
    sorted.splice(0, 2); // Delete first 2 items
    
    if(diff != 0) {
      let inserted = false;
      for(let i = 0; i < sorted.length; i++) {
        if(diff >= sorted[i]) {
          sorted.splice(i, 0, diff);
          inserted = true;
          break;
        }
      }
      if(!inserted)
        sorted.push(diff);
    }
  }
  return sorted[0] || 0;
};
```
