## 1560. [Most Visited Sector in a Circular Track](https://leetcode.com/problems/most-visited-sector-in-a-circular-track/)

> Runtime: 84 ms, faster than 91.22% of JavaScript online submissions for Most Visited Sector in a Circular Track.
>
> Memory Usage: 39.3 MB, less than 20.27% of JavaScript online submissions for Most Visited Sector in a Circular Track.

```javascript
/**
 * @param {number} n
 * @param {number[]} rounds
 * @return {number[]}
 */
var mostVisited = function(n, rounds) {
  let round = 0;
  for(let i = 1; i < rounds.length; i++) {
    if(rounds[i-1] % n > rounds[i] % n) {
      round++;
      rounds[i] += n * round;
    }
  }
  const last = rounds.pop();
  const r = last % n;
  const q = (last - r)/ n;
  const arr = [];
  for(let i = 0; i < n; i++) {
    arr[i] = q;
    if(i < r) arr[i]++;
    if(i + 1 < rounds[0]) arr[i]--;
  }
  const max = Math.max(...arr);
  const ans = [];
  arr.forEach((v, i) => {
    if(v == max) ans.push(i+1);
  });
  return ans;
};
```
