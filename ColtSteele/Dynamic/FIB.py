"""
Exploring dynamic programming
"""

# Memoizated Solution
def fibs_memo(number, memory =None):

    if memory == None:
        memory = {}
    elif number in memory:
        return memory[number]

    if number <= 0:
        return 0
    if number == 1:
        return 1

    fibs1 = fibs(number-2,memory)+ fibs(number-1,memory) 
    flag = fibs1 in memory
    if flag == False:
        memory[number] = fibs1

    return fibs1

# Tabulation Solution
def fibs_tab(n):
    if n <= 0:
        return 0
    elif n == 1:
        return 1

    final = [0,1]

    for x in range(2, n+1):
        ans = final[x-2] + final[x-1]
        final.append(ans)
    
    return final[n]
if __name__ == "__main__":
    print(fibs_tab(100000))