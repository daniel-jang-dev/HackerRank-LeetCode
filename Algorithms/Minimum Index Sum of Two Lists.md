## [599. Minimum Index Sum of Two Lists](https://leetcode.com/problems/minimum-index-sum-of-two-lists/)
```javascript
// Runtime: 142 ms, faster than 18.05% 
// Memory Usage: 44.7 MB, less than 89.89%
/**
 * @param {string[]} list1
 * @param {string[]} list2
 * @return {string[]}
 */
var findRestaurant = function(list1, list2) {
    
    let min = null, ids = [];
    
    list1.forEach((r1, i) => {
        list2.forEach((r2, j) => {
            if(r1 == r2) {
                if(min == null) {
                    min = i + j;
                    ids.push(i);
                } else {
                    if(min > i + j) {
                        min = i + j;
                        ids = [i];
                    } else if (min == i + j) {
                        ids.push(i);
                    }
                }
           }
        });
    });
    return ids.map(i => list1[i]);
};
```

