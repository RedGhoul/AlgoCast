// --- Directions
// Check to see if two provided strings are anagrams of eachother.
// One string is an anagram of another if it uses the same characters
// in the same quantity. Only consider characters, not spaces
// or punctuation.  Consider capital letters to be the same as lower case
// --- Examples
//   anagrams('rail safety', 'fairy tales') --> True
//   anagrams('RAIL! SAFETY!', 'fairy tales') --> True
//   anagrams('Hi there', 'Bye there') --> False

function anagrams(stringA, stringB) {
  return Way1(stringA, stringB);
}

function Way1(stringA, stringB) {
  if (stringA.length != stringB.length) {
    return false;
  }

  stringA = stringA.split('');
  stringB = stringB.split('');

  let mapA = {};
  let mapB = {};

  for (let i = 0; i < stringA.length; i++) {
    if (mapA[stringA[i]]) {
      mapA[stringA[i]]++;
    } else {
      mapA[stringA[i]] = 1;
    }
  }

  for (let i = 0; i < stringB.length; i++) {
    if (mapB[stringB[i]]) {
      mapB[stringB[i]]++;
    } else {
      mapB[stringB[i]] = 1;
    }
  }

  for (let i in mapA) {
    if (mapA[i] != mapB[i]) {
      return false;
    }
  }
  return true;
}

module.exports = anagrams;
