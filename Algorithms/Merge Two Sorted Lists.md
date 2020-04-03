### 21. [Merge Two Sorted Lists](https://leetcode.com/problems/merge-two-sorted-lists/)

```javascript
/**
 * Definition for singly-linked list.
 * function ListNode(val) {
 *     this.val = val;
 *     this.next = null;
 * }
 */
/**
 * @param {ListNode} l1
 * @param {ListNode} l2
 * @return {ListNode}
 */
var mergeTwoLists = function(l1, l2) {
  
  if(!l1) return l2;
  if(!l2) return l1;

  let ptr1 = l1;
  let ptr2 = l2;
  
  let ans;
  if(ptr1.val < ptr2.val) {
    ans = new ListNode(ptr1.val);
    ptr1 = ptr1.next;
  } else {
    ans = new ListNode(ptr2.val);
    ptr2 = ptr2.next;
  }
  
  let target = ans;
  while(!(ptr1 == null && ptr2 == null)) {
    
    if(ptr1 && ptr2) {
      if(ptr1.val < ptr2.val) {
          target.next = ptr1;
          target = target.next;
          ptr1 = ptr1.next;
        } else {
          target.next = ptr2;
          target = target.next;
          ptr2 = ptr2.next;
        }
      
    } else if(ptr1) {
      target.next = ptr1;
      target = target.next;
      ptr1 = ptr1.next;
      
    } else {
      target.next = ptr2;
      target = target.next;
      ptr2 = ptr2.next;
    }
  }
  return ans;
};
```
