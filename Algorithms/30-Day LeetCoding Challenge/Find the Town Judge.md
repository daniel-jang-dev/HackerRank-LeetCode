### 2020 May 10th. [Find the Town Judge](https://leetcode.com/explore/challenge/card/may-leetcoding-challenge/535/week-2-may-8th-may-14th/3325/)
```javascript
/**
 * @param {number} N
 * @param {number[][]} trust
 * @return {number}
 */
var findJudge = function(N, trust) {
  
  if(trust.length == 0) 
    return N == 1 ? 1 : -1;
  
  const trusters = new Set(trust.map(e => e[0]));
  const trustees = [...new Set(trust.map(e => e[1]))];

  for(let i = 0; i < trustees.length; i++) {
    const t = trustees[i];
    if(!trusters.has(t) && trust.filter(e => e[1] == t).length == (N - 1))  {
     return t; 
    }
  }
  return -1;
};
```
