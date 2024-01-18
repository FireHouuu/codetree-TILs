class student:
    def __init__(self, name, kor, eng, math):
        self.name, self.kor, self.eng, self.math = name, int(kor), int(eng), int(math)

n = int(input())
_list = [student(*input().split()) for _ in range(n)]
_list.sort(key=lambda s:(-s.kor, -s.eng, -s.math))

for student in _list:
    print(student.name, student.kor, student.eng, student.math)