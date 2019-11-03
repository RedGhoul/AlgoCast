"""
Accepts an array of integers and a number called "n". The function should 
calculate the maximum sum of "n" consecutive elements in the array.
Return the max
"""

def maxSubarraySum(arr, n):

    if n > len(arr) or len(arr) == 0:
        return None

    sliceStart = 0
    sliceEnd = n

    highestValue = 0
    while sliceEnd <= len(arr):
        if sum(arr[sliceStart:sliceEnd]) > highestValue:
            highestValue = sum(arr[sliceStart:sliceEnd]) # arr slicing
        
        sliceStart += 1
        sliceEnd += 1
    
    return highestValue

if __name__ == "__main__":
    print(maxSubarraySum([1,2,5,2,8,1,5],2))
    print(maxSubarraySum([1,2,5,2,8,1,5], 4))
    print(maxSubarraySum([4,2,1,6],1))
    print(maxSubarraySum([4,2,1,6,2],4))
    print(maxSubarraySum([],4))

