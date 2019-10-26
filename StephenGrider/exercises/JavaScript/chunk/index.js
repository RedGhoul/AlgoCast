// --- Directions
// Given an array and chunk size, divide the array into many subarrays
// where each subarray is of length size
// --- Examples
// chunk([1, 2, 3, 4], 2) --> [[ 1, 2], [3, 4]]
// chunk([1, 2, 3, 4, 5], 2) --> [[ 1, 2], [3, 4], [5]]
// chunk([1, 2, 3, 4, 5, 6, 7, 8], 3) --> [[ 1, 2, 3], [4, 5, 6], [7, 8]]
// chunk([1, 2, 3, 4, 5], 4) --> [[ 1, 2, 3, 4], [5]]
// chunk([1, 2, 3, 4, 5], 10) --> [[ 1, 2, 3, 4, 5]]

function chunk(array, size) {
  return chunkWay3(array, size);
}

function chunkWay3(array, size) {
  const chunked = [];
  let index = 0;

  while (index < array.length) {
    chunked.push(array.slice(index, index + size));
    index += size;
  }
  return chunked;
}

function chunkWay2(array, size) {
  const chunked = [];

  for (let element of array) {
    let piece = chunked[chunked.length - 1];

    if (!piece || piece.length === size) {
      // so we are adding a new chuck in there
      chunked.push([element]);
    } else {
      piece.push(element);
    }
  }
  return chunked;
}
function chunkWay1(array, size) {
  let answer = [];
  let temparr = [];
  if (size === 0) {
    return array;
  }
  let temp = size;
  for (let x = 0; x < array.length; x++) {
    if (x % temp != 0 || x === 0) {
      temparr.push(array[x]);
    } else {
      answer.push(temparr);
      temparr = [];
      temparr.push(array[x]);
    }
  }
  answer.push(temparr);
  return answer;
}

module.exports = chunk;
