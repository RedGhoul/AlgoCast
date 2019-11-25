"""
Implement a Singly Linked List
"""

class Node:

    def __init__(self,val):
        self.val = val
        self.next = None


class SinglyLinkedList:

    def __init__(self):
        self.head = None
        self.tail = None
        self.length = 0

    def push(self,val):
        newNode = Node(val)
        if self.head == None:
            self.head = newNode
            self.tail = self.head
        
        self.tail.next = newNode
        self.tail = newNode

        self.length+= 1

    def pop(self):
        if self.head == None:
            return None
        
        start = self.head

        while start != None:

            if start.next == self.tail:
                oldTail = self.tail

                self.tail = start # cause you want the second last thing

                self.tail.next = None
                self.length -= 1
                return oldTail
            else:
                start = start.next

        return None

    def shift(self): #taking poping off from the start

        if self.head == None:
            return None

        oldHead = self.head

        self.head = self.head.next
        self.length -= 1
        if self.length == 0:
            self.tail == None

        return oldHead

    def unshift(self,val): # pushing something back ontop of the list
        newNode = Node(val)

        if self.head == None:
            self.head = newNode
            self.tail = newNode
            self.length +=1
            return self.head
        
        newNode.next = self.head
        self.head = newNode
        self.length += 1
        
        return self.head

    def get(self,index):
        if self.length == 0 or index > self.length:
            return None

        if index == 0:
            return self.head

        start = self.head
        count = 0
        while count != index:
            start = start.next
            count += 1
        
        return start

    def set(self, index, val):
        if self.length == 0 or index > self.length:
            return None

        if index == 0:
            self.head.val = val

        start = self.head
        count = 0
        while count != index:
            start = start.next
            count += 1

        start.val = val
        return start

        


    

if __name__ == "__main__":
    
    instancSLL = SinglyLinkedList()
    for x in range(1,11):
        instancSLL.push(x)
    print("start values")
    print( "len " + str(instancSLL.length))
    print(instancSLL.head.val)
    print(instancSLL.tail.val)

    print("Pop values")
    val1 = instancSLL.pop()
    if val1 != None:
        print(val1.val)
        print( "len " + str(instancSLL.length))
        print(instancSLL.head.val)
        print(instancSLL.tail.val)
    
    print("Shift values")
    val1 = instancSLL.shift()
    if val1 != None:
        print(val1.val)
        print( "len " + str(instancSLL.length))
        print(instancSLL.head.val)
        print(instancSLL.tail.val)
    
    print("UnShift values")
    val1 = instancSLL.unshift(99)
    if val1 != None:
        print(val1.val)
        print( "len " + str(instancSLL.length))
        print(instancSLL.head.val)
        print(instancSLL.tail.val)

    print("Get values")
    for x in range(instancSLL.length):
        print(instancSLL.get(x).val)

    print("Set Values")

    for x in range(instancSLL.length):
        instancSLL.set(x,x*2)# x always starts from zero

    for x in range(instancSLL.length):
        print(instancSLL.get(x).val)