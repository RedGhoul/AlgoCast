
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

def reverseStringWay2(str):
    reverse = ""

    for x in str:
        reverse = x + reverse

    return reverse

def test_reversestring2():
    assert reverseStringWay2("hellp") == "plleh", "Should be plleh"
    assert reverseStringWay2("abcd") == "dcba", "Should be dcba"
    assert reverseStringWay2('  abcd') == 'dcba  ', "Should be dcba  "
    print(test_reversestring2.__name__ + " Passed")

if __name__ == "__main__":
    test_reversestring1()
    test_reversestring2()