## Leet Code 804. Unique Morse Code Words
> International Morse Code defines a standard encoding where each letter is mapped to a series of dots and dashes, 
> as follows: "a" maps to ".-", "b" maps to "-...", "c" maps to "-.-.", and so on.
> For convenience, the full table for the 26 letters of the English alphabet is given below:
```
[".-","-...","-.-.","-..",".","..-.","--.","....","..",".---","-.-",".-..","--","-.","---",".--.","--.-",".-.","...","-","..-","...-",".--","-..-","-.--","--.."]
```
> Now, given a list of words, each word can be written as a concatenation of the Morse code of each letter. 
> For example, "cba" can be written as "-.-..--...", (which is the concatenation "-.-." + "-..." + ".-"). 
> We'll call such a concatenation, the transformation of a word.

> Return the number of different transformations among all words we have.

```
Example:
Input: words = ["gin", "zen", "gig", "msg"]
Output: 2
Explanation: 
The transformation of each word is:
"gin" -> "--...-."
"zen" -> "--...-."
"gig" -> "--...--."
"msg" -> "--...--."

There are 2 different transformations, "--...-." and "--...--.".
```
---
### Solution
```javascript
/**
 * @param {string[]} words
 * @return {number}
 */
 
var uniqueMorseRepresentations = function(words) {
  var morses = words.map(word => getMorse(word));
  var uniques = morses.filter((v,i,a) => a.indexOf(v) === i);
  return uniques.length;
};

var MORSES = [".-","-...","-.-.","-..",".","..-.","--.","....","..",".---","-.-",".-..","--","-.","---",".--.","--.-",".-.","...","-","..-","...-",".--","-..-","-.--","--.."];

function getMorse(word) {  
  var morse = '';
  for(var i in word) {
    var index = word.charCodeAt(i) - 97;
    morse += MORSES[index];
  }
  return morse;
}
```
