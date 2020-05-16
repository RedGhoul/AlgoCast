// --- Directions
// Given a string, return a new string with the reversed
// order of characters
// --- Examples
//   reverse('apple') === 'leppa'
//   reverse('hello') === 'olleh'
//   reverse('Greetings!') === '!sgniteerG'

// Two pointer method
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

// using the built in feature of the lang
function reverseEasy(str) {
  // using built in methods in JS
  let arr = str.split('');
  return arr.reverse().join(''); // could just call the reverse function
}

// using the string builder method
function reverseWay2(str) {
  str = str.split('');
  let reverse = '';

  for (let i = 0; i < str.length; i++) {
    reverse = str[i] + reverse;
  }

  return reverse;
}

// using JS reduce
function reverseWay3(str) {
  str = str.split('');
  // reduce only returns one big thing not an array
  str = str.reduce((acc, ele) => {
    return ele + acc;
  }, '');

  return str;
}

function reverse(str) {
  //return reverseWay1(str);

  return reverseWay3(str);
}

module.exports = reverse;
