"""
EASY - Rating
UTF-8 is a character encoding that maps each symbol to one, two, three, or four bytes.

For example, the Euro sign, €, corresponds to the three bytes 11100010 10000010 10101100. The rules for mapping characters are as follows:

For a single-byte character, the first bit must be zero.
For an n-byte character, the first byte starts with n ones and a zero.
The other n - 1 bytes all start with 10.
Visually, this can be represented as follows.

 Bytes   |           Byte format
-----------------------------------------------
   1     | 0xxxxxxx
   2     | 110xxxxx 10xxxxxx
   3     | 1110xxxx 10xxxxxx 10xxxxxx
   4     | 11110xxx 10xxxxxx 10xxxxxx 10xxxxxx
Write a program that takes in an array of integers representing byte values,
and returns whether it is a valid UTF-8 encoding.

Assumptions: Array given in one big contigous array
"""
import math

# current Solution gives us a O(n)
def UTF8EncodingCheck(arrOfBytes):
    bytelength = 8
    numBytes = math.floor(len(arrOfBytes) / bytelength)

    if numBytes == 0 and arrOfBytes[0] == 0:
        return True
    numberOfOnes = 0
    for x in range(numBytes+1):
        if arrOfBytes[x] == 1:
            numberOfOnes += 1

    if numBytes == numberOfOnes:
        p1 = 8
        p2 = 17
        while p2 <= len(arrOfBytes):
            if arrOfBytes[p1:p2][0] != 1 and arrOfBytes[p1:p2][1] != 0:
                return False
            else:
                p1 = p2 -1
                p2 += 8

    else:
        return False

    return True

"""
Solution of this in the answer uses bit shifting, and assumes that the
input comes in the form of arrays of arrays. Rather then one massive
array of bit.

Note: Learn Bit shifting in Python

Still has the same complexity as your solution. However I think the interviewer
would want to see if you can actually do bit shifting
"""

def valid(data):
    # follows almost the same thing you did expect it checks the first
    # chunck using Bit shifting
    first = data[0]

    if first >> 7 == 0:
        count = 0
    elif first >> 5 == 0b110:
        count = 1
    elif first >> 4 == 0b1110:
        count = 2
    elif first >> 3 == 0b11110:
        count = 3
    else:
        return False

    # then it goes through the rest just like your alog and
    # checks that the first two eles are 10 for the rest of
    # of the chuncks. Aagin using bit shifting
    for byte in data[1:]:
        if byte >> 6 == 0b10:
            count -= 1
        else:
            return False

    return count == 0

if __name__ == "__main__":
    print(UTF8EncodingCheck([1,1,1,1,0,1,1,1,1,0,1,1,1,1,1,1,1,0,1,1,1,1,1,1,1,0,1,1,1,1,1,1]))
