n = int(input())
_list = list(map(int, input().split()))
_list.sort()

out = 0
for i in range(n):
    out = max(out, _list[i] + _list[2*n-1])
print(out)