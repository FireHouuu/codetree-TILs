n, t = map(int, input().split())
a = list(map(int, input().split()))
b = list(map(int, input().split()))
c = list(map(int, input().split()))

for _ in range(t):
    a_temp = a[-1]
    b_temp = b[-1]
    c_temp = c[-1]
    
    # 오른쪽으로 한 칸씩 이동
    for i in range(n-1, 0, -1):
        a[i] = a[i-1]
        b[i] = b[i-1]
        c[i] = c[i-1]
        
    a[0] = c_temp
    b[0] = a_temp
    c[0] = b_temp

for i in range(n):
    print(a[i], end=' ')
print()

for i in range(n):
    print(b[i], end=' ')
print()

for i in range(n):
    print(c[i], end=' ')
print()