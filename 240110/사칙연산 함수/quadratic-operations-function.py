def add(a, c):
    print(f"{a} + {c} = {a + c}")

def minus(a, c):
    print(f"{a} - {c} = {a - c}")

def multi(a, c):
    print(f"{a} * {c} = {a * c}")

def div(a, c):
    print(f"{a} / {c} = {a // c}")

_list = input().split()
a = int(_list[0])
c = int(_list[2])
if _list[1] == "+":
    add(a, c)
elif _list[1] == "-":
    minus(a, c)
elif _list[1] == "*":
    multi(a, c)
elif _list[1] == "/":
    div(a, c)
else:
    print("False")