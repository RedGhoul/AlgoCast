"""
Implement Radix Sort

No direct Number of compares required. Continously groups numbers
by their digit values, in their different numbers places.
Selected groups are based on base 10 number but can also
be extended to more number systems
"""
import math
# need a function that tells us the digit value at 
# a specific place in a number
def getDigit(num,place):
    # could convert to a string and get the op place
    # could use math, as we do below
    # divide the number by the 10 power of "place"
    # using the modulus so that it returns the reminder of the division
    return math.floor(abs(num)/math.pow(10,place)) % 10

# 10 to what number gives us this number
def digitCount(num):
    if num == 0:
        return 1
    
    return math.floor(math.log10(abs(num))) + 1

#max size of digits in a list
def mostDigits(arr):
    maxsize = 0

    for x in arr:
        temp = digitCount(x)
        if temp > maxsize:
            maxsize = temp
    
    return maxsize

def makeListOfList():
    bucketList = []
    
    for x in range(0,10):
        bucketList.append([])
    
    return bucketList

def RadixSort(arr):
    maxDigits = mostDigits(arr)
    bucketList = makeListOfList()

    for x in range(maxDigits): # range stuff will always be one less
        while len(arr) > 0:
            # only works if you pop 
            #the first thing off the array first
            ints = arr.pop(0) 
            temp = getDigit(ints,x)
            temp2 = bucketList[temp]
            temp2.append(ints)

        for lis in bucketList: # these things can't share the same value
            arr = arr + lis

        bucketList = makeListOfList()


    return arr
        


if __name__ == "__main__":
    print(getDigit(1234,3))
    print(digitCount(1234))
    print(mostDigits([1234,3,5,6,2,3]))
    print(RadixSort([1234,3,5,6,2,3]))
