## 210. [Course Schedule II](https://leetcode.com/problems/course-schedule-ii/)

```javascript
/**
 * @param {number} numCourses
 * @param {number[][]} prerequisites
 * @return {number[]}
 */
var findOrder = function(numCourses, prerequisites) {
    
  const graph = Array.from({ length: numCourses }, () => []);
  const countOfLinks = Array(numCourses).fill(0);
  
    prerequisites.forEach(([c, p]) => {
    graph[p].push(c);
    countOfLinks[c]++;
  });
  
  if(countOfLinks.every(v => v > 0)) 
    return []; // Return [], if there is no incoming edge

  const queue = [];
  const to = []; // Topological Order
  
  countOfLinks.forEach((v, i) => {
    if(v === 0) {
      queue.push(i); // Add initial incoming edges to Queue
    }
  });
  
  while(queue.length) {
    const p = queue.shift();
    to.push(p);
    for(const c of graph[p]) {
      countOfLinks[c]--;
      if(countOfLinks[c] == 0) { // Add new incoming edges to Queue
        queue.push(c);
      }
    }
  }
  
  return to.length == numCourses ? to : [];
};

```
