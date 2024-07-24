n, m, q = map(int, input().split())

grid = [
    list(map(int, input().split()))
    for _ in range(n)
]

def check(a, b):
    for i in range(m):
        if grid[a][i] == grid[b][i]:
            return True
    return False

def push(floor, flag):
    if flag % 2 == 1:  # 좌측으로 이동
        temp = grid[floor][0]
        for i in range(m-1):
            grid[floor][i] = grid[floor][i+1]
        grid[floor][m-1] = temp
    else:  # 우측으로 이동
        temp = grid[floor][m-1]
        for i in range(m-1, 0, -1):
            grid[floor][i] = grid[floor][i-1]
        grid[floor][0] = temp

for _ in range(q):
    wind = input().strip()
    floor = int(wind[0]) - 1
    if wind[1] == 'L': 
        flag = 1
    else: 
        flag = 0
    
    push(floor, flag)
    up_flag = flag
    down_flag = flag

    # 위쪽으로 전파
    for i in range(floor, 0, -1):
        if check(i, i-1):
            up_flag += 1
            push(i-1, up_flag)
        else:
            break
    
    # 아래쪽으로 전파
    for i in range(floor, n-1):
        if check(i, i+1):
            down_flag += 1
            push(i+1, down_flag)
        else:
            break

# 그리드 출력
for i in range(n):
    for j in range(m):
        print(grid[i][j], end=' ')
    print()