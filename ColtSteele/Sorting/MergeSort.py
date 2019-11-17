"""
Implement Merge Sort
"""

import math
def MergeSort(arr):

    # the over all function MergeSort is the spliter
    # it keeps on spliting the arrays till
    # they become the size of one
    if len(arr) == 1:
        return arr

    center = math.floor((len(arr)-1)/2)
    leftChunk = arr[0:center+1]
    rightChunk = arr[center+1:len(arr)]# issue was the same center

    # we keep spliting our selves smaller and 
    # smaller till we finally return something
    # and once we do the recursive merge calles
    # spring into action from both merge sort calls
    return merge(MergeSort(leftChunk),MergeSort(rightChunk))


def merge(left,right):
    p1 = 0
    p2 = 0
    answer = []
    
    while p1 < len(left) and p2 < len(right):
        if left[p1] < right[p2]:
            answer.append(left[p1])
            p1 += 1
        else:
            answer.append(right[p2])
            p2 += 1
    # need to put in what left
    # left always goes first since it is
    # what usually holds the smallest values
    while p1 < len(left):
        answer.append(left[p1])
        p1+=1
    # where as right is what holds the bigger 
    # values
    while p2 < len(right):
        answer.append(right[p2])
        p2+=1
    
    return answer

if __name__ == "__main__":
    print(MergeSort([1,2,432,6,457,7,8,4323,4,246,5,2,4,668,4587,4])) 
