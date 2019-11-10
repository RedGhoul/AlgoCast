"""
You have d dice, and each die has f faces numbered 1, 2, ..., f.

Return the number of possible ways (out of fd total ways) modulo 10^9 + 7 to roll the dice so the sum of the face up numbers equals target.



Example 1:

Input: d = 1, f = 6, target = 3
Output: 1
Explanation:
You throw one die with 6 faces.  There is only one way to get a sum of 3.
Example 2:

Input: d = 2, f = 6, target = 7
Output: 6
Explanation:
You throw two dice, each with 6 faces.  There are 6 ways to get a sum of 7:
1+6, 2+5, 3+4, 4+3, 5+2, 6+1.
Example 3:

Input: d = 2, f = 5, target = 10
Output: 1
Explanation:
You throw two dice, each with 5 faces.  There is only one way to get a sum of 10: 5+5.
Example 4:

Input: d = 1, f = 2, target = 3
Output: 0
Explanation:
You throw one die with 2 faces.  There is no way to get a sum of 3.
Example 5:

Input: d = 30, f = 30, target = 500
Output: 222616187
Explanation:
The answer must be returned modulo 10^9 + 7.


Constraints:

1 <= d, f <= 30
1 <= target <= 1000
"""

# def NumberofDiceRollsWithTargetSum(diceNumber, faceNumber, target):
#     if diceNumber == 1:
#         #linear time
#         for x in range(1,faceNumber+1):
#             if x == target:
#                 return 1

#     if diceNumber == 2:
#         countOfWays = 0
#         hashmap = {}
#         for x in range(1,faceNumber+1):
#             hashmap[abs(target-x)] = x

#         for x in range(1,faceNumber+1):
#             if x in hashmap:
#                 countOfWays += 1

#         return countOfWays
#     targetWays = 0

#     for pointer in range(1,faceNumber+1):

#         newTarget = target - pointer

#         targetWays += NumberofDiceRollsWithTargetSum(diceNumber - 1, faceNumber, newTarget)

#     return targetWays



# if __name__ == "__main__":
#     print(NumberofDiceRollsWithTargetSum(1,6,3))
#     print(NumberofDiceRollsWithTargetSum(2,6,7))
#     print(NumberofDiceRollsWithTargetSum(30,30,500))

# class Solution:
#     def numRollsToTarget(self, d: int, f: int, target: int) -> int:
#         if d == 0:
#             return 0

#         if d == 1:
#             #linear time
#             isFound = 0
#             for x in range(1,f+1):
#                 if x == target:
#                     isFound = 1

#             return isFound



#         if d == 2:
#             countOfWays = 0
#             hashmap = {}
#             for x in range(1,f+1):
#                 hashmap[abs(target-x)] = x

#             for x in range(1,f+1):
#                 if x in hashmap:
#                     countOfWays += 1

#             return countOfWays


#         for pointer in range(1,f+1):
#             varss= 0
#             newTarget = target - pointer
#             varss += self.numRollsToTarget(d-1, f, newTarget)

#         return varss


# if __name__ == "__main__":
#     answer = Solution().numRollsToTarget(30,30,500)
#     print(answer)

# x= sum
# n = number of dice
# m = Number of faces
def findWays(numberOfFace,numberofDice,targetSum):
    # Create a list to store results of subproblems. One extra
    # row and column are used for simpilicity (Number of dice
    # is directly used as row index and sum is directly used
    # as column index).
    """
    The entries in 0th row and 0th column
    are never used.
    """
    print("faces " + str(numberOfFace))
    print("dice " + str(numberofDice))
    print("sum " + str(targetSum))
    table = []
    for i in range(numberofDice+1):
        table.append([0]*(targetSum+1))  #Initialize all entries as 0

    print(table) #[[0, 0], [0, 0], [0, 0]]
    #print(table[1])
    mins = min(numberOfFace+1,targetSum+1)
    for j in range(1,mins): #Table entries for only one dice
        table[1][j]=1

    print(table)

    #print(table)
    # Fill rest of the entries in table using recursive relation
    # i: number of dice, j: sum
    # We always start with 2 for the "I" loop
    # since we initalize all the number one rows
    # with what that sume would end up being
    for i in range(2,numberofDice+1):
        for j in range(1,targetSum+1):
            for k in range(1,min(numberOfFace+1,j)):
                table[i][j]+=table[i-1][j-k]

    #print(table)
    #print(dt)
    # Uncomment above line to see content of table

    return table[-1][-1]

if __name__ == "__main__":
    #print(findWays(4,2,1))
    # print(findWays(2,2,3))
    print(findWays(6,3,8))
    # print(findWays(4,2,5))
    # print(findWays(4,3,5))
