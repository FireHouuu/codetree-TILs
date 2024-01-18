class student:
    def __init__(self, number, height, weight):
        self.number, self.height, self.weight = int(number), int(height), int(weight)

n = int(input())

_class = []
for i in range(n):
    _class.append(student(i+1, *input().split()))

_class.sort(key=lambda x: (-x.height, -x.weight, x.number))

for s in _class:
    print(s.height, s.weight, s.number)