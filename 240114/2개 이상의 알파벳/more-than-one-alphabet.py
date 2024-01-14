_str = input()

def check(_str):
    n = len(_str)
    for i in range(n):
        for j in range(i, n):
            if _str[i] != _str[j]:
                return False
    return True

if check(_str):
    print("No")
else: 
    print("Yes")