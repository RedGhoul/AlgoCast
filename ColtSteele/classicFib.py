"""
The question that everyone uses to teach recursion
in school
"""

def fib(n):

    if n == 0:
        return 0
    elif n == 1:
        return 1

    return fib(n-1) + fib(n-2)

if __name__ == "__main__":
    print(fib(300))