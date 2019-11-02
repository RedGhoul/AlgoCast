"""
You could probably do with some sort of hash map as well
this style would just save on space
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
    pstart = 0;
    pmove = 1;
    indexlen = len(arr) -1 # len gives you length starting from 1
    # array up to index 6 will give you a len of 7 
    while True:
        if pmove > indexlen and pstart >indexlen:
            return None
        elif pmove > indexlen:
            pstart += 1
            pmove = pstart + 1
        else:
            if arr[pmove] + arr[pstart] == 0:
                return [arr[pmove],arr[pstart]]
            else:
                pmove += 1

if __name__ == "__main__":
    print(sumZero([-3,-2,-1,0,1,2,3]))
    print(sumZero([-3,-6,-45,0,1,-2,2]))


