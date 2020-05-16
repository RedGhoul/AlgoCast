"""
Description: Computing the factorial in the iterative and recursive way 
Input: n factorial
Ouput: the factorial of n
"""

def factorialIter(n):
    # input checking
    if n == None or n < 0: 
        return 0

    answer = 1

    for x in range(1,n+1):
        answer *= x

    return answer

def factorialRecur(n):

    if n <= 1:
        return 1
    
    return n * factorialIter(n-1)


if __name__ == "__main__":
    print(factorialIter(4)) # 24
    print(factorialRecur(4))
    print(factorialIter(22)) # 24
    print(factorialRecur(22))