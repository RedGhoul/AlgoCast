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

class Solution:
    def numRollsToTarget(self, d: int, f: int, target: int) -> int:
        if d == 0:
            return 0

        if d == 1:
            #linear time
            isFound = 0
            for x in range(1,f+1):
                if x == target:
                    isFound = 1
            
            return isFound
                    
                

        if d == 2:
            countOfWays = 0
            hashmap = {}
            for x in range(1,f+1):
                hashmap[abs(target-x)] = x

            for x in range(1,f+1):
                if x in hashmap:
                    countOfWays += 1

            return countOfWays
        

        for pointer in range(1,f+1):
            varss= 0
            newTarget = target - pointer
            varss += self.numRollsToTarget(d-1, f, newTarget) 

        return varss 


if __name__ == "__main__":
    answer = Solution().numRollsToTarget(30,30,500)
    print(answer)