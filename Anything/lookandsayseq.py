"""
Description: Kind of like those find the n number in the fib sequence, except 
its for the look and see sequence.
Input: the nth element in the look and see sequence
Output: the element at that index

The "look and say" sequence is defined as follows: beginning with the term 1, each subsequent term visually describes the digits appearing in the previous term. The first few terms are as follows:

1
11
21
1211
111221
As an example, the fourth term is 1211, since the third term consists of one 2 and one 1.

Given an integer N, print the Nth term of this sequence.
"""


def lookandsayseq(n):
    answers = ["1"]
    count = 0
    while True:
        if count == n-1:
            return answers.pop()

        still = help(answers.pop())
        
        ans = ""
        
        for x in still:
            ans = ans + str(len(x)) + x[0]
        
        answers.append(ans)
        
        count += 1


def help(value):
    ans = []
    p1 = 0
    p2 = 1
    if len(value) == 1:
        return ["11"]
    while True:
        if p2 == len(value):
            ans.append(value[p1] * (p2-p1))
            break
        if value[p1] == value[p2]:
            p2+=1
        else:
            ans.append(value[p1] * (p2-p1))
            p1 = p2
    
    return ans
    
    

if __name__ == "__main__":
    print(lookandsayseq(20))