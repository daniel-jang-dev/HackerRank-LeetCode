### 729.[My Calendar I](https://leetcode.com/problems/my-calendar-i/)
```javascript

var MyCalendar = function() {
  let myCalendar = Object.create(MyCalendar.prototype);
  myCalendar.books = [];
  return myCalendar;
};

/** 
 * @param {number} start 
 * @param {number} end
 * @return {boolean}
 */
MyCalendar.prototype.book = function(start, end) {
  if(this.books.some(e => e.start <= start && start < e.end)) return false;
  if(this.books.some(e => e.start < end && end <= e.end)) return false;
  if(this.books.some(e => e.start >= start && end >= e.end)) return false;

  this.books.push({start, end});
  return true;
};

/** 
 * Your MyCalendar object will be instantiated and called as such:
 * var obj = new MyCalendar()
 * var param_1 = obj.book(start,end)
 */
```
