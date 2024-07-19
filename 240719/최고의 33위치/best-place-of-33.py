import sys

input_data = sys.stdin.read().split()

n = int(input_data[0])

grid = []
index = 1
for i in range(n):
    row = [int(input_data[index + j]) for j in range(n)]
    grid.append(row)
    index += n

max_coin = 0;
for i in range(n-2):
    for j in range(n-2):
        temp = 0;
        for a in range(3):
            for b in range(3):
                temp += grid[i+a][j+b]
        max_coin = max(temp, max_coin)

print(max_coin)