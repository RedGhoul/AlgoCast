"""
Problem: 273
Description: A fixed point in an array is element whose value is equal to its
index.
Input: Array of sorted int
Output: A fixed point if it exists
"""

"""
Time: O(n)
Space: O(n)
"""
def fixedpoint(arr):

    if len(arr) == 0:
        return False

    for x in range(0,len(arr)+1):
        if arr[x] == x:
            return arr[x]

    return False

"""
Time: O(log(n))
Space: O(n)
"""
def helper(arr):
    return (0,len(arr))

def fixedpointBinary(arr, minv = None, maxv = None):
    if minv == None and maxv == None:
        minv = helper(arr)[0]
        maxv = helper(arr)[1]

    if len(arr) == 0:
        return False

    mid = round((maxv-minv) / 2)

    if mid == arr[mid]:
        return mid

    if mid > minv:
        return fixedpointBinary(arr[mid:(maxv+1)],mid,maxv)

    elif mid < minv:
        return fixedpointBinary(arr[minv:(mid+1)],minv,mid)

    return False


if __name__ == "__main__":
    print(fixedpoint([-6,0,2,40]))
    print(fixedpointBinary([-6,0,2,40]))
    print(fixedpointBinary([-6,0,33,33,3,33,40]))
