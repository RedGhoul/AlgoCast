// --- Directions
// Given a string, return a new string with the reversed
// order of characters
// --- Examples
//   reverse('apple') === 'leppa'
//   reverse('hello') === 'olleh'
//   reverse('Greetings!') === '!sgniteerG'

function reverse(str) {
  //return reverseWay1(str);
  return reverseEasy(str);
}
console.log(reverse('avvvanesa'));

function reverseWay1(str) {
  let arr = str.split(''); // got to specify the '' so that it can break on non splits
  let loopLength = Math.round(arr.length / 2); // rounds it to the nearest int
  let startP = 0;
  let endP = arr.length - 1;
  for (let i = 0; i < loopLength; i++) {
    let top = arr[startP];
    arr[startP] = arr[endP];
    arr[endP] = top;
    startP = startP + 1;
    endP = endP - 1;
  }
  return arr.join('');
}

function reverseEasy(str) {
  // using built in methods in JS
  let arr = str.split('');
  return arr.reverse().join(''); // could just call the reverse function
}
module.exports = reverse;
