n = int(input())
_list = list(map(int,input().split()))

def f(n, _list):
    for i in range(n):
        if _list[i] % 2 == 0:
            _list[i] //= 2

f(n, _list)
print(' '.join(map(str, _list)))