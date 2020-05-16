"""
Write a function called sameFrequency.
Given two positive integers, find out if the two numbers have 
the same frequency of digits.
Your solution MUST have the following complexities:
Time: O(N)
Sample Input:
"""
# using a helper function
def stringToMap(string):
    int2map = {}

    for x in string:
        if x in int2map:
            int2map[x] += 1
        else:
            int2map[x] = 1
    
    return int2map
"""
There is probably another way of doing this in which we don't need to
convert the int into a string. And instead just divide by its different
number columns
"""
def sameFrequency(integer1, integer2):
    integer1 = str(integer1)
    integer2 = str(integer2)

    if len(integer1) != len(integer2):
        return False

    int1map = stringToMap(integer1)
    int2map = stringToMap(integer2)

    for key,value in int1map.items():
        if key in int2map:
            if int2map[key] != value:
                return False
        else:
            return False
    
    return True

if __name__ == "__main__":
    print(sameFrequency(182,281))
    print(sameFrequency(34,14))
    print(sameFrequency(3589578,5879385))
    print(sameFrequency(22,222))



     