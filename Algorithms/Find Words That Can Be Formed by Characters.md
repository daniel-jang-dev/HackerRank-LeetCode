### 1160. Find Words That Can Be Formed by Characters

You are given an array of strings words and a string chars.

A string is good if it can be formed by characters from chars (each character can only be used once).

Return the sum of lengths of all good strings in words.

 

Example 1:
```
Input: words = ["cat","bt","hat","tree"], chars = "atach"
Output: 6
Explanation: 
The strings that can be formed are "cat" and "hat" so the answer is 3 + 3 = 6.
```

Example 2:
```
Input: words = ["hello","world","leetcode"], chars = "welldonehoneyr"
Output: 10
Explanation: 
The strings that can be formed are "hello" and "world" so the answer is 5 + 5 = 10.
```

Note:

* 1 <= words.length <= 1000
* 1 <= words[i].length, chars.length <= 100
* All strings contain lowercase English letters only.

---
```
/**
 * @param {string[]} words
 * @param {string} chars
 * @return {number}
 */
var countCharacters = function(words, chars) {
    
    const cMap = getMap(chars);
    let ans = 0;
    words.forEach(word => {
        let isValid = true;
        const wMap = getMap(word);
        for(let c of Object.keys(wMap)) {
            if(!cMap[c] || wMap[c] > cMap[c]) {
                isValid = false;
                break;
            }
        }
        if(isValid)
            ans += word.length;
    });
    return ans;
};

var getMap = function(str) {
    const map = {};
    for(let c of str) {
        if(map[c]) {
            map[c]++;
        } else {
            map[c] = 1;
        }
    }
    return map;
}
```
