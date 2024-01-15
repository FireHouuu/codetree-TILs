n = int(input())
_list = []
for _ in range(n):
    _list.append(input())
_list.sort()

for i in range(n):
    print(_list[i])