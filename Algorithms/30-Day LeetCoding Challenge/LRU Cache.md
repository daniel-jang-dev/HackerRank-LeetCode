### Week 4.3. [LRU Cache](https://leetcode.com/explore/challenge/card/30-day-leetcoding-challenge/531/week-4/3309/)
```javascript
/**
 * @param {number} capacity
 */
var LRUCache = function(capacity) {
  this.map = {};
  this.queue = [];
  this.capacity = capacity;
};

/** 
 * @param {number} key
 * @return {number}
 */
LRUCache.prototype.get = function(key) {
  if(this.map[key] == undefined)
    return -1;
  const index = this.queue.findIndex(q => q == key);
  this.queue.splice(index, 1);
  this.queue.push(key);
  return this.map[key];
};

/** 
 * @param {number} key 
 * @param {number} value
 * @return {void}
 */
LRUCache.prototype.put = function(key, value) {
  
  
  if(this.map[key] == undefined) {
    this.map[key] = value;
    if(this.queue.length == this.capacity) {
      const d = this.queue.shift();
      delete this.map[d];
    }
  } else {
    this.map[key] = value;
    const index = this.queue.findIndex(q => q == key);
    this.queue.splice(index, 1);
  }
  this.queue.push(key);
};

/** 
 * Your LRUCache object will be instantiated and called as such:
 * var obj = new LRUCache(capacity)
 * var param_1 = obj.get(key)
 * obj.put(key,value)
 */
```
