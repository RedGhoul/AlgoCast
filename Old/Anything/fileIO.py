"""
Read in a file in the form of (voter_id, candidate_id)
Returns top 3 candidates at any given time
If voter is found more then once, report as fraud

assumptions:
- data is given in massive csv file, but using a generic solution
to experince reading and writing from a file. 
- assuming there is a coma between the two values
- data comes in one big chunk
"""


class votingSystem:

    def __init__(self,fileName):

        self.top = []
        self.HMIndex = {}
        self.HMcandidate = {}
        try:
            self.reader = open(fileName)
        except:
            raise Exception("Could not open file")

    def readInData(self):
        currentLine = self.reader.readline()
        while currentLine != '':
            (voterID,candidateID) = currentLine.split(",")
            voterID = voterID.strip()
            candidateID = candidateID.strip()
            if voterID in self.HMIndex: # need to check if its actually there
                raise Exception(f'Voter Fraud for voter with ID of {voterID} for candidate {candidateID}')
            else: # if it isn't there then I need to do this
                self.HMIndex[voterID] = candidateID
                
            if candidateID in self.HMcandidate:
                self.HMcandidate[candidateID] = self.HMcandidate[candidateID] + 1
            else:
                self.HMcandidate[candidateID] = 1
            currentLine = self.reader.readline()


    def getTop(self):

        topValue = 0
        topKey = ""
        for key, val in self.HMcandidate.items():
            if val > topValue:
                topValue = val
                topKey = key

        del self.HMcandidate[topKey]
        return topKey

    def getTopList(self):
        topList = []
        for x in range(len(self.HMcandidate)):
            topList.append(self.getTop())
        
        return topList


if __name__ == "__main__":
    votingSys = votingSystem(r'C:\Users\Avane\Documents\repos\AlgoCasts\Anything\fileIO.txt')
    votingSys.readInData()
    print(votingSys.getTopList())
            


