n, m = map(int, input().split())
grid = [[0 for _ in range(m+2)] for _ in range(n+2)]

for i in range(n):
    row = list(map(int, input().split()))
    for j in range(m):
        grid[i+1][j+1] = row[j]

ans = 0
for i in range(n):
    for j in range(m):
        templist = [grid[i+1][j], grid[i+1][j+2], grid[i][j+1], grid[i+2][j+1]]
        templist.sort()
        ans = max(ans, templist[2] + templist[3] + grid[i+1][j+1])

print(ans)