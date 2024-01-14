m, d = tuple(map(int, input().split()))

def check(m, d):
    m_30 = [4, 6, 9, 11]
    m_31 = [1, 3, 5, 7, 8, 10, 12]
    if m > 12:
        return False
    elif m == 2:
        if d > 28:
            return False
    elif m in m_30:
        if d > 30:
            return False
    elif m in m_31:
        if d > 31:
            return False
    return True

if check(m, d):
    print("Yes")
else: 
    print("No")