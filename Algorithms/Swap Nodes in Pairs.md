## [24. Swap Nodes in Pairs](https://leetcode.com/problems/swap-nodes-in-pairs/)
```javascript
## Runtime: 84 ms, faster than 21.88%
## Memory Usage: 38.8 MB, less than 42.76%
/**
 * Definition for singly-linked list.
 * function ListNode(val, next) {
 *     this.val = (val===undefined ? 0 : val)
 *     this.next = (next===undefined ? null : next)
 * }
 */
/**
 * @param {ListNode} head
 * @return {ListNode}
 */
var swapPairs = function(head) {
    if(!head || !head.next) return head;
    const arr = [];
    let ptr = head;
    while(ptr) {
        arr.push(ptr);
        ptr = ptr.next;
    }
    for(let i = 0; i + 1 < arr.length; i += 2) {
        const tmp = arr[i].val;
        arr[i].val = arr[i+1].val;
        arr[i+1].val = tmp;
    }
    return arr[0];
};
```
