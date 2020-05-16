"""
you can also do this as a push and pop as well where
you push the chars on to a list 
then pop them out and see if they are the same
"""

def palindromedetect(str):
    str = list(str)
    sp = 0
    ep = len(str)-1
    for x in range(round(len(str)/2)):
        if str[ep] != str[sp]:
            return False
        else:
            ep = ep - 1
            sp = sp + 1
    
    return True

def test_palindromedetect():
    assert palindromedetect("aba") == True, "Should be True"
    assert palindromedetect(" aba") == False, "Should be False"
    assert palindromedetect("aba ") == False, "Should be False"
    assert palindromedetect("greetings") == False, "Should be False"
    assert palindromedetect("Fish hsif") == False, "Should be True"
    assert palindromedetect("pennep") == True, "Should be True"

    print(test_palindromedetect.__name__ + " Passed")

if __name__ == "__main__":
    test_palindromedetect()
