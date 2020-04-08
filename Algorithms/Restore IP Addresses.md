### 93. [Restore IP Addresses](https://leetcode.com/problems/restore-ip-addresses/)
```javascript
/**
 * @param {string} s
 * @return {string[]}
 */
var restoreIpAddresses = function(s) {
  if(s.split('').every(c => c == '0') && s != '0000') return []; // filter many zeros 
  const ans = [];
  backtrack(ans, '', s, 4);
  return ans;
};

function backtrack(ans, sb, rest, count) {
  
  // base case
  if(count == 0) {
    ans.push(sb);
    return;
  }
  
  for(let i = 1; i <= 3; i++) {
    const pref = rest.substring(0, i);
    if(pref.length < i) continue; // prevent duplication 
    const newRest = rest.substring(i);
    if(isValid(pref, newRest, count-1)) {
      backtrack(ans, sb ? sb + '.' + pref : pref, newRest, count-1);
    }
  }
}

function isValid(pref, rest, count) {
  
  // check pref
  const n = Number(pref);
  if(pref.length != String(n).length) return false; // check leading zeros
  if(!(0 <= pref && pref <= 255)) return false;
  
  // check rest
  const l = rest.length;
  return count <= l && l <= count * 3;
}
```
