n = int(input())
_list = list(map(int, input().split()))

def f(_list, n):
    for i in range(n):
        if _list[i] < 0:
            _list[i] = 0 - _list[i]

f(_list, n)
print(' '.join(map(str, _list)))