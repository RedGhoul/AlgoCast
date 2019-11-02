"""
Input is a sorted array
Output is the number of unique values in the array
Constraint is that you need to use only two pointers
could use hashmaps very easily
"""

def countUniqueValuesByPointers(arr):
    #error checking code
    arrlen = len(arr)
    if arrlen == 0:
        return 0
    if arrlen == 1 or arrlen == 2:
        if arr[0] != arr[1]:
            return 2
        else:
            return 1

    uniques = []
    p1 = 0
    p2 = 1
    
    uniques.append(arr[p1])

    while p2 <= arrlen -1:
        if arr[p1] != arr[p2]:
            uniques.append(arr[p2])
        
        p1 += 1
        p2 += 1
    
    return len(uniques)

"""
The other method of doing the same thing that seems like its alot more memeory effient
compare the two pointers if they point to different things. If they do move the first one, 
one forward , then take the second one's value and replace ith with the first ones value
then move forwared with the second one. Second pointer is always moving forward with every 
iteration  
"""
def alturn(arr):
    i = 0
    for x in arr:
        if arr[i] != x:
            i += 1
            arr[i] = x
    
    return i + 1

if __name__ == "__main__":
    print(countUniqueValuesByPointers([1,1,1,1,1,1,2]))
    print(countUniqueValuesByPointers([1,2,3,4,4,4,7,7,12,12,13]))
    print(countUniqueValuesByPointers([]))
    print(countUniqueValuesByPointers([-2,-1,-1,0,1]))

    print(alturn([1,1,1,2,2,3,4,5,5,5,6,7]))
    print(alturn([1,2,3,4,4,4,7,7,12,12,13]))
    print(alturn([-2,-1,-1,0,1]))

