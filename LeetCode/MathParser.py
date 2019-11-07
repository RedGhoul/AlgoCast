"""
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


if __name__ == "__main__":
    #print(MathParser('-1 + (2 + 3)'))
    print(MathParser('((4 - 5) + (2 + 3)) + 4'))
