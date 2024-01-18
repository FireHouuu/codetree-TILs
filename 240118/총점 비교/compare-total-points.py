from functools import cmp_to_key

class student:
    def __init__(self, name, fist, second, third):
        self.name, self.fist, self.second, self.third = name, int(fist), int(second), int(third)
        
def compare(x, y):
    if x.fist + x.second + x.third > y.fist + y.second + y.third:
        return 1
    elif x.fist + x.second + x.third < y.fist + y.second + y.third:
        return -1
    else:
        return 0

n = int(input())
_class = [student(*input().split()) for _ in range(n)]
_class.sort(key=cmp_to_key(compare))

for student in _class:
    print(student.name, student.fist, student.second, student.third)