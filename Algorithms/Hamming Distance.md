## Hamming Distance
The Hamming distance between two integers is the number of positions at which the corresponding bits are different.

Given two integers x and y, calculate the Hamming distance.

Note:
0 ≤ x, y < 2<sup>31</sup>.

###### Example:
```
Input: x = 1, y = 4

Output: 2

Explanation:
1   (0 0 0 1)
4   (0 1 0 0)
       ↑   ↑

The above arrows point to positions where the corresponding bits are different.
```

---
```
/**
 * @param {number} x
 * @param {number} y
 * @return {number}
 */
var hammingDistance = function(x, y) {
  
  const a1 = helper(x);
  const a2 = helper(y);
  return a1.filter((v, i) => v != a2[i]).length;  
};

var helper = function(num) {
  const arr = Array.from({length: 32}, () => 0);
    
  let i = 0;
  while(num) {
    if(num % 2 == 1) arr[i] = 1;
    num = Math.floor(num / 2);
    i++;
  }  
  return arr.reverse();
}
```
