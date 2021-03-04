## [825. Friends Of Appropriate Ages](https://leetcode.com/problems/friends-of-appropriate-ages/)
```javascript
// Runtime: 88 ms, faster than 81.82%
Memory Usage: 43.1 MB, less than 81.82%
/**
 * @param {number[]} ages
 * @return {number}
 */
var numFriendRequests = function(ages) {
    
    function willRequest(A, B) {
        return !(B <= A * 0.5 + 7 || B > A || (B > 100 && A < 100));
    }
    
    const map = {};
    ages.forEach(a => {
        map[a] = (map[a] || 0) + 1;
    });
    
    let ans = 0;
    for(let A = 120; A >= 1; A--) {
        const x = map[A];
        if (x == undefined) continue;
        for(let B = 120; B >= 1 ; B--) {
            const y = map[B];
            if (y == undefined) continue;
            if(willRequest(A, B)) {
                if(A == B) {
                    ans += x * (x - 1);
                } else {
                    ans += x * y;
                }
            }
        }
    }
    return ans;
};
```

```python
def numFriendRequests(self, ages):

    def request(a, b):
        return not (b <= 0.5 * a + 7 or b > a or b > 100 and a < 100)
        
    c = collections.Counter(ages)
    return sum(request(a, b) * c[a] * (c[b] - (a == b)) for a in c for b in c)
```
