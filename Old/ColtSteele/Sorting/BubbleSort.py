"""
Implement Bubble Sort
"""

def BubbleSort(arr):
    for x in range(len(arr)): # len(arr) already gives you plus one
        # to limit the window that you are 
        # going to go through
        for y in range(len(arr)-x): 
            # the pointer would always keep moving forward
            # to make sure we never go out of bounds (y+1 <= len(arr)-1)
            if y+1 <= len(arr)-1 and arr[y] > arr[y+1]:
                # temp = arr[y+1]
                # arr[y+1] = arr[y]
                # arr[y] = temp

                # the best none thinking way of doing this
                arr[y+1], arr[y] = arr[y], arr[y+1] 

    return arr

if __name__ == "__main__":
    print(BubbleSort([2,3,4534,53,6,8,562,12,22]))
                