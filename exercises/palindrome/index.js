// --- Directions
// Given a string, return true if the string is a palindrome
// or false if it is not.  Palindromes are strings that
// form the same word if it is reversed. *Do* include spaces
// and punctuation in determining if the string is a palindrome.
// --- Examples:
//   palindrome("abba") === true
//   palindrome("abcdefg") === false

function palindrome(str) {
  return palindromeWay1(str);
}

// Two pointer way of doing it
function palindromeWay1(str) {
  str = str.split('');
  let sp = 0;
  let ep = str.length - 1;
  for (let i = 0; i < Math.round(str.length / 2); i++) {
    console.log('sss');
    if (str[sp] != str[ep]) {
      return false;
    } else {
      sp = sp + 1;
      ep = ep - 1;
    }
  }
  return true;
}
palindromeWay1('1000000001');
module.exports = palindrome;
