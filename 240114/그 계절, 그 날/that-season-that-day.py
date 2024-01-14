y, m, d = tuple(map(int, input().split()))

def yoon(y):
    if y % 4 == 0 and y % 100 == 0 and y % 400 == 0:
        return True
    elif y % 4 == 0 and y % 100 == 0:
        return False
    elif y % 4 == 0:
        return True

def Mcheck(y, m, d):
    m_30 = [4, 6, 9, 11]
    m_31 = [1, 3, 5, 7, 8, 10, 12]

    if m == 2:
        if yoon(y):
            if d > 29:
                return False
        elif d > 28:
            return False
    elif m in m_30:
        if d > 30:
            return False
    elif m in m_31:
        if d > 31:
            return False
    return True


if not Mcheck(y, m, d):
    print(-1)
else:
    if m > 2 and m < 6:
        print("Spring")
    elif m > 5 and m < 9:
        print("Summer")
    elif m > 8 and m < 12:
        print("Fall")
    elif m == 12 or m < 3:
        print("Winter")