"""
Description: compute power with a base and expo
Input: base , power
Ouput: base raised to that power
"""

def power1(base,expo):
    if expo == 1:
        return base
        
    return base * power1(base,expo-1)

if __name__ == "__main__":
    print(power1(2,4))