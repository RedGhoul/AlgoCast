// --- Directions
// Implement classes Node and Linked Lists
// See 'directions' document

class Node {
    // defualt the value of nextNode to null
    constructor(dataIn, nextNode = null) {
        this.data = dataIn;
        this.next = nextNode;
    }
}

class LinkedList {
    constructor(head = null) {
        this.head = head;
    }

    insertFirst(data) {
        if (this.head) {
            // don't need to set the oldheads pointer to null
            // since it will keep getting pushed down, its 
            // next pointer will always be null
            let oldHead = this.head;
            this.head = new Node(data, oldHead);
        } else {
            this.head = new Node(data);
        }
    }

    size() {
        let count = 0;
        let currentHead = this.head;
        while (currentHead) {
            count++;
            currentHead = currentHead.next;
        }
        return count;
    }

    getFirst() {
        return this.head;
    }

    getLast() {
        let currentHead = this.head;

        while (currentHead.next) {
            currentHead = currentHead.next;
        }
        return currentHead;
    }

    clear() {
        this.head = null;
    }

    removeFirst() {
        if (this.head) {
            let newHead = this.head.next;
            let oldHead = this.head
            oldHead.next = null;
            this.head = newHead;
        } else {
            return null;
        }
    }

    removeLast() {
        if (this.head) {
            if (this.head.next == null) {
                this.head = null;
                return;
            }
            let currentNode = this.head;
            let prevNode = null;
            while (currentNode.next) {
                prevNode = currentNode;
                currentNode = currentNode.next;
            }
            prevNode.next = null;
        }
    }

    insertLast(data) {
        if (this.head) {
            let currentNode = this.head;
            while (currentNode.next) {
                currentNode = currentNode.next
            }
            currentNode.next = new Node(data)
        } else {
            this.head = new Node(data);
        }

    }

    getAt(pos) {
        let count = 0;
        let currentNode = this.head;
        if (pos > this.size()) {
            return null;
        } else if (pos === 0) {
            return this.head;
        }
        while (currentNode) {
            currentNode = currentNode.next;
            count++;
            if (pos === count) {
                return currentNode;
            }
        }
        return null;
    }

    removeAt(pos) {
        if (pos >= this.size()) {
            return null;
        } else if (pos === 0) {
            if (this.size() > 1) {
                let oldHead = this.head;
                let newHead = this.head.next;
                this.head = newHead;
                oldHead.next = null;
            } else {
                this.head = null;
            }
            return;
        }
        let count = 0;
        let currentNode = this.head;
        let prevNode = null;
        let nextNode = null;
        while (currentNode) {
            prevNode = currentNode;
            currentNode = currentNode.next
            if (currentNode != null) {
                nextNode = currentNode.next
            }
            count++;
            if (pos === count) {
                currentNode.next = null;
                prevNode.next = nextNode;
                return;
            }
        }
    }

    insertAt(data, pos) {
        if (pos > this.size()) {
            let lastNode = this.getLast();
            lastNode.next = new Node(data);
        } else if (pos === 0) {
            if (this.size() > 1) {
                let oldHead = this.head;
                this.head = new Node(data, oldHead);
            } else {
                this.head = new Node(data);
            }
            return;
        }
        let count = 0;
        let currentNode = this.head;
        let prevNode = null;
        let nextNode = null;
        while (currentNode) {
            prevNode = currentNode;
            currentNode = currentNode.next
            if (currentNode != null) {
                nextNode = currentNode.next
            }
            count++;
            if (pos === count) {
                prevNode.next = new Node(data, currentNode)
                if (currentNode != null) {
                    currentNode.next = nextNode;
                }

                return;
            }
        }
    }

    forEach(fun) {
        let currentNode = this.head;
        while (currentNode) {
            fun(currentNode);
            currentNode = currentNode.next;
        }
    }

    // lets you do a for of loop
    // for (let node of l) {
    //     node.data += 10;
    //   }
    *[Symbol.iterator]() {
        let node = this.head;
        while (node) {
            yield node;
            node = node.next;
        }
    }
}

module.exports = {
    Node,
    LinkedList
};