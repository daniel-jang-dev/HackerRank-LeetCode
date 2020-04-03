## 495. [Teemo Attacking](https://leetcode.com/problems/teemo-attacking/)

```
/**
 * @param {number[]} timeSeries
 * @param {number} duration
 * @return {number}
 */
var findPoisonedDuration = function(timeSeries, duration) {
  
  if(!timeSeries.length) return 0;
  
  let poisonedTimeDuration = 0;
  for(let i = 0; i+1 < timeSeries.length; i++) {
    poisonedTimeDuration += Math.min(timeSeries[i+1]-timeSeries[i], duration);
  };
  poisonedTimeDuration += duration;
    
  return poisonedTimeDuration;
};
```
