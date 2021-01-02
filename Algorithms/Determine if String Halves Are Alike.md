## [1704. Determine if String Halves Are Alike](https://leetcode.com/problems/determine-if-string-halves-are-alike/)
```javascript
// JAVASCRIPT
// Runtime: 80 ms, faster than 93.33%
// Memory Usage: 40.1 MB, less than 86.67%

function halvesAreAlike(s: string): boolean {
    
    const vowel = 'AEIOUaeiou';
    let count = 0;
    const len = s.length;
    for(let i = 0; i < len / 2; i++) {

        if(vowel.includes(s[i])) 
            count++;
        if(vowel.includes(s[len-1-i])) 
            count--;
    }
    return count == 0;
};
```
