"""
Input: is an array of number and a target avg
Output: is a true or false indicating if we could actually find that avg
Description: given an array of numbers and a target avg, see if there is a 
pair whos avg is the traget avg
"""

def oppcompute(val,avg):
    return (avg*2) - val

def averagePair(arr,taravg):
    if len(arr) == 0:
        return False

    targetMap = {}
    for x in arr:
        targetMap[oppcompute(x,taravg)] = x
    
    for x in arr:
        if x in targetMap:
            return True
    
    return False
"""
Could have used the same method we did in "sumZerosorted"
Forgot to ask if we were dealing with a sorted array or not
"""
if __name__ == "__main__":
    print(averagePair([1,2,3],2.5))
    print(averagePair([1,3,3,5,6,7,10,12,19],8))
    print(averagePair([-1,0,3,4,5,6],4.1))
    print(averagePair([],4))

