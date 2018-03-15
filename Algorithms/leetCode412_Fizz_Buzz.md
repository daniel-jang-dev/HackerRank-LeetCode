> Write a program that outputs the string representation of numbers from 1 to n. But for multiples of three it should output “Fizz” instead of the number and for the multiples of five output “Buzz”. For numbers which are multiples of both three and five output “FizzBuzz”.

```
/**
 * @param {number} n
 * @return {string[]}
 */
var fizzBuzz = function(n) {
    const a = [];
    let i = 1;
    while(i <= n) {
        let s = '';
        if(i % 3 !== 0 && i % 5 !== 0) 
            s+= i;
        else {
            if(i % 3 === 0) s += 'Fizz';
            if(i % 5 === 0) s += 'Buzz';
        }
        a.push(s);
        i++;
    }
    return a;
};
```
