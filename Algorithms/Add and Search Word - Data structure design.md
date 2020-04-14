### 211. [Add and Search Word - Data structure design](https://leetcode.com/problems/add-and-search-word-data-structure-design/)
```javascript
/**
 * Initialize your data structure here.
 */
var WordDictionary = function() {
  this.arr = [];
};

/**
 * Adds a word into the data structure. 
 * @param {string} word
 * @return {void}
 */
WordDictionary.prototype.addWord = function(word) {
  
  if(!word) return;
  if(this.arr[word.length] == undefined) {
    this.arr[word.length] = [];
  }
  this.arr[word.length].push(word);
};

/**
 * Returns if the word is in the data structure. A word could contain the dot character '.' to represent any one letter. 
 * @param {string} word
 * @return {boolean}
 */
WordDictionary.prototype.search = function(word) {
  const list = this.arr[word.length];
  if(list == undefined)
    return false;
  
  let matched = false;
  for(let i = 0; i < list.length; i++) {
    if(isValid(list[i], word)) {
      matched = true;
      break;
    }
  }
  return matched;
};

function isValid(str, word) {
  let valid = true;
  for(let i = 0; i < word.length; i++) {
    if(word[i] != '.' && word[i] !== str[i]) {
      valid = false;
      break;
    }
  }
  return valid;
}

/** 
 * Your WordDictionary object will be instantiated and called as such:
 * var obj = new WordDictionary()
 * obj.addWord(word)
 * var param_2 = obj.search(word)
 */
```
