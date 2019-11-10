"""
Description: Given an array of strings capitalize the first letter 
of each of the string elements of the array
Input: Array of words
Output: Array of same words but capitalized

Asumming:
- One word in every element
"""

def capitalizeFirstRecur(arr,answer=None):

    if answer == None:
        answer = []

    if len(arr) == 0:
        return answer
    else:
        value = arr.pop()
        value = list(value)
        value[0] = value[0].upper()
        value = "".join(value)
        answer.append(value)
        return capitalizeFirstRecur(arr,answer) 
        # Alwyas have to have a return
        # to return what the pervious stack frame returned
        # Or your just not going to return anything and 
        # you'll eand up returning NONE

if __name__ == "__main__":
    print(capitalizeFirstRecur(['car','taco','banana']))