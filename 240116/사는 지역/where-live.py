n = int(input())

class info:
    def __init__(self, name, address, region):
        self.name = name
        self.address = address
        self.region = region

people = [info(*input().split()) for _ in range(n)]
people.sort(key=lambda person: person.name)

print("name", people[-1].name)
print("addr", people[-1].address)
print("city", people[-1].region)