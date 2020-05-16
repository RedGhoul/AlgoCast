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

def nestedEvenSum(randomObject):
    evenSum = 0;
    def nestedEvenSumHelper(randomObject, evenSum):
        if randomObject == None:
            return
        currentObject = randomObject
        if type(currentObject) is list:
            for x in len(currentObject):
                if currentObject[x] % 2 == 0:
                    evenSum = evenSum + currentObject[x]
        
        if type(currentObject) is int:
            if currentObject % 2 == 0:
                evenSum = evenSum + currentObject

        val = currentObject
        isAnObject = type(val) is not bool and type(val) is not tuple and type(val) is not int and type(val) is not str and type(val) is not list
        if isAnObject is True and len(currentObject.__dict__) > 0:
            for key,value in currentObject.__dict__.items():
                evenSum = nestedEvenSumHelper(value,evenSum)
        
        return evenSum
    
    evenSum = nestedEvenSumHelper(randomObject,evenSum)
    
    return evenSum

    
if __name__ == "__main__":
    a = obj1()
    print(nestedEvenSum(a))

