### Week 4.7. [First Unique Number](https://leetcode.com/explore/challenge/card/30-day-leetcoding-challenge/531/week-4/3313/)
```javascript
/**
 * @param {number[]} nums
 */
var FirstUnique = function(nums) {
  this.map = {}; // to count the number of character
  this.queue = []; // to store numbers in order
  this.firstUnique = { // to store the index and value of first unique number
    index: -1,
    value: -1
  };
  nums.forEach(value => {
    this.add(value);
  });
};

/**
 * @return {number}
 */
FirstUnique.prototype.showFirstUnique = function() {
  return this.firstUnique.value;
};

/** 
 * @param {number} value
 * @return {void}
 */
FirstUnique.prototype.add = function(value) {
  
  this.queue.push(value); // enqueue number
  
  // New unique number
  if(this.map[value] === undefined) {
    this.map[value] = 1; // counting
    if(this.firstUnique.value === -1) {
      this.firstUnique.value = value;
      this.firstUnique.index = this.queue.length - 1;
    }
  
  // Existing number
  } else {
    this.map[value]++; // counting
    this.firstUnique.value = -1; // reset value
    
    // start from next to previous unique number
    for(let i = this.firstUnique.index; i < this.queue.length; i++) {
      if(this.map[this.queue[i]] === 1) { // next first unique number
        this.firstUnique.index = i; // store new index
        this.firstUnique.value = this.queue[i]; // store new value
        break;
      }
    }
  }
};

/** 
 * Your FirstUnique object will be instantiated and called as such:
 * var obj = new FirstUnique(nums)
 * var param_1 = obj.showFirstUnique()
 * obj.add(value)
 */
```
