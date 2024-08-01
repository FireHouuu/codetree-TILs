n = int(input())
grid = [
    list(map(int, input().split()))
    for _ in range(n)
]
q, p = map(int, input().split())
q -= 1
p -= 1

def gravity():
    temp = [[0 for _ in range(n)] for _ in range(n)]
    for j in range(n):
        temp_flag = n - 1
        for i in range(n-1, -1, -1):
            if grid[i][j] != 0:
                temp[temp_flag][j] = grid[i][j]
                temp_flag -= 1
    
    for i in range(n):
        for j in range(n):
            grid[i][j] = temp[i][j]

def bomb(i, j, size):
    for k in range(size):
        grid[i+k][j] = 0
        grid[i][j+k] = 0
        grid[i-k][j] = 0
        grid[i][j-k] = 0

bomb(q, p, grid[q][p])
gravity()

for i in range(n):
    for j in range(n):
        print(grid[i][j], end = ' ')
    print()