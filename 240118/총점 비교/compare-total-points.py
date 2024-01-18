class student:
    def __init__(self, name, fist, second, third):
        self.name, self.fist, self.second, self.third = name, int(fist), int(second), int(third)
        
n = int(input())
_class = [student(*input().split()) for _ in range(n)]
_class.sort(key=lambda x: x.fist + x.second + x.third)

for student in _class:
    print(student.name, student.fist, student.second, student.third)