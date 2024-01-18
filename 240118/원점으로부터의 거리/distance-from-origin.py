from functools import cmp_to_key

def compare(a, b):
    if a.x < 0:
        a.x = -a.x
    if b.x < 0:
        b.x = -b.x
    if a.y < 0:
        a.y = -a.y
    if b.y < 0:
        b.y = -b.y
    
    if a.x + a.y < b.x + b.y:
        return -1
    elif a.x + a.y > b.x + b.y:
        return 1
    else:
        return 0

class point:
    def __init__(self, x, y, num):
        self.x, self.y, self.num = int(x), int(y), int(num)
        
n = int(input())
points = [point(*input().split(), i+1) for i in range(n)]
points.sort(key=cmp_to_key(compare))

for p in points:
    print(p.num)