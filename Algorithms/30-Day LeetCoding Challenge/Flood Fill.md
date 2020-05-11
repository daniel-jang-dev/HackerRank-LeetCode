### 2020 May 11th. [Flood Fill](https://leetcode.com/explore/challenge/card/may-leetcoding-challenge/535/week-2-may-8th-may-14th/3326/)

```javascript
/**
 * @param {number[][]} image
 * @param {number} sr
 * @param {number} sc
 * @param {number} newColor
 * @return {number[][]}
 */
var floodFill = function(image, sr, sc, newColor) {
  const color = image[sr][sc];
  if(color !== newColor) dfs(image, sr, sc, color, newColor);
  return image;
};

var dfs = function(image, r, c, color, newColor) {
  if(image[r][c] === color) {
    image[r][c] = newColor;
    if(r > 0) dfs(image, r-1,   c, color, newColor);
    if(c > 0) dfs(image,   r, c-1, color, newColor);
    if(r < image.length-1)    dfs(image, r+1,   c, color, newColor);
    if(c < image[0].length-1) dfs(image,   r, c+1, color, newColor);
  }
}
```
