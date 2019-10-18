// --- Directions
// Given a linked list, return the element n spaces
// from the last node in the list.  Do not call the 'size'
// method of the linked list.  Assume that n will always
// be less than the length of the list.
// --- Examples
//    const list = new List();
//    list.insertLast('a');
//    list.insertLast('b');
//    list.insertLast('c');
//    list.insertLast('d');
//    fromLast(list, 2).data // 'b'

function fromLast(list, n) {
    //n will always be less than the length of the array

    // setup starting pointers
    let fastP = list.head;
    let slowP = list.head;

    // send the first one down the line
    for (let i = 0; i < n; i++) {
        fastP = fastP.next;
    }

    // then move each pointer down the line one by one
    while (fastP.next) {
        slowP = slowP.next;
        fastP = fastP.next;
    }

    // then return the slow pointer if the fast ones next returns null
    return slowP;
}

module.exports = fromLast;