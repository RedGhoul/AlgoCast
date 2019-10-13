// --- Directions
// Implement a Queue datastructure using two stacks.
// *Do not* create an array inside of the 'Queue' class.
// Queue should implement the methods 'add', 'remove', and 'peek'.
// For a reminder on what each method does, look back
// at the Queue exercise.
// --- Examples
//     const q = new Queue();
//     q.add(1);
//     q.add(2);
//     q.peek();  // returns 1
//     q.remove(); // returns 1
//     q.remove(); // returns 2

const Stack = require('./stack');
/*
 * There is also another way of doing this where, each time after a remove we
 * pop everything off of the outstack and push it all back into the in stack
 */
class Queue {
  constructor() {
    this.InStack = new Stack();
    this.OutStack = new Stack();
  }

  add(n) {
    this.InStack.push(n);
  }

  remove() {
    this.pushOnToOutStack();
    return this.OutStack.pop();
  }

  peek() {
    this.pushOnToOutStack();
    return this.OutStack.peek();
  }

  pushOnToOutStack() {
    if (!this.OutStack.peek()) {
      while (this.InStack.peek()) {
        this.OutStack.push(this.InStack.pop());
      }
    }
  }
}

module.exports = Queue;
