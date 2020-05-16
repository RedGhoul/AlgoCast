// --- Directions
// Given an integer, return an integer that is the reverse
// ordering of numbers.
// --- Examples
//   reverseInt(15) === 51
//   reverseInt(981) === 189
//   reverseInt(500) === 5
//   reverseInt(-15) === -51
//   reverseInt(-90) === -9

function reverseInt(n) {
  return try1(n);
}

function try1(n) {
  let str = n.toString().split(''); // base 10 by default
  let re = '';
  let neg = false;
  if (str.length === 1 && str[0] === '0') {
    return 0;
  }
  for (let i = 0; i < str.length; i++) {
    if (str[i] === '-') {
      neg = true;
    } else if (str[i] != '0') {
      re = str[i] + re;
    }
  }
  if (neg) {
    return parseInt('-' + re, 10);
  } else {
    return parseInt(re, 10);
  }
}
module.exports = reverseInt;
