"""
"""
import math
def binarySearch(arr,n):

    if len(arr) == 0:
        return None

    start = 0
    end = len(arr) -1

    while start <= len(arr)-1:
        middle = math.floor((end + start) /2)

        if arr[middle] == n:
            return arr[middle]
        elif n > arr[middle]:
            start = middle
        elif n < arr[middle]:
            end = middle

        if end - start == 1:
            start = end

def binarySearchRecur(arr,n):

    start = 0
    end = len(arr) -1
    if end - start == 1:
        start = end
    middle = math.floor((end + start) /2)
    if arr[middle] == n or len(arr) == 0:
        return arr[middle]
    elif n > arr[middle]:
        return binarySearchRecur(arr[middle:end+1],n)
    elif n < arr[middle]:
        return binarySearchRecur(arr[end:middle+1],n)

if __name__ == "__main__":
    print(binarySearch([1,2,3,4,5,6,7,8],8))
    print(binarySearchRecur([1,2,3,4,5,6,7,8],8))
