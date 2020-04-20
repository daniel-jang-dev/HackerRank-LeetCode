### 381. [Insert Delete GetRandom O(1) - Duplicates allowed](https://leetcode.com/problems/insert-delete-getrandom-o1-duplicates-allowed/)
```javascript
/**
 * Initialize your data structure here.
 */
var RandomizedCollection = function() {
  this.map = {};
};

/**
 * Inserts a value to the collection. Returns true if the collection did not already contain the specified element. 
 * @param {number} val
 * @return {boolean}
 */
RandomizedCollection.prototype.insert = function(val) {
  if(this.map[val] == undefined) {
    this.map[val] = 1;
    return true;
  } else {
    this.map[val]++;
    return false;
  }
};

/**
 * Removes a value from the collection. Returns true if the collection contained the specified element. 
 * @param {number} val
 * @return {boolean}
 */
RandomizedCollection.prototype.remove = function(val) {
  if(this.map[val] == undefined) {
    return false;
  } else {
    this.map[val]--;
    if(this.map[val] == 0) {
      delete this.map[val];
    }
    return true;
  }
};

/**
 * Get a random element from the collection.
 * @return {number}
 */
RandomizedCollection.prototype.getRandom = function() {
  
  const arr = [];
  Object.entries(this.map).forEach(entry => {
    let [key, value] = entry;
    while(value) {
      arr.push(key);
      value--;
    }
  });
  return arr[Math.floor(Math.random() * arr.length)];
};

/** 
 * Your RandomizedCollection object will be instantiated and called as such:
 * var obj = new RandomizedCollection()
 * var param_1 = obj.insert(val)
 * var param_2 = obj.remove(val)
 * var param_3 = obj.getRandom()
 */
```
