// --- Directions
// Implement a 'peek' method in this Queue class.
// Peek should return the last element (the next
// one to be returned) from the queue *without*
// removing it.

class Queue {
  constructor() {
    this.data = [];
  }

  add(record) {
    this.data.unshift(record);
  }

  remove() {
    return this.data.pop();
  }

  //another way of doing this by also implementing the peek method
  peek() {
    // just returns the very last thing in the array
    return this.data[this.data.length - 1];
  }
}

module.exports = Queue;
