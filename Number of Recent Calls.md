### 933. [Number of Recent Calls](https://leetcode.com/problems/number-of-recent-calls/)
```javascript

var RecentCounter = function() {
  this.pings = [];
};

/** 
 * @param {number} t
 * @return {number}
 */
RecentCounter.prototype.ping = function(t) {
  this.pings.push(t);
  
  while(t - this.pings[0] > 3000) {
    this.pings.shift();
  }
  return this.pings.length;
};

/** 
 * Your RecentCounter object will be instantiated and called as such:
 * var obj = new RecentCounter()
 * var param_1 = obj.ping(t)
 */
```
