"""
Implement Insertion Sort
"""

def InsertionSort(arr):
    p2 = 0
    pp = 1
    answer = []
    if arr[pp] < arr[p2] and 0 == p2:
        arr[pp], arr[p2] = arr[p2], arr[pp]
        p2 += 1
        pp += 1
    while pp < len(arr):

        for x in range(0,p2+1):
            if arr[pp] < arr[x]:
                arr[pp], arr[x] = arr[x],arr[pp]

        pp+=1
        p2+=1

    return arr

if __name__ == "__main__":
    print(InsertionSort([244,1,9,76,4]))


