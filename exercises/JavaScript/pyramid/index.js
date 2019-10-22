// --- Directions
// Write a function that accepts a positive number N.
// The function should console log a pyramid shape
// with N levels using the # character.  Make sure the
// pyramid has spaces on both the left *and* right hand sides
// --- Examples
//   pyramid(1)
//       '#'
//   pyramid(2)
//       ' # '
//       '###'
//   pyramid(4)
//      '   #   '
//      '  ###  '
//      ' ##### '
'#######';
function pyramid(n) {
  let maxLayerSize = n + (n - 1);
  for (let layer = 0; layer < n; layer++) {
    let layerp = '';

    let spacing = n - layer - 1;
    for (let y = 0; y < spacing; y++) {
      layerp = layerp + ' ';
    }
    let starspacing = maxLayerSize - spacing * 2;
    for (let y = 0; y < starspacing; y++) {
      layerp = layerp + '#';
    }
    for (let y = 0; y < spacing; y++) {
      layerp = layerp + ' ';
    }
    console.log(layerp);
    layerp = '';
  }
}

module.exports = pyramid;
