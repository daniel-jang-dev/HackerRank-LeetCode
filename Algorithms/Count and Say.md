## [38. Count and Say](https://leetcode.com/problems/count-and-say/)
```javascript
// Runtime: 88 ms, faster than 49.07% 
// Memory Usage: 40.9 MB, less than 50.00%
/**
 * @param {number} n
 * @return {string}
 */
var countAndSay = function(n) {
    const m = ['1', '11', '21', '1211'];
    if(n <= 4) return m[n-1];
    let k = 5
    while(k <= n) {
        var word = m[m.length-1];
        var count = 1, next = '';
        for(let i = 1; i < word.length; i++) {
            if(word[i-1] == word[i]) {
                count++;
            } else {
                next += count + word[i-1];
                count = 1;
            }
            if(i == word.length-1) {
              next += count + word[i];  
            }
        }
        m.push(next);
        k++;
    }
    return m[m.length-1];
};
```
