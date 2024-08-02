n, m, r, c = map(int, input().split())
r -= 1
c -= 1
grid = [[0 for _ in range(n)] for _ in range(n)]
dice = [6, 5, 3, 4, 2]
dx = [0, -1, 0, 0, 1]
dy = [0, 0, 1, -1, 0]
order = input().split()

def in_range(x, y):
    return 0 <= x < n and 0 <= y < n

def roll(dir):
    temp = [dice[i] for i in range(5)]
    temp[0] = dice[dir]
    temp[dir] = 7 - dice[0]
    temp[5 - dir] = dice[0]
    for i in range(5):
        dice[i] = temp[i]

d_num = 0
grid[r][c] = dice[0]

for i in range(m):
    if order[i]== 'L':
        d_num = 3
    elif order[i] == 'R':
        d_num = 2
    elif order[i] == 'U':
        d_num = 1
    elif order[i] == 'D':
        d_num = 4
    if in_range(r + dx[d_num], c + dy[d_num]):
        roll(d_num)
        r += dx[d_num]
        c += dy[d_num]
    grid[r][c] = dice[0]

sum_all = 0
for i in range(n):
    for j in range(n):
        sum_all += grid[i][j]

print(sum_all)