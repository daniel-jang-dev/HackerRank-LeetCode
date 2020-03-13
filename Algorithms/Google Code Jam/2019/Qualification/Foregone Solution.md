## [ForegoneSolution](https://codingcompetitions.withgoogle.com/codejam/round/0000000000051705/0000000000088231)

##### Problem
Someone just won the Code Jam lottery, and we owe them N jamcoins! However, when we tried to print out an oversized check, we encountered a problem. The value of N, which is an integer, includes at least one digit that is a 4... and the 4 key on the keyboard of our oversized check printer is broken.

Fortunately, we have a workaround: we will send our winner two checks for positive integer amounts A and B, such that neither A nor B contains any digit that is a 4, and A + B = N. Please help us find any pair of values A and B that satisfy these conditions.

##### Input
The first line of the input gives the number of test cases, T. T test cases follow; each consists of one line with an integer N.

##### Output
For each test case, output one line containing Case #x: A B, where x is the test case number (starting from 1), and A and B are positive integers as described above.

It is guaranteed that at least one solution exists. If there are multiple solutions, you may output any one of them. (See "What if a test case has multiple correct solutions?" in the Competing section of the FAQ. This information about multiple solutions will not be explicitly stated in the remainder of the 2019 contest.)

##### Limits
1 ≤ T ≤ 100.
Time limit: 10 seconds per test set.
Memory limit: 1GB.
At least one of the digits of N is a 4.

###### Test set 1 (Visible)
1 < N < 10<sup>5<sup>.

###### Test set 2 (Visible)
1 < N < 10<sup>9<sup>.

Solving the first two test sets for this problem should get you a long way toward advancing. The third test set is worth only 1 extra point, for extra fun and bragging rights!

###### Test set 3 (Hidden)
1 < N < 10<sup>100<sup>.

---
```
const fs= require('fs');

const input = fs.readFileSync(0,'utf8').trim().split('\n').slice(1);

console.log(input.map((e,i)=>`Case #${i+1}: ${solve(e)}`).join('\n'));

function solve(str) {
    
    let a = '', b = '';
    str.split('').forEach(c => {
        if(c == '4') {
            a += 3;
            b += 1;
        } else {
            a += c;
            b += 0;
        }
    });
    return `${a} ${b.replace(/^0+/, '')}`;
}
```
