m1, d1, m2, d2 = tuple(map(int, input().split()))

day_num = [0, 31, 28, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31]
yoil = ["Mon", "Tue", "Wed", "Thu", "Fri", "Sat", "Sun"]

def day_cal(m, d):
    mon_to_day = 0
    for i in range(1, m):
        mon_to_day += day_num[i]
    return mon_to_day + d

idx = day_cal(m2, d2) - day_cal(m1, d1)
print(yoil[idx])