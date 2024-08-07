n, m = map(int, input().split())
grid = [
    list(map(int, input().split()))
    for _ in range(n)
]

dx = [0, 1, 1, 1, 0, -1, -1, -1]
dy = [-1, -1, 0, 1, 1, 1, 0, -1]

def in_range(x, y):
    return 0 <= x < n and 0 <= y < n

def turn():
    for num in range(1, n * n + 1):
        p = 0
        q = 0
        max_num = 0
        go_x = 0
        go_y = 0

        for i in range(n):
            for j in range(n):
                if grid[i][j] == num:
                    p = i
                    q = j
        for i in range(8):
            temp_x = p + dx[i]
            temp_y = q + dy[i]
            if in_range(temp_x, temp_y) and max_num < grid[temp_x][temp_y]:
                go_x = temp_x
                go_y = temp_y
                max_num = grid[temp_x][temp_y]
        grid[p][q] = grid[go_x][go_y]
        grid[go_x][go_y] = num

for _ in range(m):
    turn()

for i in range(n):
    for j in range(n):
        print(grid[i][j], end = ' ')
    print()