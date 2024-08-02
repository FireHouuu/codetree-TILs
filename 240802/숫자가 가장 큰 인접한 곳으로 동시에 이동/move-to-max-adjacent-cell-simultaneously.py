n, m, t = map(int, input().split())
dx = [-1, 1, 0, 0]
dy = [0, 0, -1, 1]
grid = [
    list(map(int, input().split()))
    for _ in range(n)
]
sphere = [[0 for _ in range(n)] for _ in range(n)]
for _ in range(m):
    x, y = map(int, input().split())
    sphere[x-1][y-1] = 1

def in_range(x, y):
    return 0<= x < n and 0 <= y < n

def move(x, y):
    temp_max = 0
    dir = 0
    for d in range(4):
        if in_range(x + dx[d], y + dy[d]) and temp_max < grid[x + dx[d]][y + dy[d]]:
            temp_max = grid[x + dx[d]][y + dy[d]]
            dir = d
    sphere[x][y] = 0
    sphere[x + dx[dir]][y + dy[dir]] += 1


for _ in range(t):
    for i in range(n):
        for j in range(n):
            if sphere[i][j] == 1:
                move(i, j)
    
    for i in range(n):
        for j in range(n):
            if sphere[i][j] > 1:
                sphere[i][j] = 0

sphere_num = 0
for i in range(n):
    for j in range(n):
        sphere_num += sphere[i][j]

print(sphere_num)