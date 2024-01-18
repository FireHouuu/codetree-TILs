m1, d1, m2, d2 = tuple(map(int, input().split()))
num_of_days = [0, 31, 28, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31]

def day_cal(m, d):
    m_d = 0
    for i in range(1, m):
        m_d += num_of_days[i]
    return m_d + d

print(day_cal(m2, d2) - day_cal(m1, d1) + 1)