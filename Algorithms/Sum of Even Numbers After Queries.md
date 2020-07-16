## 985. [Sum of Even Numbers After Queries](https://leetcode.com/problems/sum-of-even-numbers-after-queries/)

```javascript
var sumEvenAfterQueries = function(A, queries) {
  
  let evenSum = A.reduce((acc, cur) => cur % 2 ? acc : acc + cur, 0);
  const ans = [];
  
  queries.forEach(([v, i]) => {
    if(A[i] % 2 === 0) {
      evenSum -= A[i];
    }
    A[i] += v;
    if(A[i] % 2 === 0) {
     evenSum += A[i];
   }
    ans.push(evenSum);
  });

   return ans;
};

```
