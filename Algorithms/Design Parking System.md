## 1603. [Design Parking System](https://leetcode.com/problems/design-parking-system/)

```javascript
/**
 * @param {number} big
 * @param {number} medium
 * @param {number} small
 */
var ParkingSystem = function(big, medium, small) {
  this.big = big;
  this.medium = medium;
  this.small = small;
  return null;
};

/** 
 * @param {number} carType
 * @return {boolean}
 */
ParkingSystem.prototype.addCar = function(carType) {
  const targetMap = {
    1: 'big',
    2: 'medium',
    3: 'small'
  }
  if(this[targetMap[carType]] == 0) {
    return false;
  } else {
    this[targetMap[carType]]--;
    return true;
  }
    
};

/** 
 * Your ParkingSystem object will be instantiated and called as such:
 * var obj = new ParkingSystem(big, medium, small)
 * var param_1 = obj.addCar(carType)
 */
```
