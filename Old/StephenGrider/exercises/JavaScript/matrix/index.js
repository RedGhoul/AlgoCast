// --- Directions
// Write a function that accepts an integer N
// and returns a NxN spiral matrix.
// --- Examples
//   matrix(2)
//     [[1, 2],
//     [4, 3]]
//   matrix(3)
//     [[1, 2, 3],
//     [8, 9, 4],
//     [7, 6, 5]]
//  matrix(4)
//     [[1,   2,  3, 4],
//     [12, 13, 14, 5],
//     [11, 16, 15, 6],
//     [10,  9,  8, 7]]

function matrix(n) {
  return way1(n);
}
// You can treat an array of arrays just like any other array
function way1(n) {
  finalArray = [];
  for (let i = 0; i < n; i++) {
    finalArray.push([]);
  }

  let maxCol = n - 1;
  let minCol = 0;

  let maxRow = n - 1;
  let minRow = 0;

  let count = 1;
  while (minCol <= maxCol && minRow <= maxRow) {
    for (let i = minCol; i <= maxCol; i++) {
      finalArray[minRow][i] = count;
      count++;
    }
    minRow++;

    for (let i = minRow; i <= maxRow; i++) {
      finalArray[i][maxCol] = count;
      count++;
    }
    maxCol--;

    for (let i = maxCol; i >= minCol; i--) {
      finalArray[maxRow][i] = count;
      count++;
    }
    maxRow--; // you are doing the very last bottom layer
    // for the cycle. that is why you should mark it as done
    // you take it off the block of things your ever need
    // to index into

    for (let i = maxRow; i >= minRow; i--) {
      finalArray[i][minCol] = count;
      count++;
    }
    minCol++; // cause your making the space between the two smaller pointers smaller

    // by adding and subtracting every cycle we end up making it so
    // so that each of the sides end up squeezing together,
    // to form an array that was smaller then the array,
    // we just operated on
  }
  finalArray.forEach(element => {
    console.log(element);
  });
  return finalArray;
}
console.log(way1(4));
module.exports = matrix;
