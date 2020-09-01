def flatten(arr):
    results = []

    def flattenHelper(curArr):
        if curArr == None or len(curArr) == 0:
            return;
        curElement = curArr.pop(0)
        if isinstance(curElement,list):
            flattenHelper(curElement)
        else:
            results.append(curElement)

        flattenHelper(curArr)

    flattenHelper(arr)
    return results;


if __name__ == "__main__":
    print(flatten([1, 2, 3, [4, 5] ]))
    print(flatten([1, [2, [3, 4], [[5]]]]))
    print(flatten([[1],[2],[3]]))
    print(flatten([[[[1], [[[2]]], [[[[[[[3]]]]]]]]]]))
