## [You Can Go Your Own Way](https://codingcompetitions.withgoogle.com/codejam/round/0000000000051705/00000000000881da)

```
const fs= require('fs');

const input = fs.readFileSync(0,'utf8').trim().split('\n').slice(1)
.filter((v,i) => i % 2);

console.log(input.map((e,i)=>`Case #${i+1}: ${solve(e)}`).join('\n'));

function solve(str) {
    const m = { E: 'S', S: 'E'};    
    return str.split('').map(c => m[c]).join('');
}
```
