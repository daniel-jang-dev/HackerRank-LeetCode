## [797. All Paths From Source to Target](https://leetcode.com/problems/all-paths-from-source-to-target/)
```javascript
// #1. BFS
// Runtime: 136 ms, faster than 20.09%
// Memory Usage: 47.7 MB, less than 20.79%
/**
 * @param {number[][]} graph
 * @return {number[][]}
 */
var allPathsSourceTarget = function(graph) {
    const ans = []
    function bfs(graph, i, subA) {
        subA = [...subA, i];
        if(i == graph.length - 1) {
            ans.push(subA);
            return;
        }
        if(graph[i].length == 0) 
            return;
        graph[i].forEach(j => {
           bfs(graph, j, subA);
        });
    }
    bfs(graph, 0, []);
    return ans;
};

// #2. DFS
// Runtime: 156 ms, faster than 12.93%
// Memory Usage: 46 MB, less than 63.51%
/**
 * @param {number[][]} graph
 * @return {number[][]}
 */
var allPathsSourceTarget = function(graph) {
    const n = graph.length;
    const ans = [];
    function dfs(i, paths) {
        if(i == n - 1) {
            ans.push([...paths]);
            return;
        }
        graph[i].forEach(path => {
            paths.push(path);
            dfs(path, paths);
            paths.pop();
        });
    }
    dfs(0, [0]);
    return ans;
};

```
