m1, d1, m2, d2 = tuple(map(int, input().split()))
A = input()

day_num = [0, 31, 29, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31]
yoil = ["", "Mon", "Tue", "Wed", "Thu", "Fri", "Sat", "Sun"]
idx = 0
for i in range(7):
    if A == yoil[i+1]:
        idx = i+1

def day_cal(m, d):
    mon_to_day = 0
    for i in range(1, m):
        mon_to_day += day_num[i]
    return mon_to_day + d

day_dif = abs(day_cal(m2, d2) - day_cal(m1, d1)) + 1
output = day_dif // 7
if idx <= day_dif % 7:
    output += 1
print(output)