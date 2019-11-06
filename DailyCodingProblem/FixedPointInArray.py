"""
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

if __name__ == "__main__":
    print(fixedpoint([-6,0,2,40]))
