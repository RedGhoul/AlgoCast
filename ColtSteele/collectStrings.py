"""
Description: Given a obj sum up all of its even values
Input: Object
Output: Int
Object Traversal 
"""
class obj3:
    def __init__(self):
        self.inner = "EWEWE"
        self.otherObj = 7
        self.superInner = 2
        self.notANumber = True
        self.alsoNotANumber = "yup2"

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
        self.otherObj = obj2()
        self.otherObj = obj2()

def collectStrings(objectIn):
    allstrings = []
    def recur(objectIn):
        for key,val in objectIn.__dict__.items():
            if  type(val) is str:
                allstrings.append(val)
            elif type(val) is not float and type(val) is not int and type(val) is not bool and type(val) is not tuple and type(val) is not int and type(val) is not list:
                recur(val)
                #return recur(val) 
                # you don't need to use return over here since you 
                # don't need to return anything in general
                # since the way you are collecting them is in global state
                # if you do end up returning once it jumps back, it tries to 
                # get out of the whole function call with that return, and
                # and just ends up returning None.
                # where as if you don't try to return anything, it picks up where it 
                # left off in its loop

        return
            

    print(recur(objectIn))

    return allstrings

if __name__ == "__main__":
    a = obj1()
    print(collectStrings(a))

