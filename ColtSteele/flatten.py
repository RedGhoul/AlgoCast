"""
Very similar to LeetCode - 341. Flatten Nested List Iterator - Medium
https://leetcode.com/problems/flatten-nested-list-iterator/
Given an array of arrays return a new array that has nothing but the values
from the other arrays
Examples:
// flatten([1, 2, 3, [4, 5] ]) // [1, 2, 3, 4, 5]
// flatten([1, [2, [3, 4], [[5]]]]) // [1, 2, 3, 4, 5]
// flatten([[1],[2],[3]]) // [1,2,3]
// flatten([[[[1], [[[2]]], [[[[[[[3]]]]]]]]]]) // [1,2,3]

Pretty sure there is way to do this iteratively as well
"""

def flatten(arr):
    answer = []

    #got an arr , and value
    def recur(arr, value):
        if type(value) is int:
            answer.append(value)
        # okay so if it isn't an int then it's a list so 
        elif type(value) is list:
            # then I call recur on that
            # and I keep calling it till it returns
            # ie the value array becomings zero
            recur(value,value.pop())
        
        if len(arr) == 0:
            return

        # then it goes back to the original arr values and 
        # pops something off and of that and it keeps going
        recur(arr,arr.pop())

    recur(arr,arr.pop())

    return answer

if __name__ == "__main__":
    print(flatten([1, 2, 3, [4, 5] ]))
    print(flatten([1, [2, [3, 4], [[5]]]]))
    print(flatten([[[[1], [[[2]]], [[[[[[[3]]]]]]]]]]))