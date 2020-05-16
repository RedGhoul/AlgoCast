"""
Description: Compute the product of an array using recur
Input: Array of ints
output: single int
"""

def arrayProduct(arr):

    if len(arr) == 0: #fail into the trap of not having the right base case
        # forgot to "== 0"
        return 1
    
    return arr[0] * arrayProduct(arr[1:]) #1: is the same thing as splice(1)

if __name__ == "__main__":
    print(arrayProduct([2,2,2,2]))