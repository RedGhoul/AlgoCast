// --- Directions
// Given a linked list, return true if the list
// is circular, false if it is not.
// --- Examples
//   const l = new List();
//   const a = new Node('a');
//   const b = new Node('b');
//   const c = new Node('c');
//   l.head = a;
//   a.next = b;
//   b.next = c;
//   c.next = b;
//   circular(l) // true
const L = require('./linkedlist');
const List = L.LinkedList;
const Node = L.Node;

function circular(list) {
    let fast = list.head;
    let slow = list.head;
    while (fast.next && fast.next.next) {
        // this part should be up here. Since it would always automatically be 
        // set to true ever time the tests ran
        fast = fast.next.next;
        slow = slow.next;
        /**
         * Have to also account for the time when both
         * of them reach the end of the linked list
         * that is not circular.
         * 
         * Well if anyone of these ends up being null
         * then you can assume that it is infact a 
         * non circular list. Since a circular will never 
         * be null 
         */
        if (fast != null && slow != null && fast === slow) {
            return true;
        }

    }
    return false;
}
// const l = new List();
// const a = new Node('a');
// const b = new Node('b');
// const c = new Node('c');

// l.head = a;
// a.next = b;
// b.next = c;
// c.next = null;

// circular(l);
module.exports = circular;