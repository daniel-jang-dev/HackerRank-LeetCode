## [1721. Swapping Nodes in a Linked List](https://leetcode.com/problems/swapping-nodes-in-a-linked-list/)
```javascript
// Runtime: 532 ms, faster than 100.00%
// Memory Usage: 73.2 MB, less than 100.00%
/**
 * Definition for singly-linked list.
 * function ListNode(val, next) {
 *     this.val = (val===undefined ? 0 : val)
 *     this.next = (next===undefined ? null : next)
 * }
 */
/**
 * @param {ListNode} head
 * @param {number} k
 * @return {ListNode}
 */
var swapNodes = function(head, k) {
    // array to store nodes
    const arr = [];
    let ptr = head;
    while(ptr) {
        arr.push(ptr);
        ptr = ptr.next;
    }
    // swap
    const x = arr.length - k;
    const tmpVal = arr[x].val;
    arr[x].val = arr[k-1].val;
    arr[k-1].val = tmpVal;
    // return head
    return arr[0];
};
```
