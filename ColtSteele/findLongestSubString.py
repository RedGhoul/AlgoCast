"""
Input: a string
Output: a number representing the longest substring's length
Description: Find the length of the longest substring, with all
distinct chars
"""

def findLongestSubString(string):
    if len(string) == 0:
        return 0
    
    uniqueLengths = []

    uniqueCount = 0

    hashmap = {}

    pointer = 0
    point = 0
    stringlen = len(string)-1
    while True:
        
        if pointer > stringlen:
            uniqueLengths.append(uniqueCount)# accounting for the last cycle through
            break

        if string[pointer] in hashmap:
            
            uniqueLengths.append(uniqueCount)
            uniqueCount = 0
            hashmap = {}
            point += 1
            pointer = point
        
        else:
            hashmap[string[pointer]] = 1
            uniqueCount += 1
            pointer += 1

    if len(uniqueLengths) == 0:
        return 0
    else:
        return max(uniqueLengths)

if __name__ == "__main__":
    print(findLongestSubString('')) 
    print(str(findLongestSubString('rithmschool')) + " " + "rithmschool")
    print(str(findLongestSubString('thisisawesome'))+ " " + "thisisawesome") 
    print(str(findLongestSubString('thecatinthehat')) + " " + 'thecatinthehat') 
    print(findLongestSubString('bbbbbbb')) 
    print(findLongestSubString('longestsubstring')) 
    print(findLongestSubString('thisishowwedoit')) 