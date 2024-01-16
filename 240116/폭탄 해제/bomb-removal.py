class bomb:
    def __init__(self, code, color, second):
        self.code = code
        self.color = color
        self.second = int(second)

bomb1 = bomb(*input().split())

print("code :", bomb1.code)
print("color :", bomb1.color)
print("second :", bomb1.second)