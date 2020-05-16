"""
838. Push Dominoes - Medium
but in dailycoding problems was ranked easy
https://leetcode.com/problems/push-dominoes/
You are given an string representing the initial conditions of some dominoes. Each element can take one of three values:

L, meaning the domino has just been pushed to the left,
R, meaning the domino has just been pushed to the right, or
., meaning the domino is standing still.
Determine the orientation of each tile when the dominoes stop falling. Note that if a domino receives a force from the left and right side simultaneously, it will remain upright.

For example, given the string .L.R....L, you should return LL.RRRLLL.
                              LL.RRRLLL
Given the string ..R...L.L, you should return ..RR.LLLL.
                 ..RR.LLLL
"""
import math
def fallingDominoes(d):
    """
    In this solution you are building out the answer as you go along
    in a single pass

    Works by looking at the regions in between the Rs and Ls
    and creating a window using two pointers that incompasses them
    then sets the first one to the second one and processed to 
    continuly move the second one from where it was to another R or L
    

    The L would never effect the front of it
    The R would never effect the back of it
    """
    d = list('L' + d + 'R')
    res = []
    i = 0
    for j in range(1, len(d)):
        if d[j] == '.': 
            continue
        # middle is the space between them
        middle = j - i - 1 # we subtract one here since we want to account for the extra L
        
        if i != 0: # but don't add the first one
            # to keep adding to the answer your building
            # it could be an L or a R
            res.append(d[i])
        
        if d[i] == d[j]: 
            # if they are both equal then you know that
            # they will need to be same in between
            res.append(d[i] * middle)
        elif d[i] == 'L' and d[j] == 'R': 
            # if one L and another R then they will never touch
            res.append('.' * middle)
        else:
            """ 
            this is for the other case of R and L
            if its odd then we have to have a single "."
            if its even then we have to fill from both sides of L and R
            if middle is even that mean module 2 is zero which cancels out "."

            rounding up = ceil
            rounding down = floor
            general round off to the nearest whole number = round
            """
            res.append('R' * math.floor(middle / 2) + '.' * (middle % 2) + 'L' * math.floor(middle / 2))
        # then we reset the pointer to its new place
        i = j

    return ''.join(res)
    # spaceCount = 0
    # for x in range(len(string)):
        
    #     if string[x] == 'R':
    #         if spaceCount == 1:
    #             string[x+1] = 'R'
    #             spaceCount = 0
    #         elif spaceCount % 2 == 0:
    #             temp = spaceCount / 2
    #             for x in range(x, x - temp):
    #                 string[x] = 'R'
    #         else:
    #             midp = round(spaceCount / 2)
                

    #     elif string[x] == 'L':
    #         if spaceCount == 1:
    #             string[x-1] = 'L'
    #             spaceCount = 0
    #         elif spaceCount % 2 == 0:
    #             temp = spaceCount / 2
    #             for x in range(x, x - temp):
    #                 string[x] = 'L'
                
    #     else:
    #         spaceCount += 1

        
    # return string

if __name__ == "__main__":
    #..R...L.L, you should return ..RR.LLLL.
    print(fallingDominoes("..R...L.L"))

"""
Result of this
Runtime: 112 ms, faster than 87.47% of Python3 online submissions for Push Dominoes.
Memory Usage: 15.5 MB, less than 25.00% of Python3 online submissions for Push Dominoes.
"""