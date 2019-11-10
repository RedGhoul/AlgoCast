"""
224. Basic Calculator

Implement a basic calculator to evaluate a simple expression string.

The expression string may contain open ( and closing parentheses ), the plus + or minus sign -, non-negative integers and empty spaces .

Example 1:

Input: "1 + 1"
Output: 2
Example 2:

Input: " 2-1 + 2 "
Output: 3
Example 3:

Input: "(1+(4+5+2)-3)+(6+8)"
Output: 23
Note:
You may assume that the given expression is always valid.
Do not use the eval built-in library function.

--------------------------------------------------------------------------------
Given a string consisting of parentheses, single digits, and positive and negative signs, convert the string into a mathematical expression to obtain the answer.

Don't use eval or a similar built-in parser.

For example, given '-1 + (2 + 3)', you should return 4.
                 " ((4+5)+(2+3)) + 4"
"""
def parseHelper(string,x):
    if string[x] == '-' and string[x+1] != ' ':
        return '-' + string[x+1]
    if string[x] == '+' and string[x+1] != ' ':
        return string[x+1]

    return False

def MathParser(string):
    answer = []
    if len(string) == 0:
        return None
    curl = 0
    for x in range(0,len(string)):
        if parseHelper(string,x):
            answer.append(parseHelper(string,x))
        elif string[x] == '(':
            curl = x
        elif string[x] == ')' and curl != 0:
            answer.append(string[curl+1:x])
            curl = 0
        elif x == len(string) - 1 and string[x] != ' ':
            answer.append(string[x])

    final = 0

    for xx in answer:

        if len(xx) > 2:
            xx = xx.replace(' ','')
            for x in range(0,len(xx)):
                if xx[x] == '-' and xx[x+1] != ' ':
                    answer.append('-' + xx[x+1])
                elif xx[x] == '+' and xx[x+1] != ' ':
                    answer.append(xx[x+1])
                elif xx[x] == '(':
                    curl = x
                elif xx[x] == ')':
                    answer.append(xx[curl+1:x])
                elif xx[x] == '+' or xx[x] == ' ':
                    continue
                # elif xx[x] == '-':
                #     answer.append("-" + xx[x+1])
                elif x < len(xx)-1:
                    answer.append(xx[x])


        else:
            final = final + int(xx)

    return final

"""
The other way of doing this based on Geeks for Geeks:
https://www.geeksforgeeks.org/expression-evaluation/
1. While there are still tokens to be read in,
   1.1 Get the next token.
   1.2 If the token is:
       1.2.1 A number: push it onto the value stack.
       1.2.2 A variable: get its value, and push onto the value stack.
       1.2.3 A left parenthesis: push it onto the operator stack.
       1.2.4 A right parenthesis:
         1 While the thing on top of the operator stack is not a
           left parenthesis,
             1 Pop the operator from the operator stack.
             2 Pop the value stack twice, getting two operands.
             3 Apply the operator to the operands, in the correct order.
             4 Push the result onto the value stack.
         2 Pop the left parenthesis from the operator stack, and discard it.
       1.2.5 An operator (call it thisOp):
         1 While the operator stack is not empty, and the top thing on the
           operator stack has the same or greater precedence as thisOp,
           1 Pop the operator from the operator stack.
           2 Pop the value stack twice, getting two operands.
           3 Apply the operator to the operands, in the correct order.
           4 Push the result onto the value stack.
         2 Push thisOp onto the operator stack.
2. While the operator stack is not empty,
    1 Pop the operator from the operator stack.
    2 Pop the value stack twice, getting two operands.
    3 Apply the operator to the operands, in the correct order.
    4 Push the result onto the value stack.
3. At this point the operator stack should be empty, and the value
   stack should have only one value in it, which is the final result
"""

def precedence(op):

    if op == '+' or op == '-':
        return 1
    if op == '*' or op == '/':
        return 2
    return 0

# Function to perform arithmetic
# operations.
def applyOp(a, b, op):

    if op == '+': return a + b
    if op == '-': return a - b
    if op == '*': return a * b
    if op == '/': return a // b

# Function that returns value of
# expression after evaluation.
def evaluate(tokens):

    # stack to store integer values.
    """
    You keep pulling things off and putting them
    back onto the list of values. Such that at the end you
    just have to take the first ele off the list
    """
    values = []

    # stack to store operators.
    # where you store your ops
    ops = []

    i = 0

    while i < len(tokens):

        # ignore white space
        if tokens[i] == ' ':
            i += 1
            continue

        # Current token is an opening
        # brace, push it to 'ops'
        elif tokens[i] == '(':
            ops.append(tokens[i])


        #Used to handle numbers

        elif tokens[i].isdigit():
            val = 0

            """
            This part handles numbers bigger then 9.
            It does this by scanning through the rest of the
            expresstion to see if there are any numbers.
            Then added them together using the place values of each number
            """
            while (i < len(tokens) and tokens[i].isdigit()):

                val = (val * 10) + int(tokens[i])
                i += 1
            # at he very end it added the number it just found
            # into the values list
            values.append(val)


        #Once you have this closing brace you know that know you are going to have to
        #do an operation.

        elif tokens[i] == ')':

            #Your ops array might be looking like ["(","+",")"]
            #So first you check if the there are still ops on the ops list. then also check that
            #the last value in the ops isn't "(" since what you are trying to do. Is figure out
            #if its a "+" or something

            while len(ops) != 0 and ops[-1] != '(':

                # and here you pop out what ever values you have
                val2 = values.pop()
                val1 = values.pop()
                # then pop out a operator like "*"
                op = ops.pop()
                # then add it back on the list
                values.append(applyOp(val1, val2, op))

            # You know you just had a ")" so there is another "(" that you have to get ride of
            ops.pop()

        # Current token is an operator.
        # handles the care if the token is just a straight opertation
        else:

            # While top of 'ops' has same or
            # greater precedence to current
            # token, which is an operator.
            # Apply operator on top of 'ops'
            # to top two elements in values stack.
            # check to see if the last op on the ops list has a greater precidance
            # then the most resent op that you just got passed in as a token
            # if last ops on the list had higher presendance, then start to perform the actions
            while (len(ops) != 0 and precedence(ops[-1]) >= precedence(tokens[i])):

                val2 = values.pop()
                val1 = values.pop()
                op = ops.pop()

                values.append(applyOp(val1, val2, op))

            # if last op on the ops had greater precedence then the gcurrent token
            # Push current token to 'ops'.
            ops.append(tokens[i])

        i += 1

    # Entire expression has been parsed
    # at this point, apply remaining ops
    # to remaining values.
    # do the remaining ops on the lists
    # the contents of ops and values coming from the simplifcation of the exprestion that happend above
    while len(ops) != 0:

        val2 = values.pop()
        val1 = values.pop()
        op = ops.pop()

        values.append(applyOp(val1, val2, op))

    # Top of 'values' contains result,
    # return it.
    return values[-1]


if __name__ == "__main__":
    #print(MathParser('-1 + (2 + 3)'))
    print(MathParser('((4 - 5) + (2 + 3)) + 4'))

    """
    So the main idea of the problem is to keep track of your operations and values
    using two different python lists (stacks). The first being for holding the operations
    and the second to store the values. After looking through the online solutions
    and looking at solution from daily coding problem. the best you can do is O(N) for the space
    and time complexity
    """
    print(evaluate("10 + 2 * 6"))
    print(evaluate("100 * 2 + 12"))
    print(evaluate("100 * ( 2 + 12 )"))
    print(evaluate("100 * ( 2 + 12 ) / 14"))
