### [Middle of the Linked List](https://leetcode.com/explore/challenge/card/30-day-leetcoding-challenge/529/week-2/3290/)
> 30-Day LeetCoding Challenge: Week 2-1
```javascript
/**
 * Definition for singly-linked list.
 * function ListNode(val) {
 *     this.val = val;
 *     this.next = null;
 * }
 */
/**
 * @param {ListNode} head
 * @return {ListNode}
 */
var middleNode = function(head) {
  const length = getLength(head);
  let count = 0;
  let ptr = head;
  while(count < Math.floor(length / 2)) {
    count++;
    ptr = ptr.next;
  }
  return ptr;
};

function getLength(head) {
  let count = 0;
  let ptr = head;
  while(ptr) {
    count++;
    ptr = ptr.next;
  }
  return count;
}
```
