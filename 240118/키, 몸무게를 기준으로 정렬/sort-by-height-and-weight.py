class person:
    def __init__(self, name, height, weight):
        self.name, self.height, self.weight = name, int(height), int(weight)

n = int(input())
people = [person(*input().split()) for _ in range(n)]
people.sort(key=lambda x: (x.height, -x.weight))

for person in people:
    print(person.name, person.height, person.weight)