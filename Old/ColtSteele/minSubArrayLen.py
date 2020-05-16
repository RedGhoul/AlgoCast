"""
Input: one array of positive integers, and a target positive int
Output: min length of a contigous sub array of the original array
Description: find the min length of a contiguous subarray that sums up 
to the target sum

Can be greater then equal to the target
If a single element in the array is bigger or equal 
to then you can return 1
"""

def minSubArrayLen(arr,target):
    if len(arr) == 0:
        return 0

    for x in arr:
        if x >= target:
            return 1
    
    pStart = 0
    pEnd = 1

    sumArrayLens = []
    
    while True:
        if pStart > len(arr) - 1:
            break
        elif pEnd > len(arr):
            pStart += 1
            pEnd = pStart + 1
            continue
        elif sum(arr[pStart:pEnd]) >= target: # greater then or eqauls to are always >=
            sumArrayLens.append(len(arr[pStart:pEnd]))
            
        pEnd += 1
    
    # always check your edge cases
    if len(sumArrayLens) == 0:
        return 0
    else:
        return min(sumArrayLens)

"""
You also could have shrink the array once you found a sub array 
that could sum to the target 
"""
if __name__ == "__main__":
    print(minSubArrayLen([2,3,1,2,4,3],7))
    print(minSubArrayLen([2,1,6,5,4],9))
    print(minSubArrayLen([3,1,7,11,2,9,8,21,62,33,19],52))
    print(minSubArrayLen([1,4,16,22,5,7,8,9,10],39))
    print(minSubArrayLen([1,4,16,22,5,7,8,9,10],55))
    print(minSubArrayLen([4,3,3,8,1,2,3],11))
    print(minSubArrayLen([1,4,16,22,5,7,8,9,10],95))
