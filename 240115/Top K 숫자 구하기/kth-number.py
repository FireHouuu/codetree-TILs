n, k = tuple(map(int, input().split()))
_list = list(map(int, input().split()))
_list.sort()

print(_list[k-1])