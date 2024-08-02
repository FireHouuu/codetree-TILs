n = int(input())
x, y = map(int, input().split())
x -= 1
y -= 1
og_x = x
og_y = y

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
    elif maze[x+dx[i]+dx[(i+1)%4]][y+dy[i]+dy[(i+1)%4]] == '#':
        x += dx[i]
        y += dy[i]
        time += 1
    elif maze[x+dx[i]+dx[(i+1)%4]][y+dy[i]+dy[(i+1)%4]] == '.':
        x += dx[i]+dx[(i+1)%4]
        y += dy[i]+dy[(i+1)%4]
        i = (i + 1) % 4
        time += 2
    
    if x == og_x and y == og_y:
        time = -1
        break

print(time)