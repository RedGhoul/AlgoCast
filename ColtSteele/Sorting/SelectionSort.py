"""
Implement SelectionSort

"""

def SelectionSort(arr):

    for y in range(len(arr)):
        small = y
        # you want y to be the place you start from
        for x in range(y,len(arr)):
            if arr[x] < arr[small]:
                small = x
        
        #got to do the swap out here
        arr[y], arr[small] = arr[small], arr[y]
    
    return arr

if __name__ == "__main__":
    print(SelectionSort([2,3,4534,53,6,8,562,12,22]))
        

    
