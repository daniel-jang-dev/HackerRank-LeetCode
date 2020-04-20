### 1418. [Display Table of Food Orders in a Restaurant](https://leetcode.com/problems/display-table-of-food-orders-in-a-restaurant/)
```javascript
/**
 * @param {string[][]} orders
 * @return {string[][]}
 */
var displayTable = function(orders) {
  
  const tMap = {};
  let foodItems = [];
  
  orders.forEach(order => {
    const [customerName, tableNumber, foodItem] = order;
    
    if(!foodItems.includes(foodItem))
      foodItems.push(foodItem);
    
    if(!tMap[tableNumber])
      tMap[tableNumber] = {};
      
    tMap[tableNumber][foodItem] = tMap[tableNumber][foodItem] + 1 || 1;
  });
  
  const headers = [...foodItems.sort()];
  const body = Object.keys(tMap).map(tableNumber => {
    return [tableNumber, ...headers.map(e => String(tMap[tableNumber][e] || 0))];

  });
  headers.unshift('Table');
  return [headers, ...body];
};
```
