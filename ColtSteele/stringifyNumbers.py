"""
Description: Almost the same thing as "nestedEvenSum" except that you are only going to be
looking for numbers
if you find one turn it into a string
Input: object
Output: object
"""
class obj3:
    def __init__(self):
        self.inner = 2
        self.otherObj = 7
        self.superInner = 2
        self.notANumber = True
        self.alsoNotANumber = "yup"

class obj2:
    def __init__(self):
        self.inner = 2
        self.otherObj = obj3()
        self.superInner = 2
        self.notANumber = True
        self.alsoNotANumber = "yup"

class obj1:
    def __init__(self):
        self.outer = 2
        self.otherObj = obj2()
        self.otherObj3 = obj2()
        self.otherObj33 = obj2()

def stringifyNumbers(objectIn):
    answerSum = objectIn # need a global ref to the intial object

    def recur(objectIn):
        for key,val in objectIn.__dict__.items():
            if type(val) is int or type(val) is float:
                objectIn.__dict__[key] = str(val)
            elif type(val) is not bool and type(val) is not tuple and type(val) is not int and type(val) is not str and type(val) is not list:
                recur(val)
        
        return
            

    recur(objectIn)

    return objectIn


if __name__ == "__main__":
    print(stringifyNumbers(obj1()))