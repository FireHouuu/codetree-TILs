n, m = tuple(map(int, input().split()))
_list = list(map(int, input().split()))
result = 0

def f():
    global m, result
    while m > 0:
        result += _list[m-1]
        if m % 2 == 0:
            m //= 2
        else:
            m -= 1
        
f()
print(result)