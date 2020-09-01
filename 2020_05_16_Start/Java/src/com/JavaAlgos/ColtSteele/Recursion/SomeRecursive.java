package com.JavaAlgos.ColtSteele.Recursion;

public class SomeRecursive {

    /**
     * This is more a interpreted language type of question Since it requires the
     * use of callbacks.
     * 
     * The question asks the following: Create a recursive function which accepts an
     * array and a callback. The function returns true if a single value in the
     * array returns true, when passed to the callback. Other it returns false.
     * 
     * 
     * The solution in JS turns out to be: // someRecursive([1,2,3,4], isOdd) //
     * true // someRecursive([4,6,8,9], isOdd) // true // someRecursive([4,6,8],
     * isOdd) // false // someRecursive([4,6,8], val => val > 10); // false
     * 
     * const someRecursive = (arr, call) => { //console.log("call(arr[0]):= " +
     * call(arr[0])) //console.log("arr.length === 0 =>" + arr.length === 0)
     * if(arr.length === 0){ //console.log("returning false") return false; }
     * if(call(arr[0])){ //console.log("returning true") return true; } return
     * someRecursive(arr.slice(1),call);
     * 
     * 
     * }
     */

    public static void main(String[] args) {

    }

    public static void findSomeRecursive() {
        return;
    }
}
