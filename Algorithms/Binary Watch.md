## 401. [Binary Watch](https://leetcode.com/problems/binary-watch)

A binary watch has 4 LEDs on the top which represent the hours (0-11), and the 6 LEDs on the bottom represent the minutes (0-59).
Each LED represents a zero or one, with the least significant bit on the right.

![alt text](https://upload.wikimedia.org/wikipedia/commons/8/8b/Binary_clock_samui_moon.jpg "Binary Watch")
For example, the above binary watch reads "3:25".

Given a non-negative integer n which represents the number of LEDs that are currently on, return all possible times the watch could represent.

###### Example:
```
Input: n = 1
Return: ["1:00", "2:00", "4:00", "8:00", "0:01", "0:02", "0:04", "0:08", "0:16", "0:32"]
```
###### Note:
* The order of output does not matter.
* The hour must not contain a leading zero, for example "01:00" is not valid, it should be "1:00".
* The minute must be consist of two digits and may contain a leading zero, for example "10:2" is not valid, it should be "10:02".

---
```
/**
 * @param {number} num
 * @return {string[]}
 */
var readBinaryWatch = function(num) {
  if(num === 0) return ['0:00'];
  
  const hour = getCombinations(['01', '02', '04', '08']);
  const min  = getCombinations(['01', '02', '04', '08', '16', '32']);
  
  const iMap1 = {
    0: ['0']
  };
  
  const iMap2 = {
    0: ['00']
  };
  
  const res1 = generateMap(iMap1, hour, 'hour');
  const res2 = generateMap(iMap2, min, 'min');

  const ans = [];
  let pointer = num;
  while(pointer >= 0) {
    const hA = res1[num - pointer];
    const mA = res2[pointer];
    if(hA && mA) {
      for(let i = 0; i < hA.length; i++) {
        for(let j = 0; j < mA.length; j++) {
          ans.push(`${hA[i]}:${mA[j]}`);
        }
      }
  }
    pointer--;
  }
  return ans;
};

function generateMap(initialMap, list, type) {
  list.forEach(sTime => {
    const ind = Number(sTime.length / 2);
    let t = 0;
    for(let i = 0; i < ind * 2 ; i+=2) {
      t += Number(sTime[i]) * 10 + Number(sTime[i+1]);
    }
    if(type === 'hour') {
      const res = `${t}`;
      if(t < 12) {
        if(!initialMap[ind]) initialMap[ind] = [res];
        else initialMap[ind].push(res);      
      }  
    } else if (type === 'min'){
      const res = t < 10 ? `0${t}` : `${t}`;
      if(t < 60) {
        if(!initialMap[ind]) initialMap[ind] = [res];
        else initialMap[ind].push(res);      
      }
    }
  });
  return initialMap;
}

function getCombinations(chars) {
  var result = [];
  var helper = function(prefix, chars) {
    for (var i = 0; i < chars.length; i++) {
      result.push(prefix + chars[i]);
      helper(prefix + chars[i], chars.slice(i + 1));
    }
  }
  helper('', chars);
  return result;
}

```
