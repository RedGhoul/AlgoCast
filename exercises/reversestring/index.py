
def reversestring1(str):
    str = list(str)
    start = 0
    end = len(str) - 1
    for x in range(round(len(str)/2)):
        temp = str[start]
        str[start] = str[end]
        str[end] = temp
        start = start + 1
        end = end - 1
    
    return ''.join(str)

def test_reversestring1():
    assert reversestring1("hellp") == "plleh", "Should be plleh"
    assert reversestring1("abcd") == "dcba", "Should be dcba"
    assert reversestring1('  abcd') == 'dcba  ', "Should be dcba  "
    print(test_reversestring1.__name__ + " Passed")
    
if __name__ == "__main__":
    test_reversestring1()