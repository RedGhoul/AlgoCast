// --- Directions
// Implement bubbleSort, selectionSort, and mergeSort

function bubbleSort(arr) {
  for (let i = 0; i < arr.length; i++) {
    let newLength = arr.length - i;
    for (let j = 0; j < newLength; j++) {
      if (arr[j] > arr[j + 1]) {
        let temp = arr[j];
        arr[j] = arr[j + 1];
        arr[j + 1] = temp;
      }
    }
  }
  return arr;
}

function selectionSort(arr) {
  return SSort_V2(arr);
}

function SSort_V2(arr) {
  for (let i = 0; i < arr.length; i++) {
    let indexOfMin = i;
    for (let j = i + 1; j < arr.length; j++) {
      if (arr[j] < arr[indexOfMin]) {
        indexOfMin = j;
      }
    }
    if (indexOfMin !== i) {
      let temp = arr[indexOfMin];
      arr[indexOfMin] = arr[i];
      arr[i] = temp;
    }
  }
  return arr;
}

function SSort_V1(arr) {
  let startpoint = 0;
  for (let i = 0; i < arr.length; i++) {
    let currentMin = arr[i];
    let jloopminindex;
    startpoint = i + 1;
    for (let j = startpoint; j < arr.length; j++) {
      if (arr[j] < currentMin) {
        jloopminindex = j; // the place where it was pointing
        currentMin = arr[j];
      }
    }
    if (jloopminindex) {
      let temp = arr[jloopminindex];
      arr[jloopminindex] = arr[i];
      arr[i] = temp;
    }
  }

  return arr;
}

function mergeSort(arr) {}

function merge(left, right) {
  return merge_V2(left, right);
}

//Using some nice js type stuff
function merge_V2(left, right) {
  const results = [];

  while (left.length && right.length) {
    if (left[0] < right[0]) {
      // shift removes the first thing in the array
      results.push(left.shift());
    } else {
      results.push(right.shift());
    }
  }
  // then we just spread everything into a bigger array
  return [...results, ...left, ...right];
}
function merge_V1(left, right) {
  let p1 = 0;
  let p2 = 0;
  let result = [];
  while (left[p1] || right[p2]) {
    if (left[p1] < right[p2]) {
      result.push(left[p1]);
      p1 = p1 + 1;
    } else {
      result.push(right[p2]);
      p2 = p2 + 1;
    }
  }
  if (left[p2]) {
    result.push(...left);
  }
  if (right[p2]) {
    result.push(...right);
  }

  return result;
}

module.exports = { bubbleSort, selectionSort, mergeSort, merge };
