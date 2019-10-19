// --- Directions
// 1) Create a node class.  The constructor
// should accept an argument that gets assigned
// to the data property and initialize an
// empty array for storing children. The node
// class should have methods 'add' and 'remove'.
// 2) Create a tree class. The tree constructor
// should initialize a 'root' property to null.
// 3) Implement 'traverseBF' and 'traverseDF'
// on the tree class.  Each method should accept a
// function that gets called with each element in the tree

class Node {
    constructor(datain) {
        this.data = datain;
        this.children = [];
    }
    add(data) {
        this.children.push(new Node(data));
    }

    remove(data) {
        // new school way of doing things
        // filter only returns eles that meet
        // a certain condition

        // in this case we are checking to see if 
        // the data from the node is not equal to
        // the data we are given. If this statement
        // is true then we can just return it into a 
        // new array that holds all the childern
        this.children = this.children.filter(node => {
            return node.data !== data;
        })
    }
    //this is the old school way of doing things without using maps
    removeOld(data) {
        let index = -1;
        for (let i = 0; i < this.children.length; i++) {
            if (this.children[i].data === data) {
                index = i;
                break;
            }
        }

        if (index > -1) {
            // first value for splice is the index
            // second one is the amount to delete
            this.children.splice(index, 1);
        }
    }
}
// const n = new Node('a');
// n.add('b');
// n.children.length
// n.remove('b');
// n.children.length

class Tree {}

module.exports = {
    Tree,
    Node
};