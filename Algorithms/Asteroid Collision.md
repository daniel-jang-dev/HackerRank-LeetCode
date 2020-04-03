## 735. [Asteroid Collision](https://leetcode.com/problems/asteroid-collision/)
```
/**
 * @param {number[]} asteroids
 * @return {number[]}
 */
var asteroidCollision = function(asteroids) {
  
  let collided;
  do {
    collided = false;
    for(let i = 0; i+1 < asteroids.length; i++) {
      const left = asteroids[i];
      const right = asteroids[i+1];
      // Collision
      if(left > 0 && right < 0) {
        if(left + right > 0) { // remove right
          asteroids.splice(i+1, 1);
          i--;
        } else if(left + right < 0) { // remove left
          asteroids.splice(i, 1);
          i--;
        } else { // remove both
          asteroids.splice(i, 2);
          i -= 2;
        }
        collided = true;
      }
    }
  } while(collided);
  return asteroids;
};
```
