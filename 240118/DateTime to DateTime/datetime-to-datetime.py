a, b, c = tuple(map(int, input().split()))

def min_cal(day, hour, minute):
    return (day - 1) * 60 * 24 + hour * 60 + minute

out = min_cal(a, b, c) - min_cal(11, 11, 11)
if out < 0:
    print(-1)
else :
    print(out)