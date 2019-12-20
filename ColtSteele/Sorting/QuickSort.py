"""
Implement Quick Sort

Done in two parts. Much in the same way as merge sort.
Meaning there will be a number of recursive calls using
a helper method that is outside the original function. 
"""

"""
This pivot function will choose a pivot point. And then
proceed to put everything less then the pivot on one side.
And then proceed to put everything bigger on the other.
And it will do all of this inplace without using another array.
"""
def pivot(arr, start = 0, end = None):
    if end == None:
        end = len(arr)-1

    try:
        pivotp = arr[start]
    except IndexError:
        print("YOLO")

    pivotindex = start

    for x in range(start+1,len(arr)):
        if pivotp > arr[x]:
            # here if we find something greater then the pivot
            # we increase the pivot index by one. And then proceed
            # to swap the value at the new pivotindex and thing we 
            # just found that is crater than the pivotp
            # we started from start+1 so that we will never touch
            # the pivot point in this loop
            pivotindex+=1
            arr[pivotindex], arr[x] = arr[x], arr[pivotindex]

    # here at the very end, we do our final swap
    # to put the pivot where it belongs, which is where 
    # the pivotindex is pointing to
    arr[start], arr[pivotindex] = arr[pivotindex], arr[start]

    # and here the very last thing we do is return the index
    # of the pivot in the array
    return pivotindex


def QuickSort(arr, start = 0, end = None):
    if end == None:
        end = len(arr) - 1
    


    if start < end:# can not do this since arr size will always be constant - len(arr) != 1:
        pivotIndex = pivot(arr,start,end) # has to be inside base case
        # since what if start > end gets passed to it ?
        # try:
        #     pivotp = arr[start]
        # except IndexError:
        #     print("YOLO")

        # here we are doing the left side of the array
        # everything less then the pivot
        QuickSort(arr,start,pivotIndex-1) #not exactly the pivot index but one less
        # since we only want a subset of the array

        # here we are doing the right side of the array
        # everything greater then the pivot
        QuickSort(arr,pivotIndex+1,end) # this calls not have any absolute values
        # these calls can only ever have the information that is pass to it 
        # so as whats inside pivotindex and end

    return arr


if __name__ == "__main__":
    print(QuickSort([4,86,2,16,5,7,66,36]))
