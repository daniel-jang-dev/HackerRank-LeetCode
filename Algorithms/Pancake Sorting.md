## [969. Pancake Sorting](https://leetcode.com/problems/pancake-sorting/)
```javascript
// Runtime: 160 ms, faster than 5.13%
// Memory Usage: 43.7 MB, less than 10.26%
/**
 * @param {number[]} arr
 * @return {number[]}
 */
var pancakeSort = function(arr) {

    function partiallyRevserse(a, i) {
        return [...a.slice(0, i).reverse(), ...a.slice(i)];
    }
    
    const ans = [];
    let x = arr.length;
    while(x > 0) {
        const i = arr.indexOf(x);
        
        if (i != x - 1) {
            if(i > 0) {
                ans.push(i+1);
                arr = partiallyRevserse(arr, i+1);
            }
            ans.push(x);
            arr = partiallyRevserse(arr, x);
        }
        x--;
    }
    return ans;
};
```
