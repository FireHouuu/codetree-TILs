y = int(input())

def e_nyun(y):
    if y % 4 == 0 and y % 100 == 0 and y % 400 == 0:
        return True
    if y % 4 == 0 and y % 100 == 0:
        return False
    if y % 4 == 0:
        return True
    return False

if e_nyun(y):
    print("true")
else:
    print("false")