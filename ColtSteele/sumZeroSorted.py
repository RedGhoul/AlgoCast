"""
Going from both side of the sorted array.
If I added the two most opposite ie the biggest and smallest
and the value I get from the sum is bigger then zero (the target).
Then I point the end pointer back one to the second biggest
and then try again
Then do the opposite if its smaller then zero
"""

def sumZero(arr):
    print("hello")
    # error checking code
    if len(arr) <= 1:
        return None
    if len(arr) == 2:
        if arr[0] + arr[1] == 0:
            return arr
        else:
            return None

    pStart = 0
    pEnd = len(arr) -1

    while True:
        if pStart > len(arr) - 1 or pEnd < 0:
            return None
        sumVal = arr[pStart] + arr[pEnd]
        if arr[pStart] + arr[pEnd] != 0:
            if sumVal > 0:
                pEnd -= 1
            else:
                pStart += 1
        else:
            return [arr[pStart], arr[pEnd]]
  

if __name__ == "__main__":
    print(sumZero([-33,-23,-1,0,1,24,32]))


