// --- Directions
// Given a node, validate the binary search tree,
// ensuring that every node's left hand child is
// less than the parent node's value, and that
// every node's right hand child is greater than
// the parent
const Node = require('./node');
function validate(node, min = null, max = null) {
  if (max !== null && node.data > max) {
    return false;
  }

  if (min !== null && node.data < min) {
    return false;
  }

  if (node.left && !validate(node.left, min, node.data)) {
    return false;
  }

  if (node.right && !validate(node.right, node.data, max)) {
    return false;
  }

  return true;
}

function diedinaditch() {
  if (node.left != null) {
    if (max != null) {
      if (node.left.data > node.data || node.left.data > max) {
        return false;
      } else {
        if (node.right != null) {
          let mins = min;
          let maxs = max;
          if (node.left.data < mins) {
            mins = node.left.data;
          }
          if (node.right.data > maxs) {
            maxs = node.right.data;
          }
          return validate(node.right, mins, maxs);
        }
      }
    } else {
      if (node.left.data > node.data) {
        return false;
      } else {
        return validate(node.right, node.left.data, node.right.data);
      }
    }
  }
  if (node.right != null) {
    if (node.right.data < node.data || node.right.data < min) {
      return false;
    } else {
      if (node.left != null) {
        let mins = min;
        let maxs = max;
        if (node.left.data < mins) {
          mins = node.left.data;
        }
        if (node.right.data > maxs) {
          maxs = node.right.data;
        }
        return validate(node.left, mins, maxs);
      }
    }
  }
  return true;
}

const n = new Node(10);
n.insert(5);
n.insert(15);
n.insert(0);
n.insert(20);
n.left.left.right = new Node(999);

validate(n);
module.exports = validate;
