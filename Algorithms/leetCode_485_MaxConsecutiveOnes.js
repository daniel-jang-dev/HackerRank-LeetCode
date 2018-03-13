/*
* Given a binary array, find the maximum number of consecutive 1s in this array.
* Input: [1,1,0,1,1,1]
* Output: 3
* Explanation: The first two digits or the last three digits are consecutive 1s.
*  The maximum number of consecutive 1s is 3.
*/

/**
 * @param {number[]} nums
 * @return {number}
 */
var findMaxConsecutiveOnes = function(nums) {
    let counter = 0;
    let max = 0;
    nums.forEach(e => {
        if (e === 1) {
            counter++;
            if (max < counter) max = counter;
        } else {
            counter = 0;
        }
    })
    return max;
};
