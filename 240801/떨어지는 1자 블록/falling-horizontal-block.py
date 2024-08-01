n, m, k = map(int, input().split())
k -= 1
grid = [
    list(map(int, input().split()))
    for _ in range(n)
]

idx = -1
for i in range(n):
    step_check = True
    for j in range(k, k + m):
        if grid[i][j] == 1:
            step_check = False
            break
    if step_check:
        idx += 1
    else:
        break

if idx > -1:
    for j in range(k, k + m):
        grid[idx][j] = 1

for i in range(n):
    for j in range(n):
        print(grid[i][j], end = ' ')
    print()