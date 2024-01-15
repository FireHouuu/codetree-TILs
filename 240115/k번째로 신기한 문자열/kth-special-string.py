n, k, T = input().split()
n = int(n)
k = int(k)
T_length = len(T)
_list = []

for _ in range(n):
    tmp = input()
    if tmp[:T_length] == T:
        _list.append(tmp)

_list.sort()
print(_list[k-1])