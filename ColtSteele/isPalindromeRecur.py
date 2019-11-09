"""
Check if a string is a palindrome recursivly

Just going in for the naive approach which is to reverse it 
and then check for equality

ALWAYS STATE YOUR ASSUMTIONS
assuming I am going to ignore capitial letters
"""

def isPalindromeRecur(string):

    def recur(string):
        if len(string) == 0:
            return ""
        #isupper(), islower(), lower(), upper() 
        if string[-1] == ' ':
            return recur(string[0:len(string)-1])

        return string[-1].lower() + recur(string[0:len(string)-1])

    print(recur(string))
    if string.lower().replace(' ','') == recur(string):
        return True
    
    return False

"""
Gonna try to do this with a double pointer method
"""
def isPalindromeRecur2(string):
    string = string.replace(' ','').lower()
    def recur3(string,p1,p2):
        if p1 == p2:
            return True

        if string[p1] == string[p2]:
            p1 += 1
            p2 -= 1
            return recur3(string,p1,p2)# forgot add postional args to this call 
        else:
            return False

   
    return recur3(string,0,len(string) - 1)

if __name__ == "__main__":
    print(isPalindromeRecur("My gym"))
    print(isPalindromeRecur2("My gym"))