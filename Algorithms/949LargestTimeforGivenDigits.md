## 949. Largest Time for Given Digits
 > Given an array of 4 digits, return the largest 24 hour time that can be made.
 > The smallest 24 hour time is 00:00, and the largest is 23:59.  Starting from 00:00, 
 > a time is larger if more time has elapsed since midnight.
 > Return the answer as a string of length 5.  If no valid time can be made, return an empty string.

```javascript
/**
 * @param {number[]} A
 * @return {string}
 */
var largestTimeFromDigits = function(A) {
  
  const pArray = getAllPermutations(A.join(''));
  const times = pArray.map(n => Number(n[0])*600 + Number(n[1])*60 +  Number(n[2])*10 +  Number(n[3]));
  const filteredTimes = times.filter((e, i) => e < 1440 && Number(pArray[i][2]) < 6);
  const maxTime = Math.max(...filteredTimes);
  const index = times.indexOf(maxTime);
  
  if(index === -1) return '';
  
  const s = pArray[index];
  return s.substr(0, 2) + ':' + s.substr(2);
  
};


function getAllPermutations(word) {
  var results = [];

  if (word.length === 1) {
    results.push(word);
    return results;
  }

  for (var i = 0; i < word.length; i++) {
    var firstChar = word[i];
    var charsLeft = word.substring(0, i) + word.substring(i + 1);
    var innerPermutations = getAllPermutations(charsLeft);
    for (var j = 0; j < innerPermutations.length; j++) {
      results.push(firstChar + innerPermutations[j]);
    }
  }
  return results;
}
```
