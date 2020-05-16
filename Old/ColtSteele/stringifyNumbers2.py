class obj3:
    def __init__(self):
        self.inner = 2
        self.otherObj = 7
        self.superInner = 2
        self.notANumber = True
        self.arrayssss = [1,2,3,4,5,6]
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





def isAnObject(val):
    isAnObject = type(val) is not bool and type(val) is not tuple and type(val) is not int and type(val) is not str and type(val) is not list
    return isAnObject

def printHelper(randomObject):
    randomObject = randomObject

    def stringifyNumbers(randomObject):

        if isAnObject(randomObject):
            for key,value in randomObject.__dict__.items():
                if type(value) is int:
                    randomObject.__dict__[key] = str(value)
                elif type(value) is list:
                    for x in range(0,len(value)):# range does not inculde the last thing
                        if isAnObject(value[x]) == False and type(value[x]) is int:
                            value[x] = str(value[x])
                        else:
                            stringifyNumbers(value[x])
                            
                elif isAnObject(value):
                    stringifyNumbers(value)
    
    stringifyNumbers(randomObject)
    print(randomObject)
            

if __name__ == "__main__":
    print(printHelper(obj1()))