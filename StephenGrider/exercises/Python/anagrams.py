"""
 --- Directions
 Check to see if two provided strings are anagrams of eachother.
 One string is an anagram of another if it uses the same characters
 in the same quantity. Only consider characters, not spaces
 or punctuation.  Consider capital letters to be the same as lower case
 --- Examples
   anagrams('rail safety', 'fairy tales') --> True
   anagrams('RAIL! SAFETY!', 'fairy tales') --> False
  anagrams('Hi there', 'Bye there') --> False
"""
# returns true if they are
# returns false if they are not
def anagrams(string1,string2):
    mapString1 = {}
    mapString2 = {}

    for x in string1:
        if x in mapString1:
            mapString1[x] = mapString1[x] + 1
        else:
            mapString1[x] = 1
    
    for x in string2:
        if x in mapString2:
            mapString2[x] = mapString2[x] + 1
        else:
            mapString2[x] = 1
    
    for key,value in mapString1.items():
        if key not in mapString2 or mapString1[key] != mapString2[key]:
            return False
    
    return True

if __name__ == "__main__":
    print(anagrams('rail safety', 'fairy tales'))
    print(anagrams('RAIL! SAFETY!', 'fairy tales'))
    print(anagrams('Hi there', 'Bye there'))