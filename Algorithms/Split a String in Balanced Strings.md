Balanced strings are those who have equal quantity of 'L' and 'R' characters.

Given a balanced string s split it in the maximum amount of balanced strings.

Return the maximum amount of splitted balanced strings.


```
/**
 * @param {string} s
 * @return {number}
 */
var balancedStringSplit = function(s) {
    let counter = 0;
    let ans = 0;
    
    for(let c of s) {
        
        if(c === "R") 
            counter++;
        else
            counter--;
        
        if(counter === 0)
            ans++;
    }
    return ans;
};
```
