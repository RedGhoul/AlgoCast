// --- Directions
// Given a string, return the character that is most
// commonly used in the string.
// --- Examples
// maxChar("abcccccccd") === "c"
// maxChar("apple 1231111") === "1"

function maxChar(str) {
  return MaxCharWayOne(str);
}

function MaxCharWayOne(str) {
  let map = {};
  str = str.split('');
  for (let i = 0; i < str.length; i++) {
    if (map[str[i]]) {
      map[str[i]]++;
    } else {
      map[str[i]] = 1;
    }
  }
  let maxValue = 0;
  let charMax = '';
  for (x in map) {
    if (map[x] > maxValue) {
      maxValue = map[x];
      charMax = x;
    }
  }
  return charMax;
}

module.exports = maxChar;
