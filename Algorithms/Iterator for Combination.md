### 1286. [Iterator for Combination](https://leetcode.com/problems/iterator-for-combination/)

```javascript
/**
 * @param {string} characters
 * @param {number} combinationLength
 */
var CombinationIterator = function(characters, combinationLength) {
  let ci = Object.create(CombinationIterator.prototype);
  ci.list = getList(characters, combinationLength);
  return ci;
  
};

/**
 * @return {string}
 */
CombinationIterator.prototype.next = function() {
    return this.list.shift();
};

/**
 * @return {boolean}
 */
CombinationIterator.prototype.hasNext = function() {
    return this.list.length > 0;
};

/** 
 * Your CombinationIterator object will be instantiated and called as such:
 * var obj = new CombinationIterator(characters, combinationLength)
 * var param_1 = obj.next()
 * var param_2 = obj.hasNext()
 */

function getList(characters, combinationLength) {
  const ans = [];
  backtrack(ans, '', characters, combinationLength);
  return ans;
}

function backtrack(ans, subs, str, r) {
  
  // base case
  if(r == 0) {
    ans.push(subs);
    return;
  }
  
  if(str.length == r) {
    backtrack(ans, subs + str, '', 0);
    return;
  }
  
  backtrack(ans, subs + str[0], str.substring(1), r-1); // n-1 C r-1
   
  backtrack(ans, subs, str.substring(1), r); // n-1 C r
}

```
