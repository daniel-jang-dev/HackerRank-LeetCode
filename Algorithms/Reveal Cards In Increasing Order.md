## [950. Reveal Cards In Increasing Order](https://leetcode.com/problems/reveal-cards-in-increasing-order/)
```javascript
// Runtime: 136 ms, faster than 16.67%
// Memory Usage: 41.3 MB, less than 33.33%
function deckRevealedIncreasing(deck: number[]): number[] {
    
    deck.sort((a, b) => a - b);
    const queue = deck.map((v, i) => i);
    const ans = [];
    deck.forEach(card => {
        const x = queue.shift();
        ans[x] = card;
        const y = queue.shift();
        queue.push(y);
    });
    return ans;
};
```
