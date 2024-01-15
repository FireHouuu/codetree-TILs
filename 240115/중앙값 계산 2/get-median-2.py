n = int(input())
_list = list(map(int, input().split()))
tmp = []

for i in range(n):
    tmp.append(_list[i])
    tmp.sort()
    if (i+1) % 2 != 0:
        print(tmp[(i+2) // 2 - 1], end=' ')