n = int(input())
_list = list(map(int, input().split()))

def f(n):
    if n == 0:
        return max(_list[0], _list[1])
    return max(f(n-1), _list[n])

print(f(n-1))