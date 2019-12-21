"""
Implement a Hash Table
"""
class Node:
    def __init__(self, value, key):
        self.value = value
        self.key = key

class HashTable:

    def __init__(self,size=53):
        self.keyMap = [None] * size

    def _hash(self,key):
        total = 0
        WERID_PRIME = 31
        maxRange = min(len(key),100)
        for x in range(0,maxRange):
            char = key[x]
            value = ord(char) - 96
            total = (total * WERID_PRIME + value) % len(self.keyMap)
        
        return total

    def setVal(self,key,value):

        index = self._hash(key)
        if self.keyMap[index] != None:
            self.keyMap[index].append(Node(value,key))
        else:
            self.keyMap[index] = [Node(value,key)]


    def getVal(self,key):
        index = self._hash(key)
        if self.keyMap[index] == None:
            return None
        else:
            for x in self.keyMap[index]:
                if x.key == key:
                    return x
        
        return None


if __name__ == "__main__":
    
    HMs = HashTable()

    HMs.setVal("pink","sony")
    HMs.setVal("green","cards")

    print(HMs.getVal("pink").value)



