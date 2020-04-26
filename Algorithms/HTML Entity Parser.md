### 1410. [HTML Entity Parser](https://leetcode.com/problems/html-entity-parser/)
```javascript
/**
 * @param {string} text
 * @return {string}
 */
var entityParser = function(text) {
  let ans = '';
  const map = {
    '&quot;' : `"`,
    '&apos;' : `'`,
    '&amp;'  : `&`,
    '&gt;'   : `>`,
    '&lt;'   : `<`,
    '&frasl;': `/`
  }
  const keys = Object.keys(map);
  for(let i = 0; i < text.length; i++) {
    
    let isParsed = false;
    
    for(let j = 0; j < keys.length; j++) {
      const key = keys[j];
      if(key == text.substr(i, key.length)) {
        ans += map[key];
        i += key.length-1;
        isParsed = true;
        break;
      }
    }
    if(!isParsed) {
      ans += text[i];
    }
  }
  return ans;
};
```
