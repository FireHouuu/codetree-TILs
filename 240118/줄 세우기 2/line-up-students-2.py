class student:
    def __init__(self, number, height, weight):
        self.number, self.height, self.weight = number, height, weight

n = int(input())
students = []
for i in range(n):
    height, weight = map(int, input().split())  # properly unpack the values
    students.append(student(i+1, height, weight))
students.sort(key=lambda x : (x.height, -x.weight))

for s in students:
    print(s.height, s.weight, s.number)