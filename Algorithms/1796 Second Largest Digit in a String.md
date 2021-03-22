## 1796. [Second Largest Digit in a String](https://leetcode.com/problems/second-largest-digit-in-a-string/)
```javascript
/**
 * @param {string} s
 * @return {number}
 */
var secondHighest = function(s) {
    let max = 9;
    while(max >= 0) {
        if(s.includes(max)) {
            let sc = max - 1;
            while(sc >= 0) {
                if(s.includes(sc)) {
                    return sc;
                } else {
                    sc--;
                }
            }
            break;
            
        } else {
            max--;
        }
    }
    return -1;
};
```
