### 819. [Most Common Word](https://leetcode.com/problems/most-common-word/)
```javascript
/**
 * @param {string} paragraph
 * @param {string[]} banned
 * @return {string}
 */
var mostCommonWord = function(paragraph, banned) {
  
  paragraph = paragraph.replace(/[!?',;.]/g, ' ');
  banned.push('');
  const map = {};
  
  paragraph.split(' ').forEach(w => {
    const word = w.toLowerCase();
    if(!banned.includes(word)) {
      map[word] = map[word] + 1 || 1;
    }
  });
  
  return Object.entries(map).sort((a, b) => b[1]-a[1])[0][0];
};
```
