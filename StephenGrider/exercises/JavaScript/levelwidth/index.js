// --- Directions
// Given the root node of a tree, return
// an array where each element is the width
// of the tree at each level.
// --- Example
// Given:
//     0
//   / |  \
// 1   2   3
// |       |
// 4       5
// Answer: [1, 3, 2]
const Node = require('./node');

function levelWidth(root) {
    let count = 0;
    let levelWidthArr = [];
    let ntv = [root, 'dog']
    while (ntv.length) {
        const element = ntv.shift();
        if (element === 'dog') {
            levelWidthArr.push(count)
            count = 0;
            if (ntv.length == 0) {
                break;
            }
            ntv.push('dog')
        } else {
            count = 1 + count;
            ntv.push(...element.children);
        }
    }
    return levelWidthArr;
}

module.exports = levelWidth;