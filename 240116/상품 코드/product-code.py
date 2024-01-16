class goods:
    def __init__(self, name="codetree", code=50):
        self.name = name
        self.code = int(code)

goods1 = goods()
goods2 = goods(*input().split())

print("product", goods1.code, "is", goods1.name)
print("product", goods2.code, "is", goods2.name)