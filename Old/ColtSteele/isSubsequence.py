"""
Input: two strings
Output: True or False
Description: Checks whether the characters in the first string
appear in order in the second string 
"""

def isSubsequence(sub,string):

    if len(sub) == 0 or len(string) == 0:
        return False

    pointer = 0

    for x in string:
        if sub[pointer] == x:
            if pointer == len(sub) - 1:
                return True
            else:
                pointer += 1

    return False

def isSubsequenceResursive(string1,string2):
    if len(string1) == 0:
        return True # since it would mean we found everything in string 1 in string 2
    
    if len(string2) == 0:
        return False
    
    if string1[0] ==string2[0]:
        return isSubsequenceResursive(string1[1:len(string1)],string2[1:len(string2)])
    
    return isSubsequenceResursive(string1,string2[1:len(string2)])

"""
When ever you do any slicing in python it needs to be using
the ":" operator
"""

if __name__ == "__main__":
    print("isSubsequence")
    print(isSubsequence('hello','hello world'))
    print(isSubsequence('sing','sting'))
    print(isSubsequence('abc','abracadabra'))
    print(isSubsequence('abc','acb')) 

    print("isSubsequenceResursive")
    print(isSubsequenceResursive('hello','hello world'))
    print(isSubsequenceResursive('sing','sting'))
    print(isSubsequenceResursive('abc','abracadabra'))
    print(isSubsequenceResursive('abc','acb'))


