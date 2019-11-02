"""
Given an array of ints that have more then one int of a single kind.
Find the one lonely int that does not have a partner
"""
# should take in an array and output a number


def findlonely(arr):
    maps = {}
    for ele in arr:
        if ele in maps: # could also do this -> (ele in maps) == False
            maps[ele] = 1
        else:
            maps[ele] = maps[ele] + 1

    for key, value in maps.items():
        if maps[key] == 1:
            return key

if __name__ == "__main__":
    print(findlonely([4,4,4,5,5,5,6,77,77,33,33]))
