## 1529. [Bulb Switcher IV](https://leetcode.com/problems/bulb-switcher-iv/)
```javascript

/**
 * @param {string} target
 * @return {number}
 */
 
 // Javascript
var minFlips = function(target) {
  let count = 0;
  if(target[0] === '1') count++;
  for(let i = 0; i + 1 < target.length; i++) {
    if(target[i] !== target[i+1])
      count++;
  }
  return count;
};
```

```python
// Python
count=0
n=len(target)
if target[0]=='1':
  count+=1

for i in range(1,n):                                      
  if target[i]!=target[i-1]:
    count+=1

return count
```

```java
// JAVA
int n = target.length();        
char[] str = target.toCharArray();
    
int count = str[0] - '0';
    
for(int i = 1; i < n; i++)
  if(str[i] != str[i-1])
    count++;
         
return count;

```
