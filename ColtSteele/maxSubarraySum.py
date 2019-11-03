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


"""
Another way of doing this would have been to keep a running sum. And a move of the window
would be done through subtracting something from the sum and adding something to the sum.
This way would be more effient then summing stuff for every cross section of the array
"""

def maxSumAlt(arr, n):
    if len(arr) == 0 or n == 0:
        return None

    maxSum = 0
    tempSum = 0
    # range does not include the last thing 
    # if you give it range 0,4 it will go from 0 -> 2
    # creating the starting sum here
    for x in range(0,n): # this is just giving you the index
        maxSum += arr[x]

    tempSum = maxSum
    

    for x in range(n,len(arr)): #range doesn't include the max (thing on the right)
        #        the thing just behind   the thing just infront
        tempSum = tempSum - arr[x - n] + arr[x]
        # if tempSum > maxSum:
        #     maxSum = tempSum
        # you can also do
        maxSum = max(tempSum,maxSum)

    return maxSum


    



if __name__ == "__main__":
    
    print("maxSubarraySum")
    print(maxSubarraySum([1,2,5,2,8,1,5],2))
    print(maxSubarraySum([1,2,5,2,8,1,5], 4))
    print(maxSubarraySum([4,2,1,6],1))
    print(maxSubarraySum([4,2,1,6,2],4))
    print(maxSubarraySum([],4))

    print("maxSumAlt")
    print(maxSumAlt([1,2,5,2,8,1,5], 2))
    print(maxSumAlt([1,2,5,2,8,1,5], 4))
    print(maxSumAlt([4,2,1,6],1))
    print(maxSumAlt([4,2,1,6,2],4))
    print(maxSumAlt([],4))

