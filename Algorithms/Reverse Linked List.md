### [Reverse Linked List](https://leetcode.com/explore/featured/card/recursion-i/251/scenario-i-recurrence-relation/2378/)
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
var reverseList = function(head) {
  let prev = null;
  let curr = head;
  while(curr) {
    const ptr = curr.next;
    curr.next = prev;
    prev = curr;
    curr = ptr;
  }
  return prev;
};
```
