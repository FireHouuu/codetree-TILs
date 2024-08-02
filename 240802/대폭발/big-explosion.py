n, m, r, c = map(int, input().split())
grid = [[0 for _ in range(n)] for _ in range(n)]
time_grid = [[0 for _ in range(n)] for _ in range(n)]
dx = [-1, 0, 1, 0]
dy = [0, 1, 0, -1]
r -= 1
c -= 1

def in_range(x, y):
    return 0 <= x < n and 0 <= y < n

def make_bomb(x, y, t):
    for i in range(4):
        step = int(2 ** (t - time_grid[x][y] - 1))
        nx = x + dx[i] * step
        ny = y + dy[i] * step
        if in_range(nx, ny):
            grid[nx][ny] = 1
            time_grid[nx][ny] = t

grid[r][c] = 1
time_grid[r][c] = 0
for time in range(1, m + 1):
    for i in range(n):
        for j in range(n):
            if grid[i][j] == 1 and time_grid[i][j] == time - 1:
                make_bomb(i, j, time)

sum_all = sum(sum(row) for row in grid)
print(sum_all)