### 2020 May 8th. [Check If It Is a Straight Line](https://leetcode.com/explore/challenge/card/may-leetcoding-challenge/535/week-2-may-8th-may-14th/3323/)
```javascript
/**
 * @param {number[][]} coordinates
 * @return {boolean}
 */
var checkStraightLine = function(coordinates) {

  const [x1, y1] = coordinates[0];
  const [x2, y2] = coordinates[1];
  
let slope;
  if(x2-x1) {
    slope = (y2-y1) / (x2-x1);
  } // else: undefined

  for(let i = 1; i+1 < coordinates.length; i++) {
    const [x1, y1] = coordinates[i];
    const [x2, y2] = coordinates[i+1];
    
    if(x2-x1) {
      if(slope !== (y2-y1) / (x2-x1)) {
        return false;
      }
    } else {
      if(slope !== undefined) {
        return false;
      }
    }
  }
  return true;
};

```
