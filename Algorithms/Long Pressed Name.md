## Leet Code 925. Long Pressed Name
> Your friend is typing his name into a keyboard.  Sometimes, when typing a character c, the key might get long pressed, 
> and the character will be typed 1 or more times. You examine the typed characters of the keyboard.  
> Return True if it is possible that it was your friends name, with some characters (possibly none) being long pressed.


##### Example 1:
```
Input: name = "alex", typed = "aaleex"
Output: true
Explanation: 'a' and 'e' in 'alex' were long pressed.
```
##### Example 2:
```
Input: name = "saeed", typed = "ssaaedd"
Output: false
Explanation: 'e' must have been pressed twice, but it wasn't in the typed output.
```
##### Example 3:
```
Input: name = "leelee", typed = "lleeelee"
Output: true
```
##### Example 4:
```
Input: name = "laiden", typed = "laiden"
Output: true
Explanation: It's not necessary to long press any character.
```

---
## Solution

```javascript
/**
 * @param {string} name
 * @param {string} typed
 * @return {boolean}
 */
var isLongPressedName = function(name, typed) {
  
  let arr1 = getArray(name);  
  let arr2 = getArray(typed);
  
  return arr1.every((obj, i) => {
    const target = arr2[i];
    return target && obj.key === target.key && obj.value <= target.value; 
  });
  
};

function getArray(str) {
  const arr = [];
  str.split('').forEach((v, i, a) => {
    
    const o = { key: v, value : 1 };
    if(i < 1) { 
      arr[0] = o;
    } else {
      if(v === a[i-1]) {
        arr[arr.length-1].value++;
      } else {
        arr.push(o);
      }
    }
  });
  return arr;
}
```
