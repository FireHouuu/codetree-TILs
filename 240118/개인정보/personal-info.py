class student:
    def __init__(self, name, height, weight):
        self.name, self.height, self.weight = name, int(height), float(weight)

_class = [student(*input().split()) for _ in range(5)]
name_list = sorted(_class, key=lambda x: x.name)
height_list = sorted(_class, key=lambda x: -x.height)

print("name")
for s in name_list:
    print(s.name, s.height, s.weight)
print()

print("height")
for k in height_list:
    print(k.name, k.height, k.weight)