package com.JavaAlgos.ColtSteele.Recursion;

/**
 * nestedEvenSum
 */
public class nestedEvenSum {
    public static void main(String[] args){
        System.out.println("x");
    }

    /**
     * 
     * I am not sure how to even began to do this problem in java. So I am going to 
     * be describing how to do it in Python. The problem is very similar to the 
     * Flatten Question that was asked before. So you would use helper method recurstion 
     * to get into the nested data structures, figure out what type they were and only
     * add them to the global array if they were even 
     * 
     * 
     * def nestedSum(object):
     *     evenArray = []
     * 
     *     def nestSumHelper(object):
     *         if(object == null) return;
     *         objectProps = object.getProps()
     *         for x in objectProps:
     *             if x is type Int && x % 2 == 0:
     *                evenArray.add(x)
     *             else if x is type object:
     *                nestSumHelper(x)
     * 
     *      nestSumHelper(object)
     * 
     *      return sum(evenArray)
     * 
     */
}