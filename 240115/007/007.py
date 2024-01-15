class spy:
    def __init__(self, sc, mp, time):
        self.sc = sc
        self.mp = mp
        self.time = time
    
sc, mp, time = input().split()
spy1 = spy(sc, mp, time)
print("secret code :", spy1.sc)
print("meeting point :", spy1.mp)
print("time :", spy1.time)