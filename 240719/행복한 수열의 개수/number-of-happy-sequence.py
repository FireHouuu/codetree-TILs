n, m = map(int, input().split())

grid = [
    list(map(int, input().split()))
    for _ in range(n)
]

output = 0
for i in range(n):
    x = 1 
    y = 1
    for j in range(n-1):
        if x == m:
            output += 1
            x = -1
        if x != -1: 
            if grid[i][j] == grid[i][j+1]:
                x += 1
            else:
                x = 1
        
        if y == m:
            output += 1
            y = -1
        if y != -1:
            if grid[j][i] == grid[j+1][i]:
                y += 1
                if y == m:
                    output += 1
            else:
                y = 1

if n == 1: output = 2
print(output)