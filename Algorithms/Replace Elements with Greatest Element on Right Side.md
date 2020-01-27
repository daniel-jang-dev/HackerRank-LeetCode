1299.
Given an array arr, replace every element in that array with the greatest element among the elements to its right, and replace the last element with -1.

After doing so, return the array.

```
/**
 * @param {number[]} arr
 * @return {number[]}
 */
var replaceElements = function(arr) {
    
    const ans = [];
    
    for(let i = 1 ; i < arr.length; i++) {
        ans.push(findMax(arr.slice(i)))
    }
    ans.push(-1);
    return ans;
};


var findMax = function(arr) {
    
    let max = arr[0];
    for(let i = 1 ; i < arr.length ; i++) {
        if(max < arr[i]) {
            max = arr[i];
        }
    }
    return max;
};
```
