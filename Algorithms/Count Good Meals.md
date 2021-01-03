## [1711. Count Good Meals](https://leetcode.com/problems/count-good-meals/)
```javascript
# Runtime: 328 ms, faster than 100.00%
# Memory Usage: 51.5 MB, less than 100.00%

var countPairs = function(deliciousness) {
  
    const m = 10**9 + 7;
    const powers = Array.from({length: 22}, (_, i) => 2**(21 - i) );
    console.log(powers);
    const history = {};
    let ans = 0;
    for (let i = 0; i < deliciousness.length; i++) {
        const e = deliciousness[i];
        for(let j = 0; j < powers.length; j++) {
            const p = powers[j];
            if(p < e) 
                break;
            if(history[p-e]) {
                ans = (ans + history[p-e]) % m;
            }
        }
        history[e] = (history[e] || 0) + 1;
    }
    return ans % m;
};

```
