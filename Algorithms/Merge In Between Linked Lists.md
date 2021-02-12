## [1669. Merge In Between Linked Lists](https://leetcode.com/problems/merge-in-between-linked-lists/submissions/)
```javascript
// Runtime: 212 ms, faster than 94.88%
// Memory Usage: 51.7 MB, less than 25.20%
/**
 * Definition for singly-linked list.
 * function ListNode(val, next) {
 *     this.val = (val===undefined ? 0 : val)
 *     this.next = (next===undefined ? null : next)
 * }
 */
/**
 * @param {ListNode} list1
 * @param {number} a
 * @param {number} b
 * @param {ListNode} list2
 * @return {ListNode}
 */
var mergeInBetween = function(list1, a, b, list2) {
    let count = 0;
    let ptr = list1;
    let x, y, z;
    while(count <= b) {
        count++;
        if(count == a) {
            x = ptr;
        } else if(count > b) {
            y = ptr;
            z = ptr.next;
        }
        ptr = ptr.next;
    }
    x.next = list2;
    y.next = null;
    
    ptr = list2;
    while(ptr.next) {
        ptr = ptr.next;
    }
    ptr.next = z;
    
    return list1;
};
```
