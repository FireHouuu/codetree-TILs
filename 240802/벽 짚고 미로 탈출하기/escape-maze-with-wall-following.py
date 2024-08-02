n = int(input())
x, y = map(int, input().split())
x -= 1
y -= 1

maze = [
    list(input())
    for _ in range(n)
]

def in_range(a, b):
    return 0 <= a < n and 0 <= b < n

dx = [0, 1, 0, -1]
dy = [1, 0, -1, 0]
time = 0
i = 0

while True:

    if not in_range(x+dx[i], y+dy[i]): 
        time += 1
        break
    elif maze[x+dx[i]][y+dy[i]] == '#':
        i = (i + 3) % 4
    elif maze[x+dx[i]+dx[i+1]][y+dy[i]+dy[i+1]] == '#':
        x += dx[i]
        y += dy[i]
        time += 1
    elif maze[x+dx[i]+dx[i+1]][y+dy[i]+dy[i+1]] == '.':
        i = (i + 1) % 4

print(time)