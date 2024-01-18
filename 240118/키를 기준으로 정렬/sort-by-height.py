class person:
    def __init__(self, name, height, weight):
        self.name = name
        self.height = int(height)
        self.weight = int(weight)

n = int(input())
people = [person(*input().split()) for _ in range(n)]
people.sort(key=lambda p: p.height)

for person in people:
    print(person.name, person.height, person.weight)