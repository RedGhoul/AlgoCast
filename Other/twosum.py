"""
Given an array of numbers find two numbers that add up to a given value

ex [4,34,23,53,6,4] add up to 10 - you should return a tuple of (4,6)
"""

def findTwoSum(arr,number):
    if len(arr) == 0:
        return None
    if number == None:
        return None
    maps = {}
    for x in arr:
        maps[abs(x-number)] = x
    
    for key in arr:
        if maps[key] != None:
            return (key,maps[key])


if __name__ == "__main__":
    print(findTwoSum([4,34,23,53,6,4],10))