n = int(input())
_list = list(map(int, input().split()))
_list.sort()

print(' '.join(map(str, _list)))
print(' '.join(map(str, _list[::-1])))