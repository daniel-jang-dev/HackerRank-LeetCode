## 463. Island Perimeter

ou are given a map in form of a two-dimensional integer grid where 1 represents land and 0 represents water.

Grid cells are connected horizontally/vertically (not diagonally). The grid is completely surrounded by water, and there is exactly one island (i.e., one or more connected land cells).

The island doesn't have "lakes" (water inside that isn't connected to the water around the island). One cell is a square with side length 1. The grid is rectangular, width and height don't exceed 100. Determine the perimeter of the island.

 

##### Example:
```
Input:
[[0,1,0,0],
 [1,1,1,0],
 [0,1,0,0],
 [1,1,0,0]]

Output: 16

Explanation: The perimeter is the 16 yellow stripes in the image below:
```
---
```
/**
 * @param {number[][]} grid
 * @return {number}
 */
var islandPerimeter = function(grid) {
    let side = 0;
    const rowLength = grid[0].length;
    const colLength = grid.length;
    for(let i=0; i < colLength; i++) {
        let row = grid[i];
        for(let j=0; j < rowLength; j++) {
            let cell = row[j];
            if(cell === 1) {
                /* LEFT */
                if(j == 0 || row[j-1] == 0) side++;
                
                /* RIGHT */
                if(j+1 == rowLength || row[j+1] == 0) side++;
                
                /* UP */
                if(i == 0 || grid[i-1][j] === 0) side++;
                
                /* DOWN */
                if(i+1 == colLength || grid[i+1][j] === 0) side++;                
            }
        }
    }
    
    return side;
};
```
