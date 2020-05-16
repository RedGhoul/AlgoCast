"""
 From cracking the coding interview
 * Given an array of integers, write a method to find indices m and n such that 
 * if you sorted elements m through n, the entire array would be sorted. 
 * Minimize n - m (that is, find the smallest such sequence).
"""

"""function findSortableIndices(arr) {
  let i = 1;
  let max = arr[0];
  let minUnsorted = Number.MAX_VALUE;
  let start, end;

  if (!arr || !arr.length || arr.length === 1) {
    return [];
  }

  while (i < arr.length) {
    if (arr[i] < max) { // this filter out for anything werid that isn't increasing
      if (!start) {
        start = i;
      }
      end = i; // and end up setting out end here
    } else {
      max = arr[i];
    }
    if (start && arr[i] < minUnsorted) { // only starts to look when we get into the unsorted region
      minUnsorted = arr[i];
    }
    ++i;
  }

  if (!start) {
    return [];
  }
// and the first thing that we see that is greater
// means it need to be sorted aginst the smallest thing
// we saw in the unsorted region
  for (let i = 0; i < start; ++i) {
    if (arr[i] > minUnsorted) {
      start = i;
      break;
    }
  }

  return [start, end];
}
"""