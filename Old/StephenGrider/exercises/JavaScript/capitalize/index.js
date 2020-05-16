// --- Directions
// Write a function that accepts a string.  The function should
// capitalize the first letter of each word in the string then
// return the capitalized string.
// --- Examples
//   capitalize('a short sentence') --> 'A Short Sentence'
//   capitalize('a lazy fox') --> 'A Lazy Fox'
//   capitalize('look, it is working!') --> 'Look, It Is Working!'

function capitalize(str) {
  return way1(str);
}

function way1(str) {
  // asumming there will always be spaces seprating words

  str = str.split(' ');

  for (let i = 0; i < str.length; i++) {
    str[i] =
      str[i].split('')[0].toUpperCase() +
      str[i]
        .split('')
        .slice(1)
        .join('');
  }

  //slice(start(which is included, end which is not inculded))

  return str.join(' ');
}

function way2(str) {
  // asumming there will always be spaces seprating words

  const words = [];

  for (let word of str.split('')) {
    words.push(word[0].toUpperCase() + word.slice(1));
  }

  //slice(start(which is included, end which is not inculded))

  return words.join(' ');
}

module.exports = capitalize;
