"""
Description: Given a number add up all the numbers up the number you were given
Input: single Int
Output: single Int all the numbers added up to the input number
"""

def recursiveRange(n):
    if n == 0:
        return 0

    return n + recursiveRange(n-1)


if __name__ == "__main__":
    print(recursiveRange(10)) # yeah its 55

