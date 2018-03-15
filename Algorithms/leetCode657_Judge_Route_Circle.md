## [Judge Route Circle](https://leetcode.com/problems/judge-route-circle/description/)

> Initially, there is a Robot at position (0, 0). Given a sequence of its moves, judge if this robot makes a circle, which means it moves back to the original place. The move sequence is represented by a string. And each move is represent by a character. The valid robot moves are R (Right), L (Left), U (Up) and D (down). The output should be true or false representing whether the robot makes a circle.



```
/**
 * @param {string} moves
 * @return {boolean}
 */
var judgeCircle = function(moves) {
    const a = { 'U': 0, 'D': 0, 'L':0, 'R':0 };
    for(c of moves) {
        a[c]++;
    }
    return a['U'] === a['D'] && a['L'] === a['R'];
};
```
