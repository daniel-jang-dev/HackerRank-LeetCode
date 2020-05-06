### 1436. [Destination City](https://leetcode.com/problems/destination-city/)
```javascript
/**
 * @param {string[][]} paths
 * @return {string}
 */
var destCity = function(paths) {
  const cities = {};
  for(let i = 0; i < paths.length; i++) {
    const [ fromCity, toCity ] = paths[i];
    
    console.log(fromCity, toCity);
    if(cities[fromCity] == undefined) {
      cities[fromCity] = 1;
    } else {
      cities[fromCity]++;
    }
    
    if(cities[toCity] == undefined) {
      cities[toCity] = -1;
    } else {
      cities[toCity]--;
    }
  }

  return Object.entries(cities).find(e => e[1] == -1)[0];
};
```

```python
class Solution:
    def destCity(self,x):
        source=set()
        dest=set()
        for i in range(len(x)):
            source.add(x[i][0])
            dest.add(x[i][1])
        return (dest-source).pop()
```
