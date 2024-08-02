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
    return 0 <= x < n and 0 <= y < n

def move(x, y, new_sphere):
    temp_max = -1  # 그리드의 값이 음수가 될 수 없다고 가정할 때 -1로 초기화
    dir = 0
    for d in range(4):
        nx, ny = x + dx[d], y + dy[d]
        if in_range(nx, ny) and temp_max < grid[nx][ny]:
            temp_max = grid[nx][ny]
            dir = d
    nx, ny = x + dx[dir], y + dy[dir]
    new_sphere[nx][ny] += 1

for _ in range(t):
    new_sphere = [[0 for _ in range(n)] for _ in range(n)]
    for i in range(n):
        for j in range(n):
            if sphere[i][j] == 1:
                move(i, j, new_sphere)
    
    for i in range(n):
        for j in range(n):
            if new_sphere[i][j] > 1:
                new_sphere[i][j] = 0

    sphere = new_sphere

sphere_num = 0
for i in range(n):
    for j in range(n):
        sphere_num += sphere[i][j]

print(sphere_num)