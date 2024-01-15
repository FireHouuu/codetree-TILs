_id, lv = input().split()
lv = int(lv)

class character:
    def __init__(self, _id="codetree", lv=10):
        self._id = _id
        self.lv = lv
    
character1 = character()
character2 = character(_id, lv)

print("user", character1._id, "lv", character1.lv)
print("user", character2._id, "lv",character2.lv)