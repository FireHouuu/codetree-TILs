n, r, c = map(int, input().split())
r -= 1
c -= 1
grid = [
    list(map(int, input().split()))
    for _ in range(n)
]

dx = [-1, 1, 0, 0]
dy = [0, 0, -1, 1]

print(grid[r][c], end=' ')
is_dir = True
while is_dir:
    is_dir = False
    max_num = grid[r][c]
    next_r = r
    next_c = c
    for i in range(4):
        nr = r + dx[i]
        nc = c + dy[i]
        if 0 <= nr < n and 0 <= nc < n and max_num < grid[nr][nc]:
            is_dir = True
            max_num = grid[nr][nc]
            next_r = nr
            next_c = nc
            break
    r = next_r
    c = next_c
    if is_dir:
        print(grid[r][c], end=' ')