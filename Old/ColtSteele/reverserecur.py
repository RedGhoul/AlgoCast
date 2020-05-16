"""
Reversing a string, but recursivly
"""

def reverseRecur(string):
    if len(string) == 0:
        return ""

    return string[-1] + reverseRecur(string[:len(string)-1])

if __name__ == "__main__":
    print(reverseRecur("factorial"))