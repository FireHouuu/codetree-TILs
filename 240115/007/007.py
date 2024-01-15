class spy:
    def __init__(self, sc, mp, time):
        self.sc = sc
        self.mp = mp
        self.time = time
    
sc, mp, time = input().split()
spy1 = spy(sc, mp, time)
print("secret code : {}", format(spy1.sc))
print("meeting poing : {}", format(spy1.mp))
print("time : {}", format(spy1.time))