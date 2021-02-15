## [628. Maximum Product of Three Numbers](https://leetcode.com/problems/maximum-product-of-three-numbers/)
```javascript
// Runtime: 140 ms, faster than 19.57%
// Memory Usage: 44.8 MB, less than 7.45%
/**
 * @param {number[]} nums
 * @return {number}
 */
var maximumProduct = function(nums) {
    nums.sort((a, b) => a - b);
    const po = nums.filter(e => e > 0);
    const ne = nums.filter(e => e < 0);

    const poL = po.length;
    const neL = ne.length;
    
    switch(poL) {

        case 0:
            return nums.includes(0) ? 0 : ne[neL - 1] * ne[neL - 2] * ne[neL - 3];
            
        case 1:
            return neL >= 2 ?  po[0] * ne[0] * ne[1] : 0;
            
        case 2:
            if(neL >= 2) {
                return po[1] * ne[0] * ne[1];
            } else if (neL == 1) {
                    return nums.includes(0) ? 0 : po[0] * po[1] * ne[0];
            } else {
                return 0;            
            }
            
        default:
            if(neL >= 2) {
                return po[poL-1] * Math.max(ne[0] * ne[1], po[poL-2] * po[poL-3]);
            } else {
                return po[poL-1] * po[poL-2] * po[poL-3];
            }
    }
    
};
```
