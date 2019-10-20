// --- Directions
// 1) Implement the Node class to create
// a binary search tree.  The constructor
// should initialize values 'data', 'left',
// and 'right'.
// 2) Implement the 'insert' method for the
// Node class.  Insert should accept an argument
// 'data', then create an insert a new node
// at the appropriate location in the tree.
// 3) Implement the 'contains' method for the Node
// class.  Contains should accept a 'data' argument
// and return the Node in the tree with the same value.

class Node {
    constructor(data = null, left = null, right = null) {
        this.data = data;
        this.left = left;
        this.right = right;
    }


    contains(data) {
        if (this.data === data) {
            return this;
        }
        if (data > this.data) {
            if (this.right !== null) {
                /**
                 * You always have to keep returning the value 
                 * so the execution can exit. If you do not you
                 * you end up have scenarios where you execution 
                 * keeps running even after you have return something
                 */
                return this.right.contains(data);
            }
            return null;

        }
        if (data < this.data) {
            if (this.left !== null) {
                return this.left.contains(data);
            }
            return null;

        }
        return null;

    }

    insert(data) {
        this.insertRECUR_V2(data);
    }

    insertRECUR_V2(data) {
        if (data < this.data && this.left) {
            /**
             * if the data is less then the current data
             *  and there is something on left then move left 
             */
            this.left.insert(data)
        } else if (data < this.data) {
            this.left = new Node(data)
        } else if (data > this.data && this.right) {
            /**
             * if data is greater then curret data, and 
             * there is still something on the right move right
             */
            this.right.insert(data)
        } else if (data > this.data) {
            this.right = new Node(data)
        }
    }

    insertRECUR(data) {
        if (data > this.data) {
            if (this.right != null) {
                this.right.insert(data);
            } else {
                this.right = new Node(data);
            }
        }

        if (data < this.data) {
            if (this.left != null) {
                this.left.insert(data);
            } else {
                this.left = new Node(data);
            }
        }
    }


    insertINTER(data) {
        let cn = this;
        let oldcn = this;
        while (true) {
            if (data > cn.data) {
                oldcn = cn;
                cn = cn.right
                if (cn === null) {
                    oldcn.right = new Node(data)
                    break;
                }
            }
            if (data < cn.data) {
                oldcn = cn;
                cn = cn.left;
                if (cn === null) {
                    oldcn.left = new Node(data)
                    break;
                }
            }
        }
    }
}
const node = new Node(10);
node.insert(5);
node.insert(15);
node.insert(20);
node.insert(0);
node.insert(-5);
node.insert(3);

node.contains(3)
module.exports = Node;