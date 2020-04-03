#### 1003. [Check If Word Is Valid After Substitutions](https://leetcode.com/problems/check-if-word-is-valid-after-substitutions/)


```
/**
 * @param {string} S
 * @return {boolean}
 */
var isValid = function(S) {
  
  const arr = S.split('');
  let deleted;
  do {
    deleted = false;
    for(let i = 0; i+2 < arr.length; i++) {
      if(arr[i]=='a' && arr[i+1]=='b' && arr[i+2]=='c') {
        arr.splice(i, 3);
        i -= 3;
        deleted = true;
      }
    }
  } while(deleted);
  
  return arr.length == 0;
};
```
