n = int(input())
_list = list(map(int, input().split()))


def gcx(x):
    global n
    cnt = 0
    tmp = []
    if x >= 10:
        out = 1
        for k in range(n):
            out *= _list[k]
        return out
    for i in range(n):
        if _list[i] >= x and _list[i] % x == 0:
            cnt += 1
            tmp.append(i)
    if cnt >= 2:
        for j in tmp:
            _list[j] /= x
        return gcx(x) * x
    else:
        return gcx(x+1)

print(int(gcx(2)))