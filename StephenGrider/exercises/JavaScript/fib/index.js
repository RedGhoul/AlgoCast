// --- Directions
// Print out the n-th entry in the fibonacci series.
// The fibonacci series is an ordering of numbers where
// each number is the sum of the preceeding two.
// For example, the sequence
//  [0, 1, 1, 2, 3, 5, 8, 13, 21, 34]
// forms the first ten entries of the fibonacci series.
// Example:
//   fib(4) === 3

function fib(n) {
  return way2(n);
}

// the js memoize way
function memoize(fn) {
  const cache = {};
  return function(...args) {
    if (cache[args]) {
      return cache[args];
    }

    const result = fn.apply(this, args);
    cache[args] = result;

    return result;
  };
}

//recursive
function way1(n) {
  if (n == 1) {
    return 1;
  } else if (n <= 0) {
    return 0;
  }

  return way1(n - 1) + way1(n - 2);
}

// recursive + memoization <- what they really want
function way2(n, arr = {}) {
  if (n in arr) {
    return arr[n];
  } else if (n == 1) {
    arr[n] = 1;
    return 1;
  } else if (n <= 0) {
    arr[n] = 0;
    return 0;
  }

  arr[n] = way2(n - 1, arr) + way2(n - 2, arr);
  return arr[n];
}

//interativly
function way3(n) {
  if (n == 1) {
    return 1;
  }
  n = n - 1;
  let answer = 0;
  let p1 = 0;
  let p2 = 1;
  for (let i = 0; i < n; i++) {
    let temp = p2;
    answer = p1 + p2;
    p2 = answer;
    p1 = temp;
  }
  return answer;
}
//const fib = memoize(way1);

module.exports = fib;
