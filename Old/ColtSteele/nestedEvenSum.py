"""
Description: Given a obj sum up all of its even values
Input: Object
Output: Int
Object Traversal 
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
        self.otherObj2 = obj2()

def nestedEvenSum(objectIn):
    answerSum = [] # have to use a abstract data type since its on the heap
    # if its a primative it lives on the stack
    # so in the recursive call its going to have new version of its self

    def recur(objectIn):    
        for key,val in objectIn.__dict__.items():
            if type(val) is int and val % 2 == 0:
                answerSum.append(val)
            elif type(val) is not bool and type(val) is not tuple and type(val) is not int and type(val) is not str and type(val) is not list:
                recur(val)
            
        return 
            

    recur(objectIn)

    return sum(answerSum)

if __name__ == "__main__":
    a = obj1()
    print(nestedEvenSum(a))

