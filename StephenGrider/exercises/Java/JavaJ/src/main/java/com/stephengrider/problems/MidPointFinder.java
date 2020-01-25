package com.stephengrider.problems;
// --- Directions
// Return the 'middle' node of a linked list.
// If the list has an even number of elements, return
// the node at the end of the first half of the list.
// *Do not* use a counter variable, *do not* retrieve
// the size of the list, and only iterate
// through the list one time.
// --- Example
//   const l = new LinkedList();
//   l.insertLast('a')
//   l.insertLast('b')
//   l.insertLast('c')
//   midpoint(l); // returns { data: 'b' }
public class MidPointFinder {
    public static void main(String[] args){
        LinkedList temp = new LinkedList();

        temp.insertLast("10");
        temp.insertLast("12");
        temp.insertLast("13");
        temp.insertLast("14");
        temp.insertLast("15");
        temp.insertLast("16");
        System.out.println(temp.findMidPoint().getData());

    }

    public static void findMidPoint(LinkedList linkedList){

    }
}
