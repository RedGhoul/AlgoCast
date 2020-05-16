"""
Given an array of words, return a new array containing each word capitalized
Input: array
Output: array
"""

def capitalizeWords(arr):

    if len(arr) == 0:
        return []

    return [arr[-1].upper()] + capitalizeWords(arr[:-1])

if __name__ == "__main__":
    print(capitalizeWords(["In", "computer", "science", 
    "tree", "traversal", "is", "a", "form", "of", "graph"]))